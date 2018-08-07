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
  api(project(":intellij.platform.diff"))

  implementation(project(":intellij.platform.core"))
  implementation(project(":intellij.platform.ide"))
  implementation(project(":intellij.platform.ide.impl"))
  implementation(project(":intellij.platform.vcs.core"))
  implementation(project(":intellij.platform.vcs"))
  implementation(project(":intellij.platform.lang"))
  implementation(Dependencies.Guava)
}