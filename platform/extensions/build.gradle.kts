plugins {
  `java-library`
}

configure<JavaPluginConvention> {
  val mainSourceSet = sourceSets["main"]
  mainSourceSet.java.srcDirs.clear()
  mainSourceSet.java.srcDir("src")
  mainSourceSet.resources.srcDirs.clear()

  val testSourceSet = sourceSets["test"]
  testSourceSet.java.srcDirs.clear()
  testSourceSet.java.srcDir("testSrc")
}

dependencies {
  implementation(project(":intellij.platform.util"))
  implementation(Dependencies.XStream)
  implementation(Dependencies.jdom)
  implementation(Dependencies.picocontainer)

  testImplementation(Dependencies.JUnit4)
  testImplementation(Dependencies.Xerces)
  testImplementation(Dependencies.assertJ)
}