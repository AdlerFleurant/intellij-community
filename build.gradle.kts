plugins {
  kotlin("jvm") version Versions.`kotlin-jvm` apply false
}

tasks {
  "wrapper"(Wrapper::class) {
    gradleVersion = "4.9"
  }
}

allprojects {
  repositories {
    mavenCentral()
    maven("https://jetbrains.bintray.com/intellij-third-party-dependencies")
    jcenter()
    maven("https://dl.google.com/dl/android/maven2")
    maven("https://repo.jenkins-ci.org/releases")
    maven("https://dl.bintray.com/groovy/maven/")
    maven("https://jitpack.io")
    maven("https://maven.atlassian.com/content/repositories/atlassian-public")
    flatDir {
      dirs("${rootProject.rootDir}/lib", "${rootProject.rootDir}/lib/dev")
    }
  }

  afterEvaluate {
    this.plugins.withId("java") {
      configure<JavaPluginConvention> {
        sourceCompatibility = JavaVersion.VERSION_1_10
        targetCompatibility = JavaVersion.VERSION_1_10
      }
    }

    tasks.withType(JavaCompile::class.java).all {
      options.encoding = "UTF-8"
    }

    tasks.withType(org.jetbrains.kotlin.gradle.tasks.KotlinCompile::class.java) {
      kotlinOptions.jvmTarget = "1.8"
    }
  }
}