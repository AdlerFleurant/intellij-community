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
  implementation(project(":intellij.spellchecker"))
  implementation(project(":intellij.platform.core"))
  implementation(project(":intellij.platform.ide"))
  implementation(project(":intellij.platform.lang.impl"))
  implementation("com.google.guava", "guava", "25.1-jre")
  implementation("com.google.code.gson", "gson", "2.8.5")
}
