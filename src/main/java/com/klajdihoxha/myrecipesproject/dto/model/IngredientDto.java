package com.klajdihoxha.myrecipesproject.dto.model;

import lombok.Data;

import java.util.Set;

@Data
public class IngredientDto {

    private String name;
    private String icon;
    private String description;

    private Set<RecipeDto> recipes;

}
