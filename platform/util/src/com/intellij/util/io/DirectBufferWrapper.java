/*
 * Copyright 2000-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intellij.util.io;

import com.intellij.ReviseWhenPortedToJDK;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.util.SystemInfo;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

abstract class DirectBufferWrapper extends ByteBufferWrapper {
  protected static final Logger LOG = Logger.getInstance("#com.intellij.util.io.DirectBufferWrapper");

  private volatile ByteBuffer myBuffer;
  private static Method cleanMethod;

  static {
    try {
      cleanMethod = Class.forName("java.lang.ref.Cleaner$Cleanable").getDeclaredMethod("clean");
    }
    catch (ClassNotFoundException | NoSuchMethodException e) {
      throw new Error(e);
    }
  }

  DirectBufferWrapper(final File file, final long offset, final long length) {
    super(file, offset, length);
  }

  @Override
  public ByteBuffer getCachedBuffer() {
    return myBuffer;
  }

  @Override
  public ByteBuffer getBuffer() throws IOException {
    ByteBuffer buffer = myBuffer;
    if (buffer == null) {
      myBuffer = buffer = create();
    }
    return buffer;
  }

  protected abstract ByteBuffer create() throws IOException;

  @Override
  public void unmap() {
    if (isDirty()) flush();
    if (myBuffer != null) disposeDirectBuffer(myBuffer);
    myBuffer = null;
  }

  @ReviseWhenPortedToJDK("9")
  // return true if successful
  static boolean disposeDirectBuffer(final ByteBuffer buffer) {
    if (!buffer.isDirect()) return true;
    if (SystemInfo.IS_AT_LEAST_JAVA9) {
      // in JDK9 the "official" dispose method is sun.misc.Unsafe#invokeCleaner
      // since we have to target both jdk 8 and 9 we have to use reflection
      //TODO: check this later
      try {
        Method cleanerMethod = buffer.getClass().getMethod("cleaner");

        Object cleaner = cleanerMethod.invoke("cleaner");
        cleanMethod.invoke(cleaner);
        return true;
      }
      catch (Exception e) {
        // something serious, needs to be logged
        LOG.error(e);
        throw new RuntimeException(e);
      }
    }
    return false;
  }
}