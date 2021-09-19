package com.example.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile("kubernetes")
public class ProdController {

    @GetMapping("/message")
    public String publish() {
        return "Hello World from Kubernetes";
    }
}
