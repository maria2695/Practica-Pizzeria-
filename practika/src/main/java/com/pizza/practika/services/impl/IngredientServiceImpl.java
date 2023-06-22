package com.pizza.practika.services.impl;

import com.pizza.practika.entities.Ingredient;
import com.pizza.practika.exception.NullEntityReferenceException;
import com.pizza.practika.repository.IngredientRepository;
import com.pizza.practika.services.IngredientService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IngredientServiceImpl implements IngredientService {
    private IngredientRepository ingredientRepository;
    @Override
    public Ingredient create(Ingredient ingredient) {
        if(ingredient != null){
            return ingredientRepository.save(ingredient);
        }
        throw new NullEntityReferenceException("Ingredient cannot be 'null'");
    }

    @Override
    public Ingredient readById(Long id) {
        return ingredientRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Ingredient with id"  + id +  "not found")
        );
    }

    @Override
    public Ingredient update(Ingredient ingredient) {
        if(ingredient != null){
            readById(ingredient.getId());
            return ingredientRepository.save(ingredient);
        }
        throw new NullEntityReferenceException("Ingredient cannot be 'null'");
    }

    @Override
    public void delete(Long id) {
        Ingredient ingredient = readById(id);
        ingredientRepository.delete(ingredient);

    }

    @Override
    public List<Ingredient> getAll() {
        return ingredientRepository.findAll();
    }
}
