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
  implementation(project(":intellij.platform.core"))
  implementation(project(":intellij.platform.ide"))
  implementation(kotlin("reflect"))
  implementation(kotlin("stdlib-jdk8"))
  implementation(Dependencies.Guava)
  implementation(Dependencies.`netty-codec-http`)
}