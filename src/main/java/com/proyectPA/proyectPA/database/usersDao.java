package com.proyectPA.proyectPA.database;

import java.util.List;

import com.proyectPA.proyectPA.models.Users;

public interface usersDao {
    
    List<Users> getUsers();

    void follow(Long id);

}
