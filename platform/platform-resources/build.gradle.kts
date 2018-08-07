plugins {
  `java-library`
}

configure<JavaPluginConvention> {
  val sourceSet = sourceSets["main"]
  sourceSet.java.srcDirs.clear()
  sourceSet.resources.srcDirs.clear()
  sourceSet.resources.srcDir("src")
}

dependencies{
  implementation(project(":intellij.platform.util"))
  runtimeOnly(project(":intellij.platform.lvcs.impl"))
  runtimeOnly(project(":intellij.json"))
}