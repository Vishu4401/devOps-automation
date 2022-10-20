package com.docker.pipelines;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevOpsIntegrationApplication {

    @GetMapping
    public String message() {
        return "Welcome to Docker Pipelines";
    }

    public static void main(String args) {
        SpringApplication.run(DevOpsIntegrationApplication.class, args);
    }

}
