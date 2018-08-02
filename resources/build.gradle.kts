plugins {
  `java-library`
}

configure<JavaPluginConvention> {
  sourceCompatibility = JavaVersion.VERSION_1_10
  targetCompatibility = JavaVersion.VERSION_1_10

  val sourceSet = sourceSets["main"]
  sourceSet.java.srcDirs.clear()
  sourceSet.resources.srcDirs.clear()
  sourceSet.resources.srcDir("src")
}

dependencies {
  api(project(":intellij.platform.resources"))
  api(project(":intellij.regexp"))
  api(project(":intellij.platform.images"))

  implementation(project(":intellij.idea.community.resources"))
  implementation(project(":intellij.platform.util"))
  implementation(project(":intellij.platform.resources.en"))
}