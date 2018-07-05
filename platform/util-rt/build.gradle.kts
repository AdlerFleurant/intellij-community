plugins {
  java
}

configure<JavaPluginConvention>{
  sourceCompatibility = JavaVersion.VERSION_1_5
  targetCompatibility = JavaVersion.VERSION_1_5
  
  val sourceSet = sourceSets["main"]
  sourceSet.java.srcDirs.clear()
  sourceSet.java.srcDir("src")
  sourceSet.resources.srcDirs.clear()
}