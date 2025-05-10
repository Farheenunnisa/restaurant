package com.epam.edai.run8.team18.controller;

import com.epam.edai.run8.team18.model.Dish;
import com.epam.edai.run8.team18.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/dishes")
public class DishController {

    private final DishService dishService;

    @Autowired
    public DishController(DishService dishService) {
        this.dishService = dishService;
    }

    @PostMapping
    public ResponseEntity<Dish> createDish(@RequestBody Dish dish) {
        Dish savedDish = dishService.saveDish(dish);
        return ResponseEntity.ok(savedDish);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Dish> getDish(@PathVariable Long id) {
        Optional<Dish> dish = dishService.getDish(id);
        return dish.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDish(@PathVariable Long id) {
        dishService.deleteDish(id);
        return ResponseEntity.noContent().build();
    }
}