plugins {
  `java-library`
}

configure<JavaPluginConvention> {
  sourceCompatibility = JavaVersion.VERSION_1_10
  targetCompatibility = JavaVersion.VERSION_1_10

  val sourceSet = sourceSets["main"]
  sourceSet.java.srcDirs.clear()
  sourceSet.java.srcDir("src")
  sourceSet.java.srcDir("gen")
  sourceSet.resources.srcDirs.clear()
  sourceSet.resources.srcDir("resources")
}

repositories {
  jcenter()
  maven("http://dl.bintray.com/jetbrains/intellij-third-party-dependencies")
}

tasks {
  "compileJava"(JavaCompile::class) {
    options.encoding = "UTF-8"
  }
}

dependencies {
  api(project(":intellij.java.psi"))
  api(project(":intellij.platform.core.impl"))

  implementation(project(":intellij.java.resources.en"))
  implementation("org.jetbrains.intellij.deps", "asm-all", "6.1-beta2")
  implementation("com.google.guava", "guava", "25.1-jre")
  implementation("one.util", "streamex", "0.6.7")
}