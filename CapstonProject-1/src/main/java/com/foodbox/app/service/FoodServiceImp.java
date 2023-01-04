package com.foodbox.app.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.foodbox.app.beans.Food;
@Service
public class FoodServiceImp  implements IFoodService{

	@Override
	public Food addFood(Food food) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Food updateFood(Food food) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Food> getAllFood() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<String> deleteFood(int foodId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Food getFoodById(int foodId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Food> getFoodByName(String foodName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Food> getFoodByPrice(double foodPrice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Food> getFoodByCategory(String foodCategory) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
