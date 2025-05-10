package com.epam.edai.run8.team18.service;

import com.epam.edai.run8.team18.model.Dish;
import com.epam.edai.run8.team18.repository.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DishService {

    private final DishRepository dishRepository;

    @Autowired
    public DishService(DishRepository dishRepository) {
        this.dishRepository = dishRepository;
    }

    public Dish saveDish(Dish dish) {
        return dishRepository.save(dish);
    }

    public Optional<Dish> getDish(Long id) {
        return dishRepository.findById(id);
    }

    public void deleteDish(Long id) {
        dishRepository.deleteById(id);
    }
}