package com.revature.williams_kitchen.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "wk_user_favorite")
@Data
public class Favorite {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int favId;
    //-----------------
    private String username;
    private int recipe_id;
    private String meal_url;
}
