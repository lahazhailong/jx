package com.carson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Carson
 */
@SpringBootApplication
@EnableAutoConfiguration
public class SecurityApp {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SecurityApp.class, args);
    }
}