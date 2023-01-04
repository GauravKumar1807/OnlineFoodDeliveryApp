package com.foodbox.app.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="food_table")
public class Food {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int foodId;
	private String foodName;
	
	private double foodPrice ;
	
	private String foodCategory;
	
	private String foodStatus;
	
	private String foodDescription;
	
	private int foodQuantity;
	
	private String foodImageUrl;
	
	private boolean isEnabled;
	
		
}
