val aetherVersion = "1.1.0"
val mavenVersion = "3.3.9"

plugins{
  `java-library`
}

dependencies{
  api("org.eclipse.aether:aether-api:$aetherVersion")
  api(Dependencies.`http-client`)
  api(Dependencies.`commons-logging`)
  api(Dependencies.Slf4j)

  implementation(Dependencies.Guava)
  implementation(Dependencies.`jetbrains-annotations-java5`)
  implementation("org.eclipse.aether:aether-impl:$aetherVersion")
  implementation("org.eclipse.aether:aether-connector-basic:$aetherVersion")
  implementation("org.eclipse.aether:aether-transport-file:$aetherVersion")
  implementation("org.codehaus.plexus:plexus-interpolation:1.21")
  implementation("org.codehaus.plexus:plexus-component-annotations:1.6")
  implementation("org.apache.maven:maven-artifact:$mavenVersion")
  implementation("org.apache.maven:maven-model:$mavenVersion")
  implementation("org.apache.maven:maven-repository-metadata:$mavenVersion")
  implementation("org.apache.maven:maven-builder-support:$mavenVersion")
  implementation("org.eclipse.aether:aether-transport-http:$aetherVersion"){
    setTransitive(false)
  }
  implementation("org.apache.maven:maven-aether-provider:$mavenVersion"){
    setTransitive(false)
  }
  implementation("org.apache.maven:maven-model-builder:$mavenVersion"){
    setTransitive(false)
  }

  testImplementation(project(":intellij.platform.testFramework"))
}