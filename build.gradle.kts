//import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
//
//plugins {
//	id("org.springframework.boot") version "2.2.7.RELEASE" apply false
//	id("io.spring.dependency-management") version "1.0.9.RELEASE" apply false
//	kotlin("jvm") version "1.3.72" apply false
//	kotlin("plugin.spring") version "1.3.72" apply false
//}
//
//repositories {
//	mavenCentral()
//}
//
//group = "com.github.mgrzeszczak"
//version = "0.0.1-SNAPSHOT"
//java.sourceCompatibility = JavaVersion.VERSION_1_8
//
//subprojects {
//
//	repositories {
//		mavenCentral()
//	}
//
//	apply(plugin = "io.spring.dependency-management")
//	apply(plugin = "jvm")
//	apply(plugin = "plugin.spring")
//
//	dependencies {
//		implementation("org.springframework.boot:spring-boot-starter-web")
//		implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
//		implementation("org.jetbrains.kotlin:kotlin-reflect")
//		implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
//		testImplementation("org.springframework.boot:spring-boot-starter-test") {
//			exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
//		}
//	}
//
//	tasks.withType<Test> {
//		useJUnitPlatform()
//	}
//
//	tasks.withType<KotlinCompile> {
//		kotlinOptions {
//			freeCompilerArgs = listOf("-Xjsr305=strict")
//			jvmTarget = "1.8"
//		}
//	}
//}
//
//
