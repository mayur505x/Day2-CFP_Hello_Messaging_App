package com.project.hellomessageapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello")
public class HelloMessageRestController {
    @GetMapping(value = {"", "/", "/home"})
    public String index() {
        return "Hello from Bridgelabz!!!!!";
    }

    @GetMapping(value = "/query")
    public String sayHello(@RequestParam String name) {
        return "Hello " + name + " from Bridgelabz ";
    }
}
