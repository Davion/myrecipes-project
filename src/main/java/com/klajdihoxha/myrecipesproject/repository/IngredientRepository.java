package com.klajdihoxha.myrecipesproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.klajdihoxha.myrecipesproject.model.Ingredient;

import java.util.List;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Long>{
    Ingredient findByName(String name);

    @Query("select i from Ingredient i join i.recipes r where r.id = :recipeId")
    List<Ingredient> findAllByRecipe(@Param("recipeId") Long recipeId);
}
