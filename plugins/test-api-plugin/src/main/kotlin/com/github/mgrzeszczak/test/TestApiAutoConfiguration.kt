package com.github.mgrzeszczak.test

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration(proxyBeanMethods = false)
@ComponentScan("com.github.mgrzeszczak.test")
class TestApiAutoConfiguration {

}