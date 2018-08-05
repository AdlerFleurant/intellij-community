// Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.intellij.ant;

/**
 * This ant task is used to instrument compiled classes with idea
 * extensions without compiling java sources.
 */
public class InstrumentIdeaExtensions extends Javac2 {
    /**
     * Customize behavior of {@link Javac2} disabling compilation of java classes.
     *
     * @return false, meaning that java classes are not compiled
     * @see Javac2#areJavaClassesCompiled()
     */
    protected boolean areJavaClassesCompiled() {
        return false;
    }
}
