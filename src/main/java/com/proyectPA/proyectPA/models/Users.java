package com.proyectPA.proyectPA.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
public class Users {

    @Id
    @Getter @Setter @Column(name = "id_users")
    private Long id; 
    @Getter @Setter @Column(name = "name_users")
    private String name; 
    @Getter @Setter @Column(name = "nick_name_user")
    private String nickname; 
    @Getter @Setter @Column(name = "email_users")
    private String email; 
    @Getter @Setter @Column(name = "password_users")
    private String password; 
    @Getter @Setter @Column(name = "is_follow")
    private boolean follow; 

}
