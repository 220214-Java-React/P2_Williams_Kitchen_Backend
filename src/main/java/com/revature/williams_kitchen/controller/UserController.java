package com.revature.williams_kitchen.controller;


import com.revature.williams_kitchen.model.User;
import com.revature.williams_kitchen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController
{
    @Autowired
    UserService userService;

    @PostMapping("/create")
    public void createUserPost(@RequestBody User user) {
        userService.createUser(user);
    }

}
