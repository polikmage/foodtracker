package org.mpo.foodtracker.controller;

import org.mpo.foodtracker.entities.Food;

import org.mpo.foodtracker.exception.ResourceNotFoundException;
import org.mpo.foodtracker.services.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/foods")
public class FoodsRestController {

    @Autowired
    FoodService foodService;


    @GetMapping("/")
    public List<Food> getAllFoods()
    {
        return foodService.getAllFoods();
    }

    @GetMapping("/{foodId}")
    public Food food(@PathVariable Long foodId) throws ResourceNotFoundException{
        return foodService.getFoodById(foodId);

    }

    @PostMapping()
    public Food add(@RequestBody Food food){
        foodService.saveFood(food);
        return food;
    }
    @PutMapping("/{foodId}")
    public Food update(@RequestBody Food food,@PathVariable Long foodId ) throws ResourceNotFoundException {
        foodService.updateFood(food,foodId);
        return food;
    }

}
