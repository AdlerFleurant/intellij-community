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
  api(project(":intellij.xml.psi"))
  api(project(":intellij.xml.analysis"))
  api(project(":intellij.xml.structureView"))

  implementation(project(":intellij.platform.lang"))
  implementation(kotlin("reflect"))
  implementation(kotlin("stdlib-jdk8"))
}