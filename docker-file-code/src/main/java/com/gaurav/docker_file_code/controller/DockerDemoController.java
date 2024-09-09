package com.gaurav.docker_file_code.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class DockerDemoController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Spring Boot Docker Demo";
    }

}
