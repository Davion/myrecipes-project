package com.klajdihoxha.myrecipesproject.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klajdihoxha.myrecipesproject.domain.Recipe;

@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long>{

}
