package com.revature.williams_kitchen.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity(name = "Favorites")
@Data
public class Favorite {
    @Id
    private int userid;
    //-----------------
    private int recipeId;
    private String url;
}
