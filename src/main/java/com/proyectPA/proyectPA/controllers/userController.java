package com.proyectPA.proyectPA.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.proyectPA.proyectPA.database.usersDao;
import com.proyectPA.proyectPA.models.Users;

@RestController
public class userController {

    @Autowired
    private usersDao usersDao;
    
    @RequestMapping(value =  "user/{id}", method = RequestMethod.GET)
    public Users getUser(@PathVariable Long id){
        Users user = new Users();
        user.setId(id);
        user.setName("Juan");
        user.setNickname("juan1029");
        user.setEmail("edgarluna1208@gmail.com");
        user.setPassword("qwerty");
        return user;
    }
    
    @RequestMapping(value = "users")
    public List<Users> getUsers(){
        return usersDao.getUsers();
    }

    @RequestMapping(value =  "user/follow/{id}", method = RequestMethod.PUT)
    public void editUser(@PathVariable Long id){
        usersDao.follow(id);
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
