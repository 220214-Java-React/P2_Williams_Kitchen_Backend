package com.revature.williams_kitchen.service;

import com.revature.williams_kitchen.model.RecipeModel;
import com.revature.williams_kitchen.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class RecipeService {
    @Autowired
    RecipeRepository recipeRepository;

    public List <RecipeModel>getAllFavorites(){
        return recipeRepository.findAll();
    }
    public void createNewFavorite(RecipeModel  favoriteRecipe){
        recipeRepository.save(favoriteRecipe);

    }

}
