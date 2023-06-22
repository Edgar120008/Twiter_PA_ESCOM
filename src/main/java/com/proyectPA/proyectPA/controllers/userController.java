package com.proyectPA.proyectPA.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectPA.proyectPA.models.Users;

@RestController
public class userController {
    
    @RequestMapping(value =  "user/{id}")
    public Users getUser(@PathVariable Long id){
        Users user = new Users();
        user.setId(id);
        user.setName("Juan");
        user.setNickname("juan1029");
        user.setEmail("edgarluna1208@gmail.com");
        user.setPassword("qwerty");
        return user;
    }

    @RequestMapping(value =  "user123")
    public Users editUser(){
        Users user = new Users();
        user.setName("Juan");
        user.setNickname("juan1029");
        user.setEmail("edgarluna1208@gmail.com");
        user.setPassword("qwerty");
        return user;
    }

    @RequestMapping(value =  "user124")
    public Users deleteUser(){
        Users user = new Users();
        user.setName("Juan");
        user.setNickname("juan1029");
        user.setEmail("edgarluna1208@gmail.com");
        user.setPassword("qwertwy");
        return user;
    }

    @RequestMapping(value =  "user125")
    public Users viewUser(){
        Users user = new Users();
        user.setName("Juan");
        user.setNickname("juan1029");
        user.setEmail("edgarluna1208@gmail.com");
        user.setPassword("qwerty");
        return user;
    }
}
