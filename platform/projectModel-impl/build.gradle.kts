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
  api(project(":intellij.platform.projectModel"))
  api(project(":intellij.platform.jps.model.serialization"))

  implementation(project(":intellij.platform.core.impl"))
  implementation(project(":intellij.platform.jps.model"))
  implementation(project(":intellij.platform.jps.model.impl"))
  implementation(kotlin("reflect"))
  implementation(kotlin("stdlib-jdk8"))
  implementation(Dependencies.`jetbrains-annotations-java5`)
}