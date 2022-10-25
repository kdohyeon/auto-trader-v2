package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarketController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
