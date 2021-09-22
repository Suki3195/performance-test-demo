package com.demo.controller;


import com.demo.entity.User;
import com.demo.request.UserRequest;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create-user")
    public String createUser(@RequestBody UserRequest user){

        userService.createUser(user);
        return "USER SUCCESSFULLY CREATED";
    }

}
