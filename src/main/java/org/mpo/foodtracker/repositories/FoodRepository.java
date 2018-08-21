package org.mpo.foodtracker.repositories;

import org.mpo.foodtracker.entities.Food;
import org.springframework.data.repository.CrudRepository;

public interface FoodRepository extends CrudRepository<Food,Long> {
}
