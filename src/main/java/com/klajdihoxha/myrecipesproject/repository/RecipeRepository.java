package com.klajdihoxha.myrecipesproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klajdihoxha.myrecipesproject.model.Recipe;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long>{

}
