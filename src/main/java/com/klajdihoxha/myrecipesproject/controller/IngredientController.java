package com.klajdihoxha.myrecipesproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.klajdihoxha.myrecipesproject.data.IngredientRepository;
import com.klajdihoxha.myrecipesproject.domain.Ingredient;

@RestController
@RequestMapping(path = "/ingredients")
public class IngredientController {
	
	@Autowired
	private IngredientRepository ingredientRepository;
	
	public IngredientController(IngredientRepository ingredientRepository) {
		this.ingredientRepository = ingredientRepository;
	}
	
	@GetMapping()
	public Iterable<Ingredient> getIngredients(){
		return ingredientRepository.findAll();
	}
	
	@PostMapping(consumes="application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public Ingredient postIngredient(@RequestBody Ingredient ingredient) {
		return ingredientRepository.save(ingredient);
	}
	
}
