plugins {
    java
    `maven-publish`
//    signing
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

tasks.withType(JavaCompile::class) {
    options.encoding = "UTF-8"
}

repositories {
    mavenLocal()
    mavenCentral()
}

group = "ru.testit"

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
                url.set("https://github.com/testit-tms/adapters-java")
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
                    developerConnection.set("scm:git:git://github.com/testit-tms/adapters-java")
                    connection.set("scm:git:git://github.com/testit-tms/adapters-java")
                    url.set("https://github.com/testit-tms/adapters-java")
                }
                issueManagement {
                    system.set("GitHub Issues")
                    url.set("https://github.com/testit-tms/adapters-java/issues")
                }
            }
        }
    }
}

//signing {
//    sign(publishing.publications["maven"])
//}
//
//tasks.withType<Sign>().configureEach {
//    onlyIf { !version.toString().endsWith("-SNAPSHOT") }
//}

java {
    withJavadocJar()
    withSourcesJar()
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

dependencies {
    implementation("io.swagger.core.v3:swagger-annotations:2.2.0")
    implementation("com.squareup.okhttp:okhttp:2.7.5")
    implementation("com.squareup.okhttp:logging-interceptor:2.7.5")
    implementation("com.google.code.gson:gson:2.9.0")
    implementation("io.gsonfire:gson-fire:1.8.5")
    implementation("org.threeten:threetenbp:1.6.0")
    testImplementation("junit:junit:4.13.2")
}