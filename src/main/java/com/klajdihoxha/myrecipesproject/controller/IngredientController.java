package com.klajdihoxha.myrecipesproject.controller;

import java.util.List;

import com.klajdihoxha.myrecipesproject.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import com.klajdihoxha.myrecipesproject.model.Ingredient;

@RestController
@RequestMapping("/ingredients")
public class IngredientController {
	
	@Autowired
	private IngredientService ingredientService;
	
	@GetMapping()
	public List<Ingredient> getIngredients(){
		return ingredientService.getIngredients();
	}
	
	@GetMapping("/{ingredientId}")
	public Ingredient getIngredient(@PathVariable("ingredientId") Long ingredientId){
		return ingredientService.findIngredientById(ingredientId);
	}
	
	@PostMapping(consumes = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public Ingredient createIngredient(@RequestBody Ingredient ingredient) {
		return ingredientService.createIngredient(ingredient);
	}
	
	@PutMapping(path = "/{ingredientId}", consumes = "application/json")
	public Ingredient updateIngredient(@PathVariable("ingredientId") Long ingredientId,
									@RequestBody Ingredient updatedIngredient) {
		
		return ingredientService.updateIngredient(ingredientId, updatedIngredient);
	}
	
	@DeleteMapping("/{ingredientId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteIngredient(@PathVariable("ingredientId") Long ingredientId) {
		ingredientService.deleteIngredient(ingredientId);
	}
	
}
