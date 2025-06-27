plugins {
    java
    `maven-publish`
    signing
}

group = "ru.testit"

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
    withJavadocJar()
    withSourcesJar()
}

tasks.withType(JavaCompile::class) {
    options.encoding = "UTF-8"
}

repositories {
    mavenLocal()
    mavenCentral()
}


publishing {
    repositories {
        // JReleaser staging repository
        maven {
            name = "staging"
            url = uri(layout.buildDirectory.dir("staging-deploy"))
        }
        mavenLocal()
        mavenCentral()
    }
    publications {
        create<MavenPublication>("maven") {
            suppressAllPomMetadataWarnings()
            versionMapping {
                allVariants {
                    fromResolutionResult()
                }
            }
            pom {
                name.set(project.name)
                description.set("Java API client for TestIT.")
                url.set("https://github.com/testit-tms/api-client-java")
                licenses {
                    license {
                        name.set("The Apache License, Version 2.0")
                        url.set("https://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }
                developers {
                    developer {
                        id.set("integration")
                        name.set("Integration team")
                        email.set("integrations@testit.software")
                    }
                }
                scm {
                    developerConnection.set("scm:git:git://github.com/testit-tms/api-client-java")
                    connection.set("scm:git:git://github.com/testit-tms/api-client-java")
                    url.set("https://github.com/testit-tms/api-client-java")
                }
                issueManagement {
                    system.set("GitHub Issues")
                    url.set("https://github.com/testit-tms/api-client-java/issues")
                }
            }
        }
    }
}

tasks.withType<Sign>().configureEach {
    onlyIf { !version.toString().endsWith("-SNAPSHOT") }
}

tasks.withType<Javadoc> {
    enabled = false
}

tasks.withType<GenerateModuleMetadata> {
    enabled = false
}

tasks.jar {
    manifest {
        attributes(
            mapOf(
                "Specification-Title" to project.name,
                "Implementation-Title" to project.name,
                "Implementation-Version" to version
            )
        )
    }
}

publishing.publications.named<MavenPublication>("maven") {
    pom {
        from(components["java"])
    }
}
val junitVersion = "5.10.3"
val junitLauncherVersion = "1.9.0"
val jakarta_annotation_version = "1.3.5"

dependencies {
	implementation("io.swagger:swagger-annotations:1.6.8")
	implementation("com.google.code.findbugs:jsr305:3.0.2")
	implementation("com.squareup.okhttp3:okhttp:4.12.0")
	implementation("com.squareup.okhttp3:logging-interceptor:4.12.0")
	implementation("com.google.code.gson:gson:2.9.1")
	implementation("io.gsonfire:gson-fire:1.9.0")
	implementation("jakarta.ws.rs:jakarta.ws.rs-api:2.1.6")
	implementation("org.openapitools:jackson-databind-nullable:0.2.6")
	implementation("jakarta.annotation:jakarta.annotation-api:$jakarta_annotation_version")
	implementation("org.apache.commons:commons-lang3:3.12.0")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:$junitVersion")
    testImplementation("org.junit.jupiter:junit-jupiter-params:$junitVersion")
    testImplementation("org.junit.platform:junit-platform-launcher:$junitLauncherVersion")
    testImplementation("org.junit.jupiter:junit-jupiter-api:$junitVersion")
}

tasks.test {
    useJUnitPlatform()
}


// JReleaser helper tasks
tasks.register("jreleaserStage") {
    group = "publishing"
    description = "Stages all modules for JReleaser deployment"

    // Depend on publishing tasks from all subprojects
    dependsOn(":publishMavenPublicationToStagingRepository")

    doLast {
        println("✅ All modules staged for JReleaser deployment")
        println("📁 Staging directories:")
        val stagingDir = project.layout.buildDirectory.dir("staging-deploy").get().asFile
        if (stagingDir.exists()) {
            println("   ${project.name}: ${stagingDir.absolutePath}")
        }
        println("🚀 Run 'jreleaser deploy' to publish to Maven Central")
    }
}
