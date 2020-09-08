package com.klajdihoxha.myrecipesproject.dto.model;

import lombok.Data;

import java.util.Set;

@Data
public class RecipeDto {

    private String name;
    private Set<IngredientDto> ingredients;
    private String user;
}
