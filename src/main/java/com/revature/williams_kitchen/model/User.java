package com.revature.williams_kitchen.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity(name = "users")
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
