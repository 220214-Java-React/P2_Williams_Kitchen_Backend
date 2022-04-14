package com.revature.williams_kitchen.service;
import com.revature.williams_kitchen.model.Favorite;
import com.revature.williams_kitchen.repository.FavoriteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class FavoriteService
{

    FavoriteRepository  favoriteRepository;
    public  Favorite createFavorite(Favorite favorite) {
        return favoriteRepository.save(favorite);
    }
    public List<Favorite> getAllFavorites() { return favoriteRepository.findAll(); }

    public Favorite findFavoriteById(Integer id)
    {
        return favoriteRepository.findById(id).orElse(new Favorite());
    }

}