plugins {
  `java-library`
}

configure<JavaPluginConvention> {
  sourceCompatibility = JavaVersion.VERSION_1_10
  targetCompatibility = JavaVersion.VERSION_1_10

  val sourceSet = sourceSets["main"]
  sourceSet.java.srcDirs.clear()
  sourceSet.java.srcDir("src")
  sourceSet.resources.srcDirs.clear()
}

dependencies {
  api(project(":intellij.platform.indexing"))
  api("be.cyberelf.nanoxml", "nanoxml", "2.2.3")

  implementation(project(":intellij.platform.core.impl"))
  implementation(project(":intellij.platform.projectModel.impl"))
}