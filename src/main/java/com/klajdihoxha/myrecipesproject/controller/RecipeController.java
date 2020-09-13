package com.klajdihoxha.myrecipesproject.controller;

import java.util.List;

import com.klajdihoxha.myrecipesproject.model.Ingredient;
import com.klajdihoxha.myrecipesproject.service.IngredientService;
import com.klajdihoxha.myrecipesproject.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import com.klajdihoxha.myrecipesproject.model.Recipe;

@RestController
@RequestMapping("/recipes")
public class RecipeController {
	
	@Autowired
	private RecipeService recipeService;

	@Autowired
	private IngredientService ingredientService;
	
	@GetMapping()
	public List<Recipe> getRecipes(){
		return recipeService.getRecipes();
	}
	
	@GetMapping("/{recipeId}")
	public Recipe getRecipe(@PathVariable Long recipeId){
		return recipeService.findRecipeById(recipeId);
	}

	@GetMapping("/{recipeId}/ingredients")
	public List<Ingredient> getRecipeIngredients(@PathVariable Long recipeId){
		return ingredientService.getIngredientsByRecipe(recipeId);
	}
	
	@PostMapping(consumes = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public Recipe createRecipe(@RequestBody Recipe recipe) {
		return recipeService.createRecipe(recipe);
	}
	
	@PutMapping(path = "/{recipeId}", consumes = "application/json")
	public Recipe updateRecipe(@PathVariable Long recipeId, 
								@RequestBody Recipe updatedRecipe) {
		return recipeService.updateRecipe(recipeId, updatedRecipe);
	}
	
	@DeleteMapping("/{recipeId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteRecipe(@PathVariable Long recipeId) {
		recipeService.deleteRecipe(recipeId);
	}
}