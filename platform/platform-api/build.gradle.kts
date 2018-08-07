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
  api(project(":intellij.java.guiForms.rt"))
  api(project(":intellij.platform.util"))
  api(project(":intellij.platform.extensions"))
  api(project(":intellij.platform.core"))
  api(project(":intellij.platform.resources.en"))
  api(project(":intellij.platform.projectModel"))
  api(project(":intellij.platform.editor"))
  api(project(":intellij.platform.analysis"))
  api(Dependencies.`jgoodies-forms`)

  implementation(project(":intellij.platform.bootstrap"))
  implementation(project(":intellij.platform.icons"))
  implementation(kotlin("reflect"))
  implementation(kotlin("stdlib-jdk8"))
  implementation(Dependencies.`commons-codec`)
  implementation(Dependencies.automaton)
  implementation(Dependencies.OroMatcher)
  implementation(Dependencies.`proxy-vole`)
  implementation(Dependencies.Guava)
  implementation(Dependencies.`http-client`)
  implementation(Dependencies.jna)
  implementation(Dependencies.ini4j)
  implementation(Dependencies.jdom)
  implementation(Dependencies.jackson)
  implementation(Dependencies.`netty-codec-http`)
  implementation(Dependencies.`delight-nashorn-sandbox`)
  implementation(Dependencies.pty4j)
}