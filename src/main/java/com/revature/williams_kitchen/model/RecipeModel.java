package com.revature.williams_kitchen.model;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
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

   // this is to link each user to one or many recipes needs to be reviewed because
   // I think many people can make many the recipes Favorite

   // @ManyToMany
    // @JoinColumn(name="user_id")
    @ManyToMany(mappedBy = "FavoriteRecipes")



    private List<User> userFavoringRecipe;

  

    public void userFavoringRecipe(User user)
    {
        userFavoringRecipe.add(user);
    }
}
