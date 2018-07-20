import org.jetbrains.kotlin.gradle.dsl.Coroutines

plugins {
  `java-library`
  kotlin("jvm") version "1.2.51"
}

configure<JavaPluginConvention> {
  sourceCompatibility = JavaVersion.VERSION_1_10
  targetCompatibility = JavaVersion.VERSION_1_10

  val sourceSet = sourceSets["main"]
  sourceSet.java.srcDirs.clear()
  sourceSet.java.srcDir("src")
  sourceSet.resources.srcDirs.clear()
  sourceSet.resources.srcDir("resources")
}

kotlin {
  experimental.coroutines = Coroutines.ENABLE
}

tasks {
  "compileJava"(JavaCompile::class){
    options.compilerArgs.addAll(listOf("--add-exports", "java.desktop/sun.awt=ALL-UNNAMED",
                                       "--add-exports", "java.desktop/sun.font=ALL-UNNAMED"))
  }

  "compileKotlin"(org.jetbrains.kotlin.gradle.tasks.KotlinCompile::class) {
    kotlinOptions.jvmTarget = "1.8"
  }
}

dependencies {
  api(project(":intellij.platform.ide"))
  api(project(":intellij.platform.lvcs"))
  api(project(":intellij.platform.core.impl"))
  api(project(":intellij.platform.analysis.impl"))
  api(project(":intellij.platform.editor.ex"))
  api(kotlin("reflect"))
  api(kotlin("stdlib-jdk8"))
  api("one.util", "streamex", "0.6.7")

  implementation(project(":intellij.platform.boot"))
  implementation(project(":intellij.platform.bootstrap"))
  implementation(project(":intellij.platform.lang"))
  implementation(project(":intellij.platform.indexing"))
  implementation(project(":intellij.platform.indexing.impl"))
  implementation(project(":intellij.platform.projectModel.impl"))
  implementation(project(":intellij.platform.jps.model.impl"))
  implementation(project(":intellij.platform.analysis.impl"))
  implementation(project(":intellij.platform.diff"))
  implementation(project(":intellij.platform.builtInServer"))
  implementation("org.picocontainer", "picocontainer", "1.2")
  implementation("log4j", "log4j", "1.2.17")
  implementation("commons-codec", "commons-codec", "1.10")
  implementation("oro", "oro", "2.0.8")
  implementation("javax.help", "javahelp", "2.0.05")
  implementation("net.java.dev.jna", "jna-platform", "4.5.0")
  implementation("org.jvnet.winp", "winp", "1.26")
  implementation("org.swinglabs", "swingx-core", "1.6.2-2")
  implementation("com.miglayout", "miglayout-swing", "5.1")
  implementation("org.jetbrains.intellij.deps", "commons-imaging", "1.0-RC-1")
  implementation("com.google.guava", "guava", "25.1-jre")
  implementation("com.google.code.gson", "gson", "2.8.5")
  implementation("commons-logging", "commons-logging", "1.2")
  implementation("org.apache.httpcomponents", "httpclient", "4.5.6")
  implementation("org.apache.httpcomponents", "httpmime", "4.5.6")
  implementation("org.apache.httpcomponents", "httpcore", "4.4.10")
  implementation("org.imgscalr", "imgscalr-lib", "4.2")
  implementation("io.netty", "netty-codec", "4.1.25.Final")
  implementation("io.netty", "netty-codec-http", "4.1.25.Final")
  implementation("io.netty", "netty-handler", "4.1.25.Final")
  implementation("javax.activation", "activation", "1.1.1")
  implementation("com.twelvemonkeys.common", "common-image", "3.3.2")
  implementation("com.twelvemonkeys.common", "common-io", "3.3.2")
  implementation("com.twelvemonkeys.common", "common-lang", "3.3.2")
  implementation("com.twelvemonkeys.imageio", "imageio-core", "3.3.2")
  implementation("com.twelvemonkeys.imageio", "imageio-metadata", "3.3.2")
  implementation("com.twelvemonkeys.imageio", "imageio-tiff", "3.3.2")
  implementation(rootProject.files("lib/pty4j-0.7.5.jar"))
  implementation(rootProject.files("lib/cglib-nodep-3.2.4.jar"))
  implementation(rootProject.files("lib/jayatana-1.2.4.jar"))
  implementation(rootProject.files("lib/jediterm-pty-2.10.jar"))
  implementation(rootProject.files("lib/eawtstub.jar"))

  runtimeOnly(project(":intellij.platform.builtInServer.impl"))
  runtimeOnly(project(":intellij.platform.configurationStore.impl"))
  runtimeOnly(project(":intellij.platform.credentialStore"))
  runtimeOnly(project(":intellij.platform.tasks.impl"))
  runtimeOnly("org.slf4j", "slf4j-api", "1.7.25")
  runtimeOnly("org.slf4j", "slf4j-log4j12", "1.7.25")
  runtimeOnly("com.google.errorprone", "error_prone_annotations", "2.3.1")
}