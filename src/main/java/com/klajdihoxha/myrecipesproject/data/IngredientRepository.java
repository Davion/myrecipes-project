package com.klajdihoxha.myrecipesproject.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klajdihoxha.myrecipesproject.domain.Ingredient;

@Repository
public interface IngredientRepository extends CrudRepository<Ingredient, Long>{

}
