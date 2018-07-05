rootProject.name = "intellij.idea.community.main"

enableFeaturePreview("IMPROVED_POM_SUPPORT")

include(
  "intellij.platform.util.rt"
)

project(":intellij.platform.util.rt").projectDir = file("platform/util-rt")