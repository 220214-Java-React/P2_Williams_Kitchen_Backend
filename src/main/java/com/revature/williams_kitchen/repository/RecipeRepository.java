package com.revature.williams_kitchen.repository;

import com.revature.williams_kitchen.model.RecipeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends JpaRepository<RecipeModel, Integer> { }

