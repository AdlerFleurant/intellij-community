plugins {
  `java-library`
  kotlin("jvm")
}

configure<JavaPluginConvention> {
  val sourceSet = sourceSets["main"]
  sourceSet.java.srcDirs.clear()
  sourceSet.java.srcDir("src")
  sourceSet.resources.srcDirs.clear()
}

dependencies {
  api(project(":uast:uast-common"))

  implementation(project(":intellij.platform.analysis"))
  implementation(project(":intellij.platform.projectModel"))
  implementation(project(":intellij.java.psi"))
  implementation(kotlin("reflect"))
  implementation(kotlin("stdlib-jdk8"))
  implementation(Dependencies.`jetbrains-annotations-java5`)
}