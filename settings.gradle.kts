pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
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
    versionCatalogs {
        create("core") {
            from(files("version-catalog/core.toml"))
        }
        create("test") {
            from(files("version-catalog/test.toml"))
        }
        create("network") {
            from(files("version-catalog/network.toml"))
        }
        create("storage") {
            from(files("version-catalog/storage.toml"))
        }
        create("ioc") {
            from(files("version-catalog/ioc.toml"))
        }
        create("asynchronously") {
            from(files("version-catalog/asynchronously.toml"))
        }


    }
}

rootProject.name = "TestNews"
include(":app")
 