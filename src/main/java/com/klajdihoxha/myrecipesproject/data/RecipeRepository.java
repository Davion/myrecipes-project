package com.klajdihoxha.myrecipesproject.data;

import org.springframework.data.repository.CrudRepository;

import com.klajdihoxha.myrecipesproject.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long>{

}
