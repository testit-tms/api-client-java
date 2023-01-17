plugins {
    java
    `maven-publish`
    signing
    id("io.github.gradle-nexus.publish-plugin") version "1.1.0"
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

nexusPublishing {
    repositories {
        sonatype {
            nexusUrl.set(uri("https://s01.oss.sonatype.org/service/local/"))
            snapshotRepositoryUrl.set(uri("https://s01.oss.sonatype.org/content/repositories/snapshots/"))
        }
    }
}

publishing {
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

signing {
    sign(publishing.publications["maven"])
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

val okhttpVersion = "4.10.0"

dependencies {
    implementation("io.swagger:swagger-annotations:1.6.8")
    implementation("com.google.code.findbugs:jsr305:3.0.2")
    implementation("com.squareup.okhttp3:okhttp:$okhttpVersion")
    implementation("com.squareup.okhttp3:logging-interceptor:$okhttpVersion")
    implementation("com.google.code.gson:gson:2.10.1")
    implementation("io.gsonfire:gson-fire:1.8.5")
    implementation("javax.ws.rs:jsr311-api:1.1.1")
    implementation("javax.ws.rs:javax.ws.rs-api:2.1.1")
    implementation("org.openapitools:jackson-databind-nullable:0.2.4")
    implementation("org.apache.commons:commons-lang3:3.12.0")
    implementation("jakarta.annotation:jakarta.annotation-api:1.3.5")
}