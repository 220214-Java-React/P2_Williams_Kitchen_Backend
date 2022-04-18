package com.revature.williams_kitchen.controller;

import com.revature.williams_kitchen.model.RecipeModel;
import com.revature.williams_kitchen.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/recipe")
@CrossOrigin
public class RecipeController {

    @Autowired
    RecipeService recipeService;

    @PostMapping("/create")
    public void recipeService(@RequestBody RecipeModel recipe) {
        recipeService.createRecipe(recipe);
    }

    @GetMapping
    public ArrayList<RecipeModel> getAllRecipes() { return recipeService.getAllRecipe();}

    @GetMapping("/{id}")
    public RecipeModel findRecipeModelById(@PathVariable Integer id) {return recipeService.findRecipeModelById(id);}

}
