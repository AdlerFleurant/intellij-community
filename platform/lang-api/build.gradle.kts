plugins {
  `java-library`
  kotlin("jvm") version "1.2.51"
}

configure<JavaPluginConvention> {
  sourceCompatibility = JavaVersion.VERSION_1_10
  targetCompatibility = JavaVersion.VERSION_1_10

  val mainSourceSet = sourceSets["main"]
  mainSourceSet.java.srcDirs.clear()
  mainSourceSet.java.srcDir("src")
  mainSourceSet.resources.srcDirs.clear()

  val testSourceSet = sourceSets["test"]
  testSourceSet.java.srcDirs.clear()
  testSourceSet.java.srcDir("testSources")
  testSourceSet.resources.srcDirs.clear()
}

repositories {
  jcenter()
  maven("http://dl.bintray.com/jetbrains/intellij-third-party-dependencies")
}

tasks {
  "compileJava"(JavaCompile::class) {
    options.encoding = "UTF-8"
  }

  "compileKotlin"(org.jetbrains.kotlin.gradle.tasks.KotlinCompile::class) {
    kotlinOptions.jvmTarget = "1.8"
  }
}

dependencies {
  api(project(":intellij.platform.ide"))
  api(project(":intellij.platform.lvcs"))
  api(project(":intellij.platform.indexing"))
  api(project(":intellij.platform.projectModel"))
  api(project(":intellij.platform.analysis"))

  implementation(kotlin("reflect"))
  implementation(kotlin("stdlib-jdk8"))
  implementation("be.cyberelf.nanoxml", "nanoxml", "2.2.3")
  implementation("org.jetbrains.intellij.deps", "jdom", "2.0.6")

  testImplementation("junit", "junit", "4.12")
  testImplementation("org.hamcrest", "hamcrest-library", "1.3")
  testImplementation("org.jmock", "jmock-junit4", "2.5.1")
  testImplementation("org.jmock", "jmock-legacy", "2.5.1")
}