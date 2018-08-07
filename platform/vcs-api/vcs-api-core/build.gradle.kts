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
  implementation(project(":intellij.platform.core"))
  implementation(project(":intellij.platform.editor"))
  implementation(project(":intellij.platform.diff"))
  implementation(Dependencies.`jetbrains-annotations-java5`)
}