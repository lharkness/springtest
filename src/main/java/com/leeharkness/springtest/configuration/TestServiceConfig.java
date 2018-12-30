package com.leeharkness.springtest.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Minimal config needed - component scan all the things
 */
@Configuration
@ComponentScan(basePackages = {"com.leeharkness.springtest"})
public class TestServiceConfig {
}
