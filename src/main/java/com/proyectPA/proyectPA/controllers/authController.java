package com.proyectPA.proyectPA.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.proyectPA.proyectPA.database.usersDao;
import com.proyectPA.proyectPA.models.Users;
 
@RestController
public class authController {

    @Autowired
    private usersDao usersDao;
    
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(@RequestBody Users users){
        if(usersDao.verifiUserData(users)){
            return "ok";
        }   
        return "fail";
    }
}
