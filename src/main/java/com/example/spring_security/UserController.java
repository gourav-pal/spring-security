package com.example.spring_security;

import com.example.spring_security.model.User;
import com.example.spring_security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("register")
    public User saveUser(@RequestBody  User user){
        return service.saveUser(user);
    }
}
