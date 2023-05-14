package com.example.ss_2022_c3_e1.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/demo")
    public String demo() {
        return "Demo";
    }

    @GetMapping("/test")
    public String test() {
        return "Test";
    }
}
