package com.example.demo;

import org.apache.juli.logging.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DemoApplication {

    // Where the program start from
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
