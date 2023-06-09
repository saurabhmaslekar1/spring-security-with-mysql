package com.thinkitive.simpleSpringSecurity.controller;

import com.thinkitive.simpleSpringSecurity.entity.Users;
import com.thinkitive.simpleSpringSecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/all")
    public List<Users> getAllUsers(){
        return userService.getAllUsers();
    }
}
