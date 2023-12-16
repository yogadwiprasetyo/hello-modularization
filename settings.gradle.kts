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

rootProject.name = "Hello Modularization"
include(":app")
include(":feature:home")
include(":feature:search")
include(":feature:profile")
include(":feature:favorite")
include(":feature:detail")
include(":common")
include(":feature:review")
