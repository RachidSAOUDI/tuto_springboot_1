package com.example.tuto_springboot_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    // GET HTTP Method
    // http://localhost:8080/hello-world
    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
