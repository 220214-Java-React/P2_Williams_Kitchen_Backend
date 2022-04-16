package com.revature.williams_kitchen.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/externalrecipe")
public class ExternalFavoriteController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/recipeid")
    public List<Object> getRecipe(){

        String url = "https://www.themealdb.com/api/json/v2/9973533/filter.php?i=chicken_breast,garlic";
        Object[] objects = restTemplate.getForObject(url, Object[].class);

        return Arrays.asList(objects);
    }
}

