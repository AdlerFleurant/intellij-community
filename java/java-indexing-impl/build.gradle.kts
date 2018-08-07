plugins {
  `java-library`
  kotlin("jvm")
}

dependencies {
  api(project(":intellij.java.psi"))
  api(project(":intellij.java.psi.impl"))
  api(project(":intellij.platform.indexing"))
  api(project(":intellij.platform.indexing.impl"))
  api(project(":intellij.platform.projectModel"))
  api(project(":intellij.java.indexing"))

  implementation(project(":intellij.platform.projectModel.impl"))
  implementation(kotlin("reflect"))
  implementation(kotlin("stdlib-jdk8"))
  implementation(Dependencies.Guava)
}