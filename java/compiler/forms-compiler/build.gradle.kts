plugins {
  `java-library`
}

configure<JavaPluginConvention> {
  sourceCompatibility = JavaVersion.VERSION_1_10
  targetCompatibility = JavaVersion.VERSION_1_10
}

dependencies{
  api(project(":intellij.java.compiler.instrumentationUtil"))

  implementation(project(":intellij.java.guiForms.rt"))
  implementation(Dependencies.jdom)
  implementation(Dependencies.asm)
  implementation(Dependencies.`jgoodies-forms`)

  testImplementation(Dependencies.JUnit5)

  testRuntimeOnly(Dependencies.JUnit5_rt)
}