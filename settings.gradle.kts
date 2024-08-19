/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven {
            setUrl("https://androidx.dev/snapshots/builds/11723120/artifacts/repository") // 1.4.0-SNAPSHOT
        }
//        maven {
//            setUrl("https://androidx.dev/snapshots/builds/12244193/artifacts/repository") // 1.5.0-SNAPSHOT
//        }
//        maven {
//            setUrl("https://androidx.dev/metalava/builds/12242179/artifacts/repo/m2repository")
//        }
//        maven {
//            setUrl("https://androidx.dev/dackka/builds/12227732/artifacts/repo/repository")
//        }
//        maven {
//            setUrl("https://androidx.dev/kmp/builds/12244193/artifacts/snapshots/repository")
//        }
//        maven {
//            setUrl("https://androidx.dev/storage/compose-compiler/repository/")
//        }
        google()
        mavenCentral()
    }
}

rootProject.name = "social"
include(":app")
include(":baselineprofile")
