plugins {
  `java-library`
  kotlin("jvm")
}

configure<JavaPluginConvention> {
  val sourceSet = sourceSets["main"]
  sourceSet.java.srcDirs.clear()
  sourceSet.java.srcDir("src")
  sourceSet.resources.srcDirs.clear()
  sourceSet.resources.srcDir("resources")
}

dependencies {
  implementation(project(":intellij.platform.ide"))
  implementation(project(":intellij.platform.remoteServers"))
  implementation(project(":intellij.platform.core.impl"))
  implementation(project(":intellij.platform.lang"))
  implementation(project(":intellij.platform.lang.impl"))
  implementation(project(":intellij.platform.debugger"))
}
