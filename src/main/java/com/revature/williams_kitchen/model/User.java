package com.revature.williams_kitchen.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity(name = "wk_users")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class User
{
    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    private int user_id;
    @Column(unique=true)
    private String username;
    private String password;
    private String first_name;
    private String last_name;
    private String email;
}
