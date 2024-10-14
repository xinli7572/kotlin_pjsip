pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "kotlin_pjsip"
include(":app")
include(":libraries:common")
include(":libraries:commonwidget")
include(":libraries:videowidget")
include(":libraries:panowidget")

include(":libraries:audio")
include(":libraries:base")
include(":libraries:controller")