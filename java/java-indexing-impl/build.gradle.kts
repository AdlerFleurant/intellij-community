plugins {
  `java-library`
  kotlin("jvm") version "1.2.51"
}

configure<JavaPluginConvention> {
  sourceCompatibility = JavaVersion.VERSION_1_10
  targetCompatibility = JavaVersion.VERSION_1_10
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