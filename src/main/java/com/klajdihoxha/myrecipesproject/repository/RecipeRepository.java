package com.klajdihoxha.myrecipesproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klajdihoxha.myrecipesproject.model.Recipe;

import java.util.List;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long>{
    Recipe findByName(String name);

    List<Recipe> findAllByUser_Id(Long userId);
}
