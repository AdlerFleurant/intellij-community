plugins {
  java
}

configure<JavaPluginConvention> {
  sourceCompatibility = JavaVersion.VERSION_1_5
  targetCompatibility = JavaVersion.VERSION_1_5

  val sourceSet = sourceSets["main"]
  sourceSet.java.srcDirs.clear()
  sourceSet.resources.srcDirs.clear()
  sourceSet.resources.srcDir("src")
}