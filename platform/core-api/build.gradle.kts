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
  api(project(":intellij.platform.util"))
  api(project(":intellij.platform.extensions"))
  api(project(":intellij.platform.resources.en"))
  api(Dependencies.picocontainer)

  implementation(project(":intellij.platform.resources.en"))
  implementation(Dependencies.automaton)
  implementation(Dependencies.jdom)
}