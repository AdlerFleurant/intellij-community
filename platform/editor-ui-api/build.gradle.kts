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
  implementation(project(":intellij.platform.util"))
  implementation(project(":intellij.platform.projectModel"))
  implementation(project(":intellij.platform.indexing"))
  implementation(kotlin("reflect"))
  implementation(kotlin("stdlib-jdk8"))
  implementation(Dependencies.`jetbrains-annotations-java5`)
  implementation(Dependencies.jdom)
}