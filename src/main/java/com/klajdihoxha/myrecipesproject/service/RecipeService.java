package com.klajdihoxha.myrecipesproject.service;

import com.klajdihoxha.myrecipesproject.model.Recipe;

import java.util.List;

public interface RecipeService {

    Recipe createRecipe(Recipe recipe);

    List<Recipe> getRecipes();
    List<Recipe> getRecipesByUser(Long userId);

    Recipe findRecipeById(Long recipeId);
    Recipe findRecipeByName(String recipeName);


    Recipe updateRecipe(Long recipeId, Recipe recipe);

    void deleteRecipe(Long recipeId);

}
