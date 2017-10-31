package com.pureapp.paladinsanalytics.controller;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pureapp.paladinsanalytics.GlobalProperties;

@RestController
public class WelcomeController {
    
    @Inject
    private GlobalProperties properties;
    
    // inject via application.properties
    //@Value("${welcome.message}")
    //private String message = "Hello World";
    
    @RequestMapping("/")
    public String welcome() {
        return properties.getMessage();
    }
    
}