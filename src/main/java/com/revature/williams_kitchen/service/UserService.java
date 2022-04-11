package com.revature.williams_kitchen.service;

import com.revature.williams_kitchen.model.User;
import com.revature.williams_kitchen.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class UserService
{
    @Autowired
    UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }
    public List<User> getAllUsers() { return userRepository.findAll(); }

    public User findUserById(Integer id)
    {
        return userRepository.findById(id).orElse(new User());
    }

}
