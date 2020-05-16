package com.github.mgrzeszczak.plugins

import org.springframework.boot.autoconfigure.SpringBootApplication


import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
class CoreApplication



fun main(args: Array<String>) {
    runApplication<CoreApplication>(*args)
}