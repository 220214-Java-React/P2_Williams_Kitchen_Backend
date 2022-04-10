package com.revature.williams_kitchen.service;

import com.revature.williams_kitchen.model.User;
import com.revature.williams_kitchen.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService
{
    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers() { return userRepository.findAll(); }

    public User findUserById(Integer id)
    {
        return userRepository.findById(id).orElse(new User());
    }


}
