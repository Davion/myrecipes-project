package com.klajdihoxha.myrecipesproject.service.impl;

import com.klajdihoxha.myrecipesproject.model.Ingredient;
import com.klajdihoxha.myrecipesproject.repository.IngredientRepository;
import com.klajdihoxha.myrecipesproject.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientServiceImpl implements IngredientService {

    @Autowired
    private IngredientRepository ingredientRepo;

    @Override
    public Ingredient createIngredient(Ingredient ingredient) {
        return ingredientRepo.save(ingredient);
    }

    @Override
    public List<Ingredient> getIngredients() {
        return ingredientRepo.findAll();
    }

    @Override
    public Ingredient findIngredientById(Long ingredientId) {
        return ingredientRepo.findById(ingredientId).get();
    }

    @Override
    public Ingredient findIngredientByName(String ingredientName) {
        return ingredientRepo.findByName(ingredientName);
    }

    @Override
    public Ingredient updateIngredient(Long ingredientId, Ingredient updatedIngredient) {
        Ingredient ingredient = ingredientRepo.findById(ingredientId).get();

        if(updatedIngredient.getName() != null) {
            ingredient.setName(updatedIngredient.getName());
        }
        if(updatedIngredient.getIcon() != null) {
            ingredient.setIcon(updatedIngredient.getIcon());
        }
        if(updatedIngredient.getDescription() != null) {
            ingredient.setDescription(updatedIngredient.getDescription());
        }

        return ingredientRepo.save(ingredient);
    }

    @Override
    public void deleteIngredient(Long ingredientId) {
        ingredientRepo.deleteById(ingredientId);
    }
}
