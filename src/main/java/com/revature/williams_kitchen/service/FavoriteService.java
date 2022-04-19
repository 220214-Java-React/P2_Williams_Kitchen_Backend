package com.revature.williams_kitchen.service;
import com.revature.williams_kitchen.model.Favorite;
import com.revature.williams_kitchen.repository.FavoriteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class FavoriteService
{
    @Autowired
    FavoriteRepository  favoriteRepository;
    @Autowired
    UserService userService;


    public  Favorite createFavorite(Favorite favorite) {
        return favoriteRepository.save(favorite);
    }

    public List<Favorite> getAllFavorites() { return favoriteRepository.findAll(); }

    public ArrayList<Favorite> findFavoritesById(Integer id)
    {
        String username = userService.findUserById(id).getUsername();
        ArrayList<Favorite> favList = favoriteRepository.findByUsername(username);

        return favList;
    }






}