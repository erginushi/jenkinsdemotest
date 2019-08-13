/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docker.docker_project.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author kafka-user
 */
public class User {
    @JsonProperty("username")
    private String username;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    
        
    public String getUsername(){
        return username;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setFirstName(String firstname){
        this.firstName = firstname;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setLastName(String lastname){
        this.lastName = lastname;
    }
}