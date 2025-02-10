package com.cursospring.practicasuno.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String getMethodName() {
        return "home";
    }
    
}
