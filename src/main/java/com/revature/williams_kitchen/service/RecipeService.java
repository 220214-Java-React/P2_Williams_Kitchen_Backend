package com.revature.williams_kitchen.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.revature.williams_kitchen.repository.RecipeRepository;
import com.revature.williams_kitchen.model.RecipeModel;
import java.util.List;

<<<<<<< Updated upstream
public class RecipeService {

=======
@Service
public class RecipeService
{
>>>>>>> Stashed changes
    @Autowired
    RecipeRepository recipeRepository;

    public RecipeModel createRecipe(RecipeModel recipe) {
        return recipeRepository.save(recipe);
    }
    public List<RecipeModel> getAllRecipe() { return recipeRepository.findAll(); }

<<<<<<< Updated upstream
    public RecipeModel findRecipeModelById(Integer id)
=======
    public RecipeModel findRecipeById(Integer id)
>>>>>>> Stashed changes
    {
        return recipeRepository.findById(id).orElse(new RecipeModel());
    }

<<<<<<< Updated upstream
}
=======
}
>>>>>>> Stashed changes
