package com.test.joins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan("com.test.joins")
public class MainClass {

    public static void main(String[] args){
        SpringApplication.run(MainClass.class, args);
    }
}
