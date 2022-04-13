package com.revature.williams_kitchen.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
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

    // to link the users to favorite recipes
    @ManyToMany
    @JoinTable(
            name="Favored_Recipe"
    )
    private List<RecipeModel> FavoriteRecipes;

    public void FavoriteRecipe(RecipeModel recipeModel){
    FavoriteRecipes.add(recipeModel);
    }
}
