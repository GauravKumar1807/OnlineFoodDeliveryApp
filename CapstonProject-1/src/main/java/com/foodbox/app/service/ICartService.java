package com.foodbox.app.service;

import java.util.List;



import com.foodbox.app.beans.Cart;

public interface ICartService {

	public Cart addToCart(Cart cart);
	public void deleteFromCart(int cartId);
	public List<Cart> getByUid(int uid);


}
