package com.proyectPA.proyectPA.models;

public class user {

    private String name; 
    private String nickname; 
    private String email; 
    private String password; 

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getNickname(){
        return nickname;
    }

    public void setNickname(String nickname){
        this.nickname = nickname;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }
}
