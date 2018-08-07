plugins {
  `java-library`
  kotlin("jvm")
}

configure<JavaPluginConvention> {
  val sourceSet = sourceSets["main"]
  sourceSet.java.srcDirs.clear()
  sourceSet.java.srcDir("src")
  sourceSet.java.srcDir("gen")
  sourceSet.resources.srcDirs.clear()
  sourceSet.resources.srcDir("resources")
}

dependencies {
  implementation(project(":intellij.spellchecker"))
  implementation(project(":intellij.platform.core"))
  implementation(project(":intellij.platform.ide"))
  implementation(project(":intellij.platform.lang.impl"))
  implementation(Dependencies.Guava)
  implementation(Dependencies.gson)
}
