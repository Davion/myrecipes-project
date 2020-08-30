package com.klajdihoxha.myrecipesproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.klajdihoxha.myrecipesproject.model.Recipe;
import com.klajdihoxha.myrecipesproject.repository.RecipeRepository;

@RestController
@RequestMapping("/recipes")
public class RecipeController {
	
	@Autowired
	private RecipeRepository recipeRepo;
	
	@GetMapping()
	public List<Recipe> getRecipes(){
		return recipeRepo.findAll();
	}
	
	@GetMapping("/{recipeId}")
	public Recipe getRecipe(@PathVariable Long recipeId){
		return recipeRepo.findById(recipeId).get();
	}
	
	@PostMapping(consumes = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public Recipe createRecipe(@RequestBody Recipe recipe) {
		return recipeRepo.save(recipe);
	}
	
	@PutMapping(path = "/{recipeId}", consumes = "application/json")
	public Recipe updateRecipe(@PathVariable Long recipeId, 
								@RequestBody Recipe updatedRecipe) {
		
		Recipe recipe = recipeRepo.findById(recipeId).get();
		
		if(updatedRecipe.getName() != null) {
			recipe.setName(updatedRecipe.getName());
		}
		if(updatedRecipe.getUser() != null) {
			recipe.setUser(updatedRecipe.getUser());
		}
		
		return recipeRepo.save(recipe);		
	}
	
	@DeleteMapping("/{recipeId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteRecipe(@PathVariable Long recipeId) {
		
		try {
			recipeRepo.deleteById(recipeId);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}