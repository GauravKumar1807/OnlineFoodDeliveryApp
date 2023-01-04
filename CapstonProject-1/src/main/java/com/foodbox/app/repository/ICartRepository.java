package com.foodbox.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodbox.app.beans.Cart;
@Repository
public interface ICartRepository extends JpaRepository<Cart, Integer> {
	
	List<Cart> findByUid(int uid);

 

}
