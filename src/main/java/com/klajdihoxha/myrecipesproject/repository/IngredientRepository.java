package com.klajdihoxha.myrecipesproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klajdihoxha.myrecipesproject.model.Ingredient;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Long>{
    Ingredient findByName(String name);
}
