package com.proyectPA.proyectPA.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.proyectPA.proyectPA.database.usersDao;
import com.proyectPA.proyectPA.models.Users;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;

@RestController
public class userController {

    @Autowired
    private usersDao usersDao;
    
    @RequestMapping(value = "users", method = RequestMethod.GET)
    public List<Users> getUsers(){
        return usersDao.getUsers();
    }

    @RequestMapping(value =  "user/follow/{id}", method = RequestMethod.PUT)
    public void editUser(@PathVariable Long id){
        usersDao.follow(id);
    }

    @RequestMapping(value =  "user/register", method = RequestMethod.POST)
    public void registerUsers(@RequestBody Users users){

        String pass=users.getPassword();
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        String hashedPassword = argon2.hash(1, 1024, 1, pass);
        users.setPassword(hashedPassword);
        usersDao.registerUsers(users);
    }
}
