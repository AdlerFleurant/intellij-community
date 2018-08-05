plugins {
  `java-library`
}

configure<JavaPluginConvention> {
  sourceCompatibility = JavaVersion.VERSION_1_10
  targetCompatibility = JavaVersion.VERSION_1_10
}

dependencies {
  api(project(":intellij.platform.uast"))
  api(project(":intellij.java.psi"))
  api(project(":intellij.platform.analysis"))
  api(project(":intellij.java.impl"))
}