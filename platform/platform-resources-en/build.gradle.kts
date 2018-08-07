plugins {
  java
}

configure<JavaPluginConvention> {
  val sourceSet = sourceSets["main"]
  sourceSet.java.srcDirs.clear()
  sourceSet.resources.srcDirs.clear()
  sourceSet.resources.srcDir("src")
}