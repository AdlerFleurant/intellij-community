plugins {
  `java-library`
}

dependencies {
  api(project(":uast:uast-java"))
  api(project(":intellij.java.psi"))
  api(project(":intellij.platform.analysis"))
  api(project(":intellij.java.impl"))
}