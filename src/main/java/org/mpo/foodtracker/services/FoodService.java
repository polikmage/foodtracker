package org.mpo.foodtracker.services;

import org.mpo.foodtracker.entities.Food;
import org.mpo.foodtracker.exception.ResourceNotFoundException;
import org.mpo.foodtracker.repositories.FoodRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Service
public class FoodService {

    private static final Logger log = LoggerFactory.getLogger(FoodService.class);

    @Autowired
    FoodRepository foodRepository;

    public List<Food> getAllFoods(){
        List<Food> foods = new LinkedList<>();
        foodRepository.findAll().forEach(m->foods.add(m));
        return foods;
    }
    public Food getFoodById(Long foodId) throws ResourceNotFoundException {
        Optional<Food> food = foodRepository.findById(foodId);
        if (food.isPresent()){
            return food.get();
        }
        else{
            throw new ResourceNotFoundException("Food with id: " +foodId + " was not found",404);
        }

    }
    public Food saveFood(Food food){
        food.setDateCreated(new Date());
        return foodRepository.save(food);
    }


    public Food updateFood(Food food, Long foodId) throws ResourceNotFoundException {
        food.setId(foodId);
        Optional<Food> persistedFood = foodRepository.findById(foodId);
        if (persistedFood.isPresent()) {
            return foodRepository.save(food);
        }
        else{
            throw new ResourceNotFoundException("Food with id: " +foodId + " was not found",404);
        }
    }
}
