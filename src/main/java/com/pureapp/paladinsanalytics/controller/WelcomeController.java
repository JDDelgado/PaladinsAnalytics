package com.pureapp.paladinsanalytics.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    // inject via application.properties
    //@Value("${welcome.message:test}")
    private String message = "Hello World";

    @RequestMapping("/")
    public String welcome() {
        return message;
    }

}