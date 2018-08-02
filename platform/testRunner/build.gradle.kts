plugins {
  `java-library`
  kotlin("jvm") version "1.2.51"
}

configure<JavaPluginConvention> {
  sourceCompatibility = JavaVersion.VERSION_1_10
  targetCompatibility = JavaVersion.VERSION_1_10

  val sourceSet = sourceSets["main"]
  sourceSet.java.srcDirs.clear()
  sourceSet.java.srcDir("src")
  sourceSet.java.srcDir("gen")
  sourceSet.resources.srcDirs.clear()
  sourceSet.resources.srcDir("resources")
}

dependencies {
  implementation(project(":intellij.platform.ide"))
  implementation(project(":intellij.platform.ide.impl"))
  implementation(project(":intellij.platform.debugger"))
  implementation(project(":intellij.platform.lang.impl"))
  implementation(project(":intellij.platform.diff.impl"))
}
