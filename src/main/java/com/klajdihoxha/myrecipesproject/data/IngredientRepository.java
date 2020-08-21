package com.klajdihoxha.myrecipesproject.data;

import org.springframework.data.repository.CrudRepository;

import com.klajdihoxha.myrecipesproject.domain.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, Long>{

}
