plugins {
  `java-library`
}

dependencies {
  api(project(":intellij.platform.structureView.impl"))

  implementation(project(":intellij.java.psi.impl"))
}