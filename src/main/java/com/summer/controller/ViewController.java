package com.summer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/books/new")
    public String addBook() {
        return "add-book";
    }
}
