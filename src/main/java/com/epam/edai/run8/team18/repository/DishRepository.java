package com.epam.edai.run8.team18.repository;

import com.epam.edai.run8.team18.model.Dish;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DishRepository extends CrudRepository<Dish, Long> {
}