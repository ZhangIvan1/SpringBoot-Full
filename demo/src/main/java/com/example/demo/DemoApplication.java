package com.example.demo;

import org.apache.juli.logging.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

    // Where the program start from
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
