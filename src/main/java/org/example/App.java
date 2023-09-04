package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author coder
 */
@EnableAutoConfiguration
@ComponentScan
public class App {
    public static void main (String[] args) {
        SpringApplication.run(App.class,args);
    }
}
