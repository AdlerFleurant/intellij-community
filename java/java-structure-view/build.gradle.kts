plugins {
  `java-library`
}

configure<JavaPluginConvention> {
  sourceCompatibility = JavaVersion.VERSION_1_10
  targetCompatibility = JavaVersion.VERSION_1_10
}

dependencies {
  api(project(":intellij.platform.structureView.impl"))

  implementation(project(":intellij.java.psi.impl"))
}