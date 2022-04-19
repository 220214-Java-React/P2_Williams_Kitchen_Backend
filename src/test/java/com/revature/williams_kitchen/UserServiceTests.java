package com.revature.williams_kitchen;


import com.revature.williams_kitchen.model.User;
import com.revature.williams_kitchen.repository.UserRepository;
import com.revature.williams_kitchen.service.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;


@SpringBootTest
public class UserServiceTests{
    @Mock
    private UserRepository repo;

    @Mock
    private User user;

    @InjectMocks
    private UserService service;

    @Test
    void contextLoads(){}


    @Test
    public void testUsernameIsFoundOr(){
        String username = "always_enough";

        Mockito.when(repo.findByUsername(username)).thenReturn(Optional.of(user));
    }

    @Test
    public void testThrowsRuntimeExceptionUserNotFound(){
        String username = "always_enough";
        Mockito.when(repo.findByUsername(username)).thenReturn(null);
    }

}
