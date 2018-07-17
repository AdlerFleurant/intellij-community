tasks {
  "wrapper"(Wrapper::class) {
    gradleVersion = "4.9"
  }
}

allprojects {
  repositories {
    jcenter()
    maven("http://dl.bintray.com/jetbrains/intellij-third-party-dependencies")
  }
}