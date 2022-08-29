package com.practice.controller;

import com.practice.entity.User;
import com.practice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    public UserService userService;


    @PostMapping(value = "/user")
    public ResponseEntity<String> addUser(@RequestBody User user) {
        userService.addUser(user);
        return new ResponseEntity<String>(
                "Success",
                HttpStatus.OK);
    }

    @GetMapping(value="/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }
}
