package com.example.movieapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Movie API is running 🚀";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}