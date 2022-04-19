package com.revature.williams_kitchen.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.revature.williams_kitchen.repository.RecipeRepository;
import com.revature.williams_kitchen.model.RecipeModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RecipeService {

    @Autowired
    RecipeRepository recipeRepository;

    public RecipeModel createRecipe(RecipeModel recipe) {
        return recipeRepository.save(recipe);
    }
    public ArrayList<RecipeModel> getAllRecipe() { return (ArrayList<RecipeModel>) recipeRepository.findAll(); }

    public RecipeModel findRecipeModelById(Integer id)
    {
        return recipeRepository.findById(id).orElse(new RecipeModel());
    }

}
