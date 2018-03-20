package com.complexaesthetic.readinglist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * the @SpringBootApplication annotation enables component scanning
 * and auto-config. It is a combination of three Spring annotations:
 * <p>
 * Spring's @Configuration : designates a class as a configuration class using
 * the java-based config (as opposed to XML-based)
 * <p>
 * Spring's @ComponentScan : allows for web controller and other component
 * classes to be automatically discovered and registered as beans
 * in the Spring application context
 * <p>
 * Spring Boot's @EnableAutoConfiguration :
 */

@SpringBootApplication
public class ReadingListApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReadingListApplication.class, args);
    }
}
