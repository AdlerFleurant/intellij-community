import com.jfrog.bintray.gradle.BintrayExtension
import org.jetbrains.kotlin.codegen.intrinsics.ArrayOf
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import de.undercouch.gradle.tasks.download.Download

val SCM_URL: String by project
val intellij_core_version: String by project

plugins {
  `java-library`
  kotlin("jvm") version "1.2.51"
  `maven-publish`
  id("com.github.johnrengelman.shadow").version("2.0.4").apply(false)
  id("com.jfrog.bintray").version("1.8.4").apply(false)
  id("de.undercouch.download").version("3.4.3")
}

//buildscript {
//  ext.kotlin_version = '1.0.5'
//  ext.intellij_core_version = '171.3019.7'
//  repositories {
//    jcenter()
//  }
//  dependencies {
//    classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"
//    classpath 'com.github.jengelman.gradle.plugins:shadow:1.2.3'
//    classpath 'com.jfrog.bintray.gradle:gradle-bintray-plugin:1.7'
//    classpath 'de.undercouch:gradle-download-task:3.1.2'
//  }
//}

fun getUastVersion(): String {
  return System.getenv("ARTIFACT_VERSION") ?: "1.0"
}

apply {
  from("updateDependencies.gradle")
}

allprojects {
  group = "org.jetbrains.uast"
  version = getUastVersion()

  apply(plugin = "java-library")
  apply(plugin = "kotlin")
  apply(plugin = "com.github.johnrengelman.shadow")
  apply(plugin = "maven-publish")
  apply(plugin = "com.jfrog.bintray")

  configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_10
    targetCompatibility = JavaVersion.VERSION_1_10

    val mainSourceSet = sourceSets["main"]
    mainSourceSet.java.srcDirs.clear()
    mainSourceSet.java.srcDir("src")
    mainSourceSet.resources.srcDirs.clear()

    val testSourceSet = sourceSets["test"]
    testSourceSet.java.srcDirs.clear()
    testSourceSet.java.srcDir("src")
    testSourceSet.resources.srcDirs.clear()
  }

  repositories {
    jcenter()
  }

  val sourcesJar by tasks.creating(Jar::class) {
    dependsOn("classes")
    classifier = "sources"
    from(java.sourceSets["main"].allSource)
  }

  configure<BintrayExtension> {
    user = System.getenv("BINTRAY_USER") ?: ""
    key = System.getenv("BINTRAY_API_KEY") ?: ""

    //    publications = arrayOf("UastPublication")

    pkg.repo = "uast"
    pkg.name = "uast"
    pkg.userOrg = "kotlin"
    pkg.setLicenses("Apache-2.0")
    pkg.vcsUrl = SCM_URL
    pkg.version.name = getUastVersion()
    pkg.version.released = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
  }
  //
  //
  //  configure<MavenPublishPlugin> {
  //
  //  }

  //  publishing {
  //    (publications) {
  //      "UastPublication"(MavenPublication::class) {
  //        from(components["java"])
  //        //        groupId = "org.jetbrains.uast"
  //        //        artifactId = project.name
  //        //        version = getUastVersion()
  //
  //        artifact(sourcesJar)
  //      }
  //    }
  //  }
}