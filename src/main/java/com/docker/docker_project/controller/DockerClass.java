package com.docker.docker_project.controller;

import com.docker.docker_project.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerClass {

  @RequestMapping(value = "/greet/{name}", produces = { "application/json" }, method = RequestMethod.GET)
  public ResponseEntity<User> greeting(@PathVariable(value = "name") String name) {
      int statusCode = 200;
      User user = new User();
      user.setFirstName(name);
      user.setUsername(name + "User");
      user.setLastName(name.toUpperCase());
      return new ResponseEntity<>(user, HttpStatus.valueOf(statusCode));
  }
  
  @RequestMapping(value = "/greet", produces = { "application/json" }, consumes = { "application/json" }, method = RequestMethod.POST)
  public ResponseEntity<User> greetingBody(@RequestBody User user){
      int statusCode = 200;
      System.out.println("Hi!! " + user.getUsername() + "\nName: " + user.getFirstName()+ "" + user.getLastName());
      
      return new ResponseEntity<>(user, HttpStatus.valueOf(statusCode));
  }
}