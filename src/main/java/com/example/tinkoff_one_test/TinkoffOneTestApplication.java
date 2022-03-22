package com.example.tinkoff_one_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TinkoffOneTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TinkoffOneTestApplication.class, args);
    }

}
