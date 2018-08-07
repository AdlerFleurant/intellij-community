plugins {
  `java-library`
}

configure<JavaPluginConvention> {
  val mainSourceSet = sourceSets["main"]
  mainSourceSet.java.srcDirs.clear()
  mainSourceSet.java.srcDir("src")
  mainSourceSet.resources.srcDirs.clear()
}

dependencies {
  implementation(Dependencies.JUnit4)

  runtimeOnly(project(":intellij.platform.boot"))
}