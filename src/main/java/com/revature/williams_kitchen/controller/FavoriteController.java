package com.revature.williams_kitchen.controller;
import com.revature.williams_kitchen.model.Favorite;
import com.revature.williams_kitchen.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Favorites")
public class FavoriteController {
    @Autowired
    FavoriteService favoriteService;
    @PostMapping("/create")
    public void createFavoritePost(@RequestBody Favorite favorite) { favoriteService.createFavorite(favorite); }
    @GetMapping("/{id}")
    public Favorite findFavoriteById(@PathVariable Integer id) {return favoriteService.findFavoriteById(id);}
}


