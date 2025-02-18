package com.hari.git.action.GitHubActionDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitHubActionDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitHubActionDemoApplication.class, args);
    }

    @GetMapping
    public String sayHello() {
        return "Hello...! Your GitAction First Project Succeeded...!";
    }

}
