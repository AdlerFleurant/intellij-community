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
  }

  afterEvaluate {
    tasks.withType(JavaCompile::class.java).all {
      options.encoding = "UTF-8"
    }
  }
}