package com.revature.williams_kitchen.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "wk_recipes")
@Data
public class RecipeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int recipeId;
    private String recipeName;
    private String stepsList;
    private String prepTime;
    private String cookTime;
    private String ingredient1;
    private String ingredient2;
    private String ingredient3;
    private String ingredientList;
    private String cuisine;
}
