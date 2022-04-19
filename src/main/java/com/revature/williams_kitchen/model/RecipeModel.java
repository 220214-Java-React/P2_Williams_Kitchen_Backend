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
    private int recipe_id;
    private int author_id;
    private String recipe_title;
    private String recipe_steps;
    private String prep_time;
    private String cook_time;
    private String ingredient_1;
    private String ingredient_2;
    private String ingredient_3;
    private String ingredient_list;
    private String recipes_culture;
    private String meal_image;
}
