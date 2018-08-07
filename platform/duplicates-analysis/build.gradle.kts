plugins {
  `java-library`
}

configure<JavaPluginConvention> {
  val sourceSet = sourceSets["main"]
  sourceSet.java.srcDirs.clear()
  sourceSet.java.srcDir("src")
  sourceSet.resources.srcDirs.clear()
  sourceSet.resources.srcDir("resources")
}

dependencies {
  api(project(":intellij.platform.indexing"))
  api(project(":intellij.platform.util"))
  api(project(":intellij.platform.extensions"))
  api(project(":intellij.platform.analysis.impl"))
  api(project(":intellij.platform.projectModel"))
  api(project(":intellij.platform.projectModel.impl"))
  api(Dependencies.`jetbrains-annotations-java5`)
  implementation(Dependencies.XStream)
}