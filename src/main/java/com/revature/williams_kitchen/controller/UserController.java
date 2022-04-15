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

    @PostMapping("/create")
    public void createUserPost(@RequestBody User user) {
        userService.createUser(user);
    }

    @GetMapping("/{identifier}")
    public User findUserById(@PathVariable String identifier) {
        try {
            int id = Integer.parseInt(identifier);

            return userService.findUserById(id);
        } catch (Exception e) {
            return userService.findUserByUsername(identifier);
        }
    }


}
