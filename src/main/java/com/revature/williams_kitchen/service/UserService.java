package com.revature.williams_kitchen.service;

import at.favre.lib.crypto.bcrypt.BCrypt;
import com.revature.williams_kitchen.model.User;
import com.revature.williams_kitchen.repository.UserRepository;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

@Service
public class UserService
{
    @Autowired
    UserRepository userRepository;
    private BCrypt.Hasher hasher;

    public User createUser(User user) {
        user.setPassword(encryptPassword(user.getPassword()));
        System.out.println(user.getPassword());
        return userRepository.save(user);

    }

    public List<User> getAllUsers() { return userRepository.findAll(); }

    public User findUserById(Integer id)
    {
        return userRepository.findById(id).orElse(new User());
    }


    public User findUserByUsernameAndPassword(String name, String password) {
        User user = userRepository.findByUsername(name).orElse(new User());
        System.out.println();
        System.out.println();
        if (validatePassword(encryptPassword(password),user.getPassword())) {

            return user;
        }
        throw new RuntimeException();
    }

    @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Incorrect credentials")
    public boolean validatePassword(String password,String realPassword) {
        try{
            if (!password.equals(realPassword)) {
                throw new Exception();
            }
            return true;
        } catch (Exception e) {
            System.out.println("invalid");
            return false;
        }
    }

    public String encryptPassword(String pass) {
        StringBuilder builder = new StringBuilder();
        try{

            MessageDigest encrypt = MessageDigest.getInstance("MD5");
            encrypt.update(pass.getBytes(StandardCharsets.UTF_8));
            byte[] bytes = encrypt.digest();


            for (int i = 0; i < bytes.length; i++) {
                builder.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(0));
            }
            System.out.println(builder.toString());

        } catch(NoSuchAlgorithmException e) {
            System.out.println(e);
        }
        return builder.toString();
    }
}
