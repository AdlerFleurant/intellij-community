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
  implementation(project(":intellij.platform.ide"))
  implementation(project(":intellij.platform.vcs"))
  implementation(Dependencies.jdom)
}