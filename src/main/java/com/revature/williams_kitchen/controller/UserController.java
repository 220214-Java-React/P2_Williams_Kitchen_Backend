package com.revature.williams_kitchen.controller;


import com.revature.williams_kitchen.model.User;
import com.revature.williams_kitchen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController
{
    @Autowired
    UserService userService;

    @GetMapping("/{id}")
    public User findUserById(@PathVariable Integer id) {return userService.findUserById(id);}



}
