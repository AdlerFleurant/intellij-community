rootProject.name = "intellij.idea.community.main"

enableFeaturePreview("IMPROVED_POM_SUPPORT")

include(
  "intellij.platform.util.rt",
  "intellij.platform.resources.en",
  "intellij.platform.util",
  "intellij.platform.extensions",
  "intellij.platform.core",
  "intellij.platform.core.impl",
  "intellij.platform.bootstrap",
  "intellij.java.guiForms.rt",
  "intellij.platform.icons",
  "intellij.platform.jps.model",
  "intellij.platform.projectModel",
  "intellij.platform.indexing",
  "intellij.platform.boot",
  "intellij.platform.editor",
  "intellij.platform.analysis",
  "intellij.tools.jetCheck",
  "intellij.java.rt",
  "intellij.platform.vcs.log.graph",
  "intellij.platform.ide"
)

project(":intellij.platform.util.rt").projectDir = file("platform/util-rt")
project(":intellij.platform.resources.en").projectDir = file("platform/platform-resources-en")
project(":intellij.platform.util").projectDir = file("platform/util")
project(":intellij.platform.extensions").projectDir = file("platform/extensions")
project(":intellij.platform.core").projectDir = file("platform/core-api")
project(":intellij.platform.core.impl").projectDir = file("platform/core-impl")
project(":intellij.platform.bootstrap").projectDir = file("platform/bootstrap")
project(":intellij.java.guiForms.rt").projectDir = file("platform/forms_rt")
project(":intellij.platform.icons").projectDir = file("platform/icons")
project(":intellij.platform.jps.model").projectDir = file("jps/model-api")
project(":intellij.platform.projectModel").projectDir = file("platform/projectModel-api")
project(":intellij.platform.indexing").projectDir = file("platform/indexing-api")
project(":intellij.platform.boot").projectDir = file("platform/boot")
project(":intellij.platform.editor").projectDir = file("platform/editor-ui-api")
project(":intellij.platform.analysis").projectDir = file("platform/analysis-api")
project(":intellij.tools.jetCheck").projectDir = file("jetCheck")
project(":intellij.java.rt").projectDir = file("java/java-runtime")
project(":intellij.platform.vcs.log.graph").projectDir = file("platform/vcs-log/graph-api")
project(":intellij.platform.ide").projectDir = file("platform/platform-api")