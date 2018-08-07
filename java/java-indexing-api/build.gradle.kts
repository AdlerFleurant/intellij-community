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
  implementation(project(":intellij.platform.core"))
  implementation(project(":intellij.platform.indexing"))
  implementation(project(":intellij.java.psi"))
}