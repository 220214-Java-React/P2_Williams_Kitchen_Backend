package com.revature.williams_kitchen.service;

import com.revature.williams_kitchen.model.User;
import com.revature.williams_kitchen.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService
{
    @Autowired
    UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }
}
