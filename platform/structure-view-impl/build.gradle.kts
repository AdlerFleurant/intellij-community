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
  api(project(":intellij.platform.editor"))
  api(project(":intellij.platform.util"))
  api(project(":intellij.platform.extensions"))
  api(project(":intellij.platform.core"))
  api(project(":intellij.platform.resources.en"))
  api(project(":intellij.platform.projectModel"))

  implementation(project(":intellij.platform.icons"))
  implementation(project(":intellij.platform.bootstrap"))
  implementation(project(":intellij.platform.ide"))
  implementation("org.picocontainer", "picocontainer", "1.2")
  implementation("dk.brics", "automaton", "1.12-1")
}