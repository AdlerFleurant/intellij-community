import org.jetbrains.kotlin.gradle.dsl.Coroutines

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

kotlin {
  experimental.coroutines = Coroutines.ENABLE
}

tasks {
  "compileJava"(JavaCompile::class){
    options.compilerArgs.addAll(listOf("--add-exports", "java.desktop/sun.awt=ALL-UNNAMED",
                                       "--add-exports", "java.desktop/sun.font=ALL-UNNAMED"))
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
  api(Dependencies.StreamEx)

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
  implementation(Dependencies.picocontainer)
  implementation(Dependencies.Log4J)
  implementation(Dependencies.`commons-codec`)
  implementation(Dependencies.OroMatcher)
  implementation(Dependencies.JavaHelp)
  implementation(Dependencies.jna)
  implementation(Dependencies.winp)
  implementation(Dependencies.swingx)
  implementation(Dependencies.`miglayout-swing`)
  implementation(Dependencies.`commons-imaging`)
  implementation(Dependencies.Guava)
  implementation(Dependencies.gson)
  implementation(Dependencies.`commons-logging`)
  implementation(Dependencies.`http-client`)
  implementation(Dependencies.imgscalr)
  implementation(Dependencies.`netty-codec-http`)
  implementation(Dependencies.`netty-handler`)
  implementation(Dependencies.activation)
  implementation(Dependencies.`imageio-tiff`)
  implementation(Dependencies.pty4j)
  implementation(Dependencies.CGLIB)
  implementation(Dependencies.jayatana)
  implementation(Dependencies.`jediterm-pty`)
  implementation(Dependencies.Mac)

  runtimeOnly(project(":intellij.platform.builtInServer.impl"))
  runtimeOnly(project(":intellij.platform.configurationStore.impl"))
  runtimeOnly(project(":intellij.platform.credentialStore"))
  runtimeOnly(project(":intellij.platform.tasks.impl"))
  runtimeOnly(Dependencies.Slf4j)
  runtimeOnly(Dependencies.`error-prone-annotations`)
}