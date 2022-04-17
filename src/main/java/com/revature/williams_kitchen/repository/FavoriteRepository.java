package com.revature.williams_kitchen.repository;
import com.revature.williams_kitchen.model.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface FavoriteRepository extends JpaRepository<Favorite, Integer> {

    ArrayList<Favorite> findByUsername(String username);
}
