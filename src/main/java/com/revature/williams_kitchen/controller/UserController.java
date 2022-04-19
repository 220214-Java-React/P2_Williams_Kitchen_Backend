package com.revature.williams_kitchen.controller;


import com.revature.williams_kitchen.model.User;
import com.revature.williams_kitchen.service.UserService;
import org.apache.tomcat.util.json.JSONParser;
import org.apache.tomcat.util.json.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController
{
    @Autowired
    UserService userService;


    @PostMapping("/create")
    @CrossOrigin
    public void createUserPost(@RequestBody User user) {
        userService.createUser(user);
    }

    @PostMapping("/{identifier}")
    @CrossOrigin
    public User findUserById(@PathVariable String identifier, @RequestBody String password) {
        System.out.println(password);
        try {
            int id = Integer.parseInt(identifier);
            return userService.findUserById(id);
        } catch (Exception e) {
            JSONParser jsonParser = new JSONParser(password);
            try {
                password = (String) jsonParser.list().get(0);
                System.out.println("password =" + password);
            } catch (ParseException er) {
                System.out.println("er = " + er.getMessage());
            }

            return userService.findUserByUsernameAndPassword(identifier, password);
        }
    }




}


