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
  implementation(project(":intellij.platform.vcs"))
  implementation(project(":intellij.platform.vcs.impl"))
  implementation(project(":intellij.platform.lvcs"))
  implementation(project(":intellij.platform.lang"))
  implementation(project(":intellij.platform.ide.impl"))
  implementation(project(":intellij.platform.diff"))
  implementation(Dependencies.picocontainer)
}