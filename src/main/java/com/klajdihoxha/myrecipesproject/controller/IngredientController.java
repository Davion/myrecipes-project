package com.klajdihoxha.myrecipesproject.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
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

import com.klajdihoxha.myrecipesproject.data.IngredientRepository;
import com.klajdihoxha.myrecipesproject.domain.Ingredient;

@RestController
@RequestMapping("/ingredients")
public class IngredientController {
	
	@Autowired
	private IngredientRepository ingredientRepo;
	
	@GetMapping()
	public List<Ingredient> getIngredients(){
		return ingredientRepo.findAll();
	}
	
	@GetMapping("/{ingredientId}")
	public Ingredient getIngredient(@PathVariable("ingredientId") Long ingredientId){
		return ingredientRepo.findById(ingredientId).get();
	}
	
	@PostMapping(consumes = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public Ingredient createIngredient(@RequestBody Ingredient ingredient) {
		return ingredientRepo.save(ingredient);
	}
	
//	@PutMapping("/{ingredientId}")
//	public Ingredient putIngredient(@PathVariable("ingredientId") Long ingredientId,
//									@RequestBody Ingredient ingredient) {
//		ingredient.setId(ingredientId);
//		return ingredientRepository.save(ingredient);
//	}
	
	@PutMapping(path = "/{ingredientId}", consumes = "application/json")
	public Ingredient updateIngredient(@PathVariable("ingredientId") Long ingredientId,
									@RequestBody Ingredient updatedIngredient) {
		
		Ingredient ingredient = ingredientRepo.findById(ingredientId).get();
		
		if(updatedIngredient.getName() != null) {
			ingredient.setName(updatedIngredient.getName());
		}
		if(updatedIngredient.getIcon() != null) {
			ingredient.setIcon(updatedIngredient.getIcon());
		}
		if(updatedIngredient.getDescription() != null) {
			ingredient.setDescription(updatedIngredient.getDescription());
		}
		
		return ingredientRepo.save(ingredient);
	}
	
	@DeleteMapping("/{ingredientId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteIgredient(@PathVariable("ingredientId") Long ingredientId) {
		try {
			ingredientRepo.deleteById(ingredientId);
		}catch (EmptyResultDataAccessException e) {
			// TODO: handle exception
		}
	}
	
}
