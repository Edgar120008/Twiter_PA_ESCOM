package com.proyectPA.proyectPA.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {
    
    @RequestMapping(value =  "prueba")
    public String prueba(){
        return "prueba";
    }
}
