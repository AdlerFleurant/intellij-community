plugins {
  `java-library`
  kotlin("jvm")
}

configure<JavaPluginConvention> {
  val sourceSet = sourceSets["main"]
  sourceSet.java.srcDirs.clear()
  sourceSet.java.srcDir("src")
  sourceSet.java.srcDir("gen")
  sourceSet.resources.srcDirs.clear()
  sourceSet.resources.srcDir("resources")
}

tasks {
  "compileJava"(JavaCompile::class) {
    options.compilerArgs.add("--add-modules=java.corba")
  }
}

dependencies {
  api(project(":intellij.platform.lang"))
  api(project(":intellij.platform.usageView"))
  api(project(":intellij.platform.indexing.impl"))
  api(project(":intellij.platform.projectModel.impl"))
  api(project(":intellij.platform.analysis.impl"))
  api(project(":intellij.platform.structureView.impl"))
  api(project(":intellij.platform.ide.impl"))

  implementation(project(":intellij.platform.vcs"))
  implementation(project(":intellij.platform.indexing"))
  implementation(project(":intellij.platform.jps.model.impl"))
  implementation(project(":intellij.platform.diff.impl"))
  implementation(project(":intellij.platform.builtInServer"))
  implementation(project(":intellij.platform.boot"))
  implementation(Dependencies.OroMatcher)
  implementation(Dependencies.Velocity)
  implementation(Dependencies.`cli-parser`)
  implementation(Dependencies.swingx)
  implementation(Dependencies.Guava)
  implementation(Dependencies.gson)
  implementation(Dependencies.`commons-logging`)
  implementation(Dependencies.Groovy)
  implementation(Dependencies.XStream)
  implementation(Dependencies.`miglayout-swing`)
  implementation(Dependencies.jna)
  implementation(Dependencies.`lz4-java`)
}