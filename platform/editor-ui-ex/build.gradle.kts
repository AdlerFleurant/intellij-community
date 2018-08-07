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
  api(project(":intellij.platform.util"))
  api(project(":intellij.platform.core.impl"))
  api(project(":intellij.platform.editor"))
  api(Dependencies.`jetbrains-annotations-java5`)
  
  implementation(project(":intellij.platform.indexing.impl"))
  implementation(project(":intellij.platform.projectModel.impl"))
  implementation(project(":intellij.platform.projectModel"))
}