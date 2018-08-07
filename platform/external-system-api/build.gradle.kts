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
  api(project(":intellij.platform.externalSystem.rt"))

  implementation(project(":intellij.platform.util"))
  implementation(project(":intellij.platform.projectModel"))
  implementation(project(":intellij.java.compiler"))
  implementation(project(":intellij.platform.lang"))
  implementation(project(":intellij.platform.ide"))
  implementation(kotlin("reflect"))
  implementation(kotlin("stdlib-jdk8"))
  implementation(Dependencies.jdom)
  implementation(Dependencies.fst)

  runtimeOnly(Dependencies.jackson)
  runtimeOnly(Dependencies.Objenesis)
  runtimeOnly(Dependencies.javassist)
}