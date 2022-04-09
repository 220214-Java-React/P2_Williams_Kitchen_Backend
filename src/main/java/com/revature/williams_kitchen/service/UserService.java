package com.revature.williams_kitchen.service;

import com.revature.williams_kitchen.model.User;
import com.revature.williams_kitchen.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService
{
    @Autowired
    UserRepository userRepository;
}
