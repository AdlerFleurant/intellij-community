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
  api(project(":intellij.platform.core"))

  implementation(project(":intellij.platform.projectModel"))
  implementation(Dependencies.NanoXML)
  implementation(Dependencies.jdom)
}