package com.revature.williams_kitchen;

import com.revature.williams_kitchen.model.RecipeModel;
import com.revature.williams_kitchen.repository.RecipeRepository;
import com.revature.williams_kitchen.service.RecipeService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

class RecipeServiceTests {

    @Mock
    private RecipeRepository repo;

    @Mock
    private RecipeModel recipe;

    @InjectMocks
    private RecipeService service;


    @Test
    void contextLoads(){}


    @Test
    public void testCreateRecipe(){
        int recipeId = 7659;
        String recipeName = "Pound Cake";
        String stepsList = "1. order it online; 2. wait for the package; 3. enjoy";
        String prepTime = "5 minutes";
        String cookTime = ".30 seconds";
        int ingredient1 = 2;
        int ingredient2 = 3;
        int ingredient3 = 1;
        String ingredientList = "hunger, internet, money";
        String cuisine = "American";


    }


}
