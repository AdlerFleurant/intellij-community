// Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
dependencies {
  "api"(project(":uast:uast-common"))
  
  "implementation"(project(":intellij.java.psi"))
  "implementation"(project(":intellij.java.psi.impl"))
  "implementation"(kotlin("reflect"))
  "implementation"(kotlin("stdlib-jdk8"))
}