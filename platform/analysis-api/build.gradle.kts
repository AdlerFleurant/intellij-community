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
  api(project(":intellij.platform.editor"))

  implementation(project(":intellij.platform.util"))
  implementation(project(":intellij.platform.extensions"))
  implementation(project(":intellij.platform.core"))
  implementation(project(":intellij.platform.projectModel"))
  implementation("org.jetbrains.intellij.deps", "jdom", "2.0.6")
}