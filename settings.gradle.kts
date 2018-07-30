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
  "intellij.java.rt",
  "intellij.platform.vcs.log.graph",
  "intellij.platform.ide",
  "intellij.platform.lvcs",
  "intellij.platform.diff",
  "intellij.platform.lang",
  "intellij.platform.vcs.core",
  "intellij.platform.vcs",
  "intellij.java.resources.en",
  "intellij.jps.model.serialization",
  "intellij.platform.externalSystem.rt",
  "intellij.java.psi",
  "intellij.java.psi.impl",
  "uast",
  "uast:uast-common",
  "uast:uast-java",
  "intellij.java.analysis",
  "intellij.java.indexing",
  "intellij.platform.tasks",
  "intellij.platform.debugger",
  "intellij.xml.psi",
  "intellij.platform.colorSchemes",
  "intellij.platform.jps.model.impl",
  "intellij.platform.builtInServer",
  "intellij.idea.community.resources",
  "intellij.xml.analysis",
  "intellij.xml.structureView",
  "intellij.xml",
  "intellij.tools.testsBootstrap",
  "intellij.platform.testFramework.core",
  "intellij.platform.projectModel.impl",
  "intellij.platform.indexing.impl",
  "intellij.platform.editor.ex",
  "intellij.platform.vcs.log",
  "intellij.platform.structureView.impl",
  "intellij.platform.resources",
  "intellij.platform.lvcs.impl",
  "intellij.json",
  "intellij.xml.dom",
  "intellij.java",
  "intellij.java.compiler",
  "intellij.platform.externalSystem",
  "intellij.platform.analysis.impl",
  "intellij.platform.ide.impl",
  "intellij.platform.builtInServer.impl",
  "intellij.platform.tasks.impl",
  "intellij.platform.configurationStore.impl",
  "intellij.platform.credentialStore",
  "intellij.platform.main",
  "intellij.platform.usageView",
  "intellij.platform.diff.impl",
  "intellij.platform.lang.impl"
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
project(":intellij.java.rt").projectDir = file("java/java-runtime")
project(":intellij.platform.vcs.log.graph").projectDir = file("platform/vcs-log/graph-api")
project(":intellij.platform.ide").projectDir = file("platform/platform-api")
project(":intellij.platform.lvcs").projectDir = file("platform/lvcs-api")
project(":intellij.platform.diff").projectDir = file("platform/diff-api")
project(":intellij.platform.lang").projectDir = file("platform/lang-api")
project(":intellij.platform.vcs.core").projectDir = file("platform/vcs-api/vcs-api-core")
project(":intellij.platform.vcs").projectDir = file("platform/vcs-api")
project(":intellij.java.resources.en").projectDir = file("resources-en")
project(":intellij.jps.model.serialization").projectDir = file("jps/model-serialization")
project(":intellij.platform.externalSystem.rt").projectDir = file("platform/external-system-rt")
project(":intellij.java.psi").projectDir = file("java/java-psi-api")
project(":intellij.java.psi.impl").projectDir = file("java/java-psi-impl")
project(":intellij.java.analysis").projectDir = file("java/java-analysis-api")
project(":intellij.java.indexing").projectDir = file("java/java-indexing-api")
project(":intellij.platform.tasks").projectDir = file("platform/tasks-platform-api")
project(":intellij.platform.debugger").projectDir = file("platform/xdebugger-api")
project(":intellij.xml.psi").projectDir = file("xml/xml-psi-api")
project(":intellij.platform.colorSchemes").projectDir = file("colorSchemes")
project(":intellij.platform.jps.model.impl").projectDir = file("jps/model-impl")
project(":intellij.platform.builtInServer").projectDir = file("platform/built-in-server-api")
project(":intellij.idea.community.resources").projectDir = file("community-resources")
project(":intellij.xml.analysis").projectDir = file("xml/xml-analysis-api")
project(":intellij.xml.structureView").projectDir = file("xml/xml-structure-view-api")
project(":intellij.xml").projectDir = file("xml/openapi")
project(":intellij.tools.testsBootstrap").projectDir = file("platform/testFramework/bootstrap")
project(":intellij.platform.testFramework.core").projectDir = file("platform/testFramework/core")
project(":intellij.platform.projectModel.impl").projectDir = file("platform/projectModel-impl")
project(":intellij.platform.indexing.impl").projectDir = file("platform/indexing-impl")
project(":intellij.platform.editor.ex").projectDir = file("platform/editor-ui-ex")
project(":intellij.platform.vcs.log").projectDir = file("platform/vcs-log/api")
project(":intellij.platform.structureView.impl").projectDir = file("platform/structure-view-impl")
project(":intellij.platform.resources").projectDir = file("platform/platform-resources")
project(":intellij.platform.lvcs.impl").projectDir = file("platform/lvcs-impl")
project(":intellij.json").projectDir = file("json")
project(":intellij.xml.dom").projectDir = file("xml/dom-openapi")
project(":intellij.java").projectDir = file("java/openapi")
project(":intellij.java.compiler").projectDir = file("java/compiler/openapi")
project(":intellij.platform.externalSystem").projectDir = file("platform/external-system-api")
project(":intellij.platform.analysis.impl").projectDir = file("platform/analysis-impl")
project(":intellij.platform.ide.impl").projectDir = file("platform/platform-impl")
project(":intellij.platform.builtInServer.impl").projectDir = file("platform/built-in-server")
project(":intellij.platform.tasks.impl").projectDir = file("platform/tasks-platform-impl")
project(":intellij.platform.configurationStore.impl").projectDir = file("platform/configuration-store-impl")
project(":intellij.platform.credentialStore").projectDir = file("platform/credential-store")
project(":intellij.platform.main").projectDir = file("platform/platform-main")
project(":intellij.platform.usageView").projectDir = file("platform/usageView")
project(":intellij.platform.diff.impl").projectDir = file("platform/diff-impl")
project(":intellij.platform.lang.impl").projectDir = file("platform/lang-impl")