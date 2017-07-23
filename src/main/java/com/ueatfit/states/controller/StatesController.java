package com.ueatfit.states.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatesController {
	
	@RequestMapping("/")
    String home() {
        return "Hello World! from ";
    }

}
