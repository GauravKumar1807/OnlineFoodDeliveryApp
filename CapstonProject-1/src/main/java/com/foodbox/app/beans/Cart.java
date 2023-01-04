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

@Table(name="user_table8")
public class Cart {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int cartId;
	private int foodId;
	private int uid;
	private String foodName;
	private double foodPrice;
    private String foodCategory;
	private String foodStatus;
	private String foodDescription;
	private String foodImageUrl;
	private int foodQuantity;
	}
	


