package com.klajdihoxha.myrecipesproject.service.impl;

import com.klajdihoxha.myrecipesproject.model.Recipe;
import com.klajdihoxha.myrecipesproject.repository.RecipeRepository;
import com.klajdihoxha.myrecipesproject.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeServiceImpl implements RecipeService {

    @Autowired
    private RecipeRepository recipeRepo;

    @Override
    public Recipe createRecipe(Recipe recipe) {
        return recipeRepo.save(recipe);
    }

    @Override
    public List<Recipe> getRecipes() {
        return recipeRepo.findAll();
    }

    @Override
    public Recipe findRecipeById(Long recipeId) {
        return recipeRepo.findById(recipeId).get();
    }

    @Override
    public Recipe findRecipeByName(String recipeName) {
        return recipeRepo.findByName(recipeName);
    }

    @Override
    public Recipe updateRecipe(Long recipeId, Recipe updatedRecipe) {
        Recipe recipe = recipeRepo.findById(recipeId).get();

        if(updatedRecipe.getName() != null) {
            recipe.setName(updatedRecipe.getName());
        }
        if(updatedRecipe.getUser() != null) {
            recipe.setUser(updatedRecipe.getUser());
        }

        return recipeRepo.save(recipe);
    }

    @Override
    public void deleteRecipe(Long recipeId) {
        recipeRepo.deleteById(recipeId);
    }
}
