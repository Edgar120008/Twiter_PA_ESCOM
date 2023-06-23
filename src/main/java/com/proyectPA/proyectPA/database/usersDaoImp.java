package com.proyectPA.proyectPA.database;

import java.util.List;

// import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.proyectPA.proyectPA.models.Users;

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

        List<Users> resultado = entityManager.createQuery(query).getResultList();
        return resultado;
    }

    @Override
    public void follow(Long id) {
        Users users = entityManager.find(Users.class, id);
        users.setFollow(!users.isFollow());
        entityManager.merge(users);
    }
    
}
