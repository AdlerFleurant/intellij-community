/*
 * Copyright 2000-2014 JetBrains s.r.o.
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
package com.intellij.ide.ui.laf.darcula.ui;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicMenuItemUI;
import java.awt.*;
import java.awt.event.MouseEvent;

/**
 * @author Konstantin Bulenkov
 */
public class DarculaMenuItemUIBase extends BasicMenuItemUI {
  @SuppressWarnings({"MethodOverridesStaticMethodOfSuperclass", "UnusedDeclaration"})
  public static ComponentUI createUI(JComponent c) {
    return new DarculaMenuItemUIBase();
  }

  public void processMouseEvent(JMenuItem item, MouseEvent e, MenuElement[] path, MenuSelectionManager manager) {
    Point p = e.getPoint();
    if (p.x >= 0 && p.x < item.getWidth() &&
        p.y >= 0 && p.y < item.getHeight()) {
      if (e.getID() == MouseEvent.MOUSE_RELEASED) {
        manager.clearSelectedPath();
        item.doClick(0);
        item.setArmed(false);
      }
      else {
        manager.setSelectedPath(path);
      }
    }
    else if (item.getModel().isArmed()) {
      MenuElement[] newPath = new MenuElement[path.length - 1];
      int i, c;
      for (i = 0, c = path.length - 1; i < c; i++) {
        newPath[i] = path[i];
      }
      manager.setSelectedPath(newPath);
    }
  }
}
