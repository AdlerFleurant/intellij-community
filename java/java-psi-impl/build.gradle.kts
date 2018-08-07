plugins {
  `java-library`
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
  api(project(":intellij.java.psi"))
  api(project(":intellij.platform.core.impl"))

  implementation(project(":intellij.java.resources.en"))
  implementation(Dependencies.asm)
  implementation(Dependencies.Guava)
  implementation(Dependencies.StreamEx)
}