plugins {
  `java-library`
  kotlin("jvm")
}

configure<JavaPluginConvention> {
  val sourceSet = sourceSets["main"]
  sourceSet.java.srcDirs.clear()
  sourceSet.java.srcDir("src")
  sourceSet.resources.srcDirs.clear()
  sourceSet.resources.srcDir("resources")
}

dependencies {
  api(project(":intellij.platform.vcs"))
  api(project(":intellij.platform.diff.impl"))
  api(project(":intellij.platform.ide.impl"))

  implementation(project(":intellij.platform.lang"))
  implementation(project(":intellij.platform.lang.impl"))
  implementation(project(":intellij.platform.ide"))
  implementation(project(":intellij.platform.jps.model.serialization"))
  implementation(project(":intellij.platform.vcs.log"))
  implementation(Dependencies.`commons-codec`)
  implementation(Dependencies.Guava)
  implementation(Dependencies.gson)
  implementation(Dependencies.swingx)
  implementation(Dependencies.`miglayout-swing`)

  testImplementation(project(":intellij.platform.testFramework"))
  testImplementation(Dependencies.JUnit4)
}