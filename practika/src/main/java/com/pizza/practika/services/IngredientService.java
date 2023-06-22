package com.pizza.practika.services;

import com.pizza.practika.entities.Ingredient;

import java.util.List;

public interface IngredientService {
    Ingredient create(Ingredient ingredient);
    Ingredient readById(Long id);
    Ingredient update(Ingredient ingredient);
    void delete(Long id);
    List<Ingredient> getAll();
}
