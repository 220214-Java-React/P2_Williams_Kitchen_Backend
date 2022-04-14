package com.revature.williams_kitchen.model;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Entity(name = "recipe")
@Data
public class RecipeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int recipeId;
    private String recipeName;

    private String stepsList;
    private String prepTime;
    private String cookTime;
    private int ingredient1;
    private int ingredient2;
    private int ingredient3;
    private String ingredientList;
    private String cuisine;



}
