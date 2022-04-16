package com.revature.williams_kitchen.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Favorites")
@Data
public class Favorite {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int favId;
    //-----------------
    private String username;
    private int recipeId;
    private String url;
}
