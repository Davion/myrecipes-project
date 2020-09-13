package com.klajdihoxha.myrecipesproject.service;

import com.klajdihoxha.myrecipesproject.model.Ingredient;

import java.util.List;

public interface IngredientService {

    Ingredient createIngredient(Ingredient ingredient);

    List<Ingredient> getIngredients();
    List<Ingredient> getIngredientsByRecipe(Long recipeId);
    Ingredient findIngredientById(Long ingredientId);
    Ingredient findIngredientByName(String ingredientName);

    Ingredient updateIngredient(Long ingredientId, Ingredient ingredient);

    void deleteIngredient(Long ingredientId);

}
