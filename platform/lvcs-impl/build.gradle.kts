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
  sourceSet.resources.srcDirs.clear()
  sourceSet.resources.srcDir("resources")
}

repositories {
  jcenter()
  maven("http://dl.bintray.com/jetbrains/intellij-third-party-dependencies")
}

dependencies {
  implementation(project(":intellij.platform.vcs"))
  implementation(project(":intellij.platform.vcs.impl"))
  implementation(project(":intellij.platform.lvcs"))
  implementation(project(":intellij.platform.lang"))
  implementation(project(":intellij.platform.ide.impl"))
  implementation(project(":intellij.platform.diff"))
  implementation("org.picocontainer", "picocontainer", "1.2")
}