import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.gradle.internal.os.OperatingSystem

plugins {
    kotlin("jvm") version "1.3.30"
    application
}

group = "com.azedevs"
version = "1.0"

repositories {
    mavenCentral()
    maven("https://dl.bintray.com/kotlin/kotlin-dev")
    maven("https://oss.sonatype.org/content/repositories/snapshots/")
    maven("https://jitpack.io")
}

val lwjglVersion = "3.2.1"
val lwjglNatives = "natives-windows"

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("com.github.kotlin-graphics:imgui:v1.68.01-00")
    implementation("org.jire.kotmem:Kotmem:0.86")
    implementation("org.jdbi:jdbi3-core:3.3.0")
    implementation("org.jdbi:jdbi3-bom:3.3.0") // http://jdbi.org/#_introduction_to_jdbi
    implementation("mysql:mysql-connector-java:8.0.12") // http://zetcode.com/db/jdbi/

    implementation("org.lwjgl", "lwjgl", lwjglVersion)
    implementation("org.lwjgl", "lwjgl-assimp", lwjglVersion)
    implementation("org.lwjgl", "lwjgl-bgfx", lwjglVersion)
    implementation("org.lwjgl", "lwjgl-cuda", lwjglVersion)
    implementation("org.lwjgl", "lwjgl-egl", lwjglVersion)
    implementation("org.lwjgl", "lwjgl-glfw", lwjglVersion)
    implementation("org.lwjgl", "lwjgl-jawt", lwjglVersion)
    implementation("org.lwjgl", "lwjgl-jemalloc", lwjglVersion)
    implementation("org.lwjgl", "lwjgl-libdivide", lwjglVersion)
    implementation("org.lwjgl", "lwjgl-llvm", lwjglVersion)
    implementation("org.lwjgl", "lwjgl-lmdb", lwjglVersion)
    implementation("org.lwjgl", "lwjgl-lz4", lwjglVersion)
    implementation("org.lwjgl", "lwjgl-meow", lwjglVersion)
    implementation("org.lwjgl", "lwjgl-nanovg", lwjglVersion)
    implementation("org.lwjgl", "lwjgl-nfd", lwjglVersion)
    implementation("org.lwjgl", "lwjgl-nuklear", lwjglVersion)
    implementation("org.lwjgl", "lwjgl-odbc", lwjglVersion)
    implementation("org.lwjgl", "lwjgl-openal", lwjglVersion)
    implementation("org.lwjgl", "lwjgl-opencl", lwjglVersion)
    implementation("org.lwjgl", "lwjgl-opengl", lwjglVersion)
    implementation("org.lwjgl", "lwjgl-opengles", lwjglVersion)
    implementation("org.lwjgl", "lwjgl-openvr", lwjglVersion)
    implementation("org.lwjgl", "lwjgl-opus", lwjglVersion)
    implementation("org.lwjgl", "lwjgl-ovr", lwjglVersion)
    implementation("org.lwjgl", "lwjgl-par", lwjglVersion)
    implementation("org.lwjgl", "lwjgl-remotery", lwjglVersion)
    implementation("org.lwjgl", "lwjgl-rpmalloc", lwjglVersion)
    implementation("org.lwjgl", "lwjgl-sse", lwjglVersion)
    implementation("org.lwjgl", "lwjgl-stb", lwjglVersion)
    implementation("org.lwjgl", "lwjgl-tinyexr", lwjglVersion)
    implementation("org.lwjgl", "lwjgl-tinyfd", lwjglVersion)
    implementation("org.lwjgl", "lwjgl-tootle", lwjglVersion)
    implementation("org.lwjgl", "lwjgl-vma", lwjglVersion)
    implementation("org.lwjgl", "lwjgl-vulkan", lwjglVersion)
    implementation("org.lwjgl", "lwjgl-xxhash", lwjglVersion)
    implementation("org.lwjgl", "lwjgl-yoga", lwjglVersion)
    implementation("org.lwjgl", "lwjgl-zstd", lwjglVersion)
    runtimeOnly("org.lwjgl", "lwjgl", lwjglVersion, lwjglNatives)
    runtimeOnly("org.lwjgl", "lwjgl-assimp", lwjglVersion, lwjglNatives)
    runtimeOnly("org.lwjgl", "lwjgl-bgfx", lwjglVersion, lwjglNatives)
    runtimeOnly("org.lwjgl", "lwjgl-glfw", lwjglVersion, lwjglNatives)
    runtimeOnly("org.lwjgl", "lwjgl-jemalloc", lwjglVersion, lwjglNatives)
    runtimeOnly("org.lwjgl", "lwjgl-libdivide", lwjglVersion, lwjglNatives)
    runtimeOnly("org.lwjgl", "lwjgl-llvm", lwjglVersion, lwjglNatives)
    runtimeOnly("org.lwjgl", "lwjgl-lmdb", lwjglVersion, lwjglNatives)
    runtimeOnly("org.lwjgl", "lwjgl-lz4", lwjglVersion, lwjglNatives)
    runtimeOnly("org.lwjgl", "lwjgl-meow", lwjglVersion, lwjglNatives)
    runtimeOnly("org.lwjgl", "lwjgl-nanovg", lwjglVersion, lwjglNatives)
    runtimeOnly("org.lwjgl", "lwjgl-nfd", lwjglVersion, lwjglNatives)
    runtimeOnly("org.lwjgl", "lwjgl-nuklear", lwjglVersion, lwjglNatives)
    runtimeOnly("org.lwjgl", "lwjgl-openal", lwjglVersion, lwjglNatives)
    runtimeOnly("org.lwjgl", "lwjgl-opengl", lwjglVersion, lwjglNatives)
    runtimeOnly("org.lwjgl", "lwjgl-opengles", lwjglVersion, lwjglNatives)
    runtimeOnly("org.lwjgl", "lwjgl-openvr", lwjglVersion, lwjglNatives)
    runtimeOnly("org.lwjgl", "lwjgl-opus", lwjglVersion, lwjglNatives)
    runtimeOnly("org.lwjgl", "lwjgl-ovr", lwjglVersion, lwjglNatives)
    runtimeOnly("org.lwjgl", "lwjgl-par", lwjglVersion, lwjglNatives)
    runtimeOnly("org.lwjgl", "lwjgl-remotery", lwjglVersion, lwjglNatives)
    runtimeOnly("org.lwjgl", "lwjgl-rpmalloc", lwjglVersion, lwjglNatives)
    runtimeOnly("org.lwjgl", "lwjgl-sse", lwjglVersion, lwjglNatives)
    runtimeOnly("org.lwjgl", "lwjgl-stb", lwjglVersion, lwjglNatives)
    runtimeOnly("org.lwjgl", "lwjgl-tinyexr", lwjglVersion, lwjglNatives)
    runtimeOnly("org.lwjgl", "lwjgl-tinyfd", lwjglVersion, lwjglNatives)
    runtimeOnly("org.lwjgl", "lwjgl-tootle", lwjglVersion, lwjglNatives)
    runtimeOnly("org.lwjgl", "lwjgl-vma", lwjglVersion, lwjglNatives)
    runtimeOnly("org.lwjgl", "lwjgl-xxhash", lwjglVersion, lwjglNatives)
    runtimeOnly("org.lwjgl", "lwjgl-yoga", lwjglVersion, lwjglNatives)
    runtimeOnly("org.lwjgl", "lwjgl-zstd", lwjglVersion, lwjglNatives)
    
//    val lwjglNatives = when (OperatingSystem.current()) {
//        OperatingSystem.WINDOWS -> "natives-windows"
//        OperatingSystem.LINUX   -> "natives-linux"
//        OperatingSystem.MAC_OS  -> "natives-macos"
//        else                    -> ""
//    }
//
//    // Look up which modules and versions of LWJGL are required and add setup the approriate natives.
//    configurations["compile"].resolvedConfiguration.resolvedArtifacts.forEach {
//        if (it.moduleVersion.id.group == "org.lwjgl") {
//            "runtime"("org.lwjgl:${it.moduleVersion.id.name}:${it.moduleVersion.id.version}:$lwjglNatives")
//        }
//    }
}

//tasks.withType<KotlinCompile> {
//    kotlinOptions.jvmTarget = "1.8"
//}