package com.foodbox.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodbox.app.beans.Food;
@Repository
public interface IFoodRepository extends JpaRepository<Food, Integer> {
	
	List<Food> findByFoodName(String foodName);
	List<Food> findByFoodCategory(String foodCategory);
	List<Food> findByFoodPrice(double foodPrice);
	
	
 

}
