package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
	
	@GetMapping("/hello")
    public String sayHello() {
        return "Hello, Spring Boot!";
        
    }
	
	 @GetMapping("/")
	    public String home() {
	        return "index";  // Return the name of the HTML file without .html extension
	    }
	 @GetMapping("/register")
	    public String showRegisterPage() {
	        return "register";  // This will render the register.html file from src/main/resources/templates
	    }

}
