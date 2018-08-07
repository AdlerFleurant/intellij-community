plugins {
  `java-library`
}

configure<JavaPluginConvention> {
  val sourceSet = sourceSets["main"]
  sourceSet.java.srcDirs.clear()
  sourceSet.java.srcDir("src")
  sourceSet.resources.srcDirs.clear()
}

dependencies {
  api(project(":intellij.platform.ide"))
  api(project(":intellij.platform.vcs.core"))
  api(project(":intellij.platform.diff"))
  implementation(project(":intellij.platform.lang"))
  implementation(Dependencies.microba)
  implementation(Dependencies.StreamEx)
  implementation(Dependencies.jdom)
}