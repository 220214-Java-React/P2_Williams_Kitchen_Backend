package com.revature.williams_kitchen.controller;
import com.revature.williams_kitchen.model.RecipeModel;
import com.revature.williams_kitchen.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.print.PrinterGraphics;
import java.util.List;

@Controller
@RequestMapping("/Favorites")

public class RecipeController {
    @Autowired
    RecipeService recipeService;
// I am not sure about this if I need to make it Favorites and link it to users
    @PostMapping("/addFavorite")
    @ResponseBody
    public void createNewFavorite(@RequestBody RecipeModel Favorite){

        recipeService.createNewFavorite(Favorite);
    }
    @GetMapping("favorite/{id}")
    public List<RecipeModel> getAllFavorites(@PathVariable Integer id){
        return recipeService.getAllFavorites();
    }
    @GetMapping("/{id}")
    public RecipeModel findRecipeById(Integer id){
        return null;
    }

}
