plugins {
  `java-library`
  kotlin("jvm")
}

configure<JavaPluginConvention> {
  val mainSourceSet = sourceSets["main"]
  mainSourceSet.java.srcDirs.clear()
  mainSourceSet.java.srcDir("src")
  mainSourceSet.resources.srcDirs.clear()

  val testSourceSet = sourceSets["test"]
  testSourceSet.java.srcDirs.clear()
  testSourceSet.java.srcDir("testSources")
  testSourceSet.resources.srcDirs.clear()
}

dependencies {
  api(project(":intellij.platform.ide"))
  api(project(":intellij.platform.lvcs"))
  api(project(":intellij.platform.indexing"))
  api(project(":intellij.platform.projectModel"))
  api(project(":intellij.platform.analysis"))

  implementation(kotlin("reflect"))
  implementation(kotlin("stdlib-jdk8"))
  implementation(Dependencies.NanoXML)
  implementation(Dependencies.jdom)

  testImplementation(Dependencies.JUnit4)
  testImplementation(Dependencies.hamcrest)
  Dependencies.Mocks.forEach { testImplementation(it) }
}