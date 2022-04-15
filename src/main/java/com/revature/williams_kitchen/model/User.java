package com.revature.williams_kitchen.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity(name = "wk_users")
@Data
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String email;
}
