package com.foodbox.app.service;

import java.util.List;

import org.springframework.http.ResponseEntity;


import com.foodbox.app.beans.Food;

public interface IFoodService {

	public Food addFood(Food food);
	public Food updateFood(Food food);
	public List<Food> getAllFood();
	public ResponseEntity<String> deleteFood(int foodId);
	public Food getFoodById(int foodId);
	
	public List<Food> getFoodByName(String foodName);
	public List<Food> getFoodByPrice(double foodPrice);
	public List<Food> getFoodByCategory(String foodCategory);
	
	

}
