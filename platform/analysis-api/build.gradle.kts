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
  api(project(":intellij.platform.editor"))

  implementation(project(":intellij.platform.util"))
  implementation(project(":intellij.platform.extensions"))
  implementation(project(":intellij.platform.core"))
  implementation(project(":intellij.platform.projectModel"))
  implementation(Dependencies.jdom)
}