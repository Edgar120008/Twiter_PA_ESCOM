package com.proyectPA.proyectPA.database;

import java.util.List;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
// import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.proyectPA.proyectPA.models.Users;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
@Transactional
public class usersDaoImp implements usersDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Users> getUsers() {
        String query = "FROM Users"; 

        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void follow(Long id) {
        Users users = entityManager.find(Users.class, id);
        users.setFollow(!users.isFollow());
        entityManager.merge(users);
    }

    @Override
    public void registerUsers(Users users){
        entityManager.merge(users);
    }

    @Override
    public boolean verifiUserData(Users users){
        String query = "FROM Users WHERE email = :email"; 

        List<Users> lists = entityManager.createQuery(query)
        .setParameter("email", users.getEmail())
        .getResultList();

        if(lists.isEmpty()){
            return false;
        }

        String passVerify = lists.get(0).getPassword();

        Argon2 argon2= Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);

        return argon2.verify(passVerify, users.getPassword());

        
    }
    
}
