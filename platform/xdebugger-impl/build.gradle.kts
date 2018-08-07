plugins {
  `java-library`
  kotlin("jvm")
}

configure<JavaPluginConvention> {
  val sourceSet = sourceSets["main"]
  sourceSet.java.srcDirs.clear()
  sourceSet.java.srcDir("src")
  sourceSet.resources.srcDirs.clear()
}

dependencies {
  implementation(project(":intellij.platform.debugger"))
  implementation(project(":intellij.platform.lang.impl"))
  implementation(project(":intellij.platform.resources"))
  implementation(project(":intellij.platform.diff"))
}