plugins {
  `java-library`
}

configure<JavaPluginConvention> {
  val sourceSet = sourceSets["main"]
  sourceSet.java.srcDirs.clear()
  sourceSet.resources.srcDirs.clear()
  sourceSet.resources.srcDir("old_icons_src")
  sourceSet.resources.srcDir("src")
}