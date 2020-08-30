package com.klajdihoxha.myrecipesproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klajdihoxha.myrecipesproject.models.Recipe;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long>{

}
