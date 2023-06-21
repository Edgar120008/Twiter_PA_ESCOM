package com.proyectPA.proyectPA.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectPA.proyectPA.models.Users;

@RestController
public class userController {
    
    @RequestMapping(value =  "users")
    public Users getUser(){
        Users user = new Users();
        user.setName("Juan");
        user.setNickname("juan1029");
        user.setEmail("edgarluna1208@gmail.com");
        user.setPassword("qwerty");
        return user;
    }
}
