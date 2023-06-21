package com.proyectPA.proyectPA.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {
    
    @RequestMapping(value =  "prueba")
    public List<String> prueba(){
        return List.of("Manzana, kiwi, banana");
    }
}
