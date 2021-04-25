package com.sukmanov.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SukmanovAuthServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SukmanovAuthServiceApplication.class, args);
    }

}
