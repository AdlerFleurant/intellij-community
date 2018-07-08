plugins {
  `java-library`
}

configure<JavaPluginConvention> {
  sourceCompatibility = JavaVersion.VERSION_1_9
  targetCompatibility = JavaVersion.VERSION_1_9

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
  implementation(project(":intellij.platform.util"))
  implementation("org.jetbrains.intellij.deps", "trove4j", "1.0.20160824")
}