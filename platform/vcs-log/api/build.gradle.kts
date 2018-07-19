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
  api(project(":intellij.platform.vcs.log.graph"))

  implementation(project(":intellij.platform.core"))
  implementation(project(":intellij.platform.editor"))
  implementation(project(":intellij.platform.util.rt"))
  implementation(project(":intellij.platform.vcs"))
  implementation(project(":intellij.platform.vcs.core"))
}