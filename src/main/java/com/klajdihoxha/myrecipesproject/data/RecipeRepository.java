package com.klajdihoxha.myrecipesproject.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klajdihoxha.myrecipesproject.domain.Recipe;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long>{

}
