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
val swaggerAnnotationsVersion = "1.6.5"

val jacksonVersion = "2.17.1"
val jacksonDatabindVersion = "2.17.1"
val jacksonDatabindNullableVersion = "0.2.6"

val jakartaAnnotationVersion = "2.1.0"
val jerseyVersion = "3.0.4"

dependencies {
    implementation("io.swagger:swagger-annotations:$swaggerAnnotationsVersion")
    implementation("com.google.code.findbugs:jsr305:3.0.2")
    implementation("org.glassfish.jersey.core:jersey-client:$jerseyVersion")
    implementation("org.glassfish.jersey.inject:jersey-hk2:$jerseyVersion")
    implementation("org.glassfish.jersey.media:jersey-media-multipart:$jerseyVersion")
    implementation("org.glassfish.jersey.media:jersey-media-json-jackson:$jerseyVersion")
    implementation("org.glassfish.jersey.connectors:jersey-apache-connector:$jerseyVersion")
    implementation("com.fasterxml.jackson.core:jackson-core:$jacksonVersion")
    implementation("com.fasterxml.jackson.core:jackson-annotations:$jacksonVersion")
    implementation("com.fasterxml.jackson.core:jackson-databind:$jacksonDatabindVersion")
    implementation("org.openapitools:jackson-databind-nullable:$jacksonDatabindNullableVersion")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:$jacksonVersion")
    implementation("jakarta.annotation:jakarta.annotation-api:$jakartaAnnotationVersion")

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
