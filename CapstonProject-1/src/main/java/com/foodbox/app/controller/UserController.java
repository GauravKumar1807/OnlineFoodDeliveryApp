package com.foodbox.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.foodbox.app.beans.Cart;
import com.foodbox.app.beans.Food;
import com.foodbox.app.service.ICartService;
import com.foodbox.app.service.IFoodService;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	ICartService cartService;
	
	@Autowired
	IFoodService foodService;
	
	@RequestMapping(value="/add/{foodId}/{uid}",method = RequestMethod.POST)
	public ModelAndView addTOCart(HttpServletRequest request) {
		
		int uid = Integer.parseInt(request.getParameter("uid"));
		int foodId = Integer.parseInt(request.getParameter("foodId"));
		Cart cart = new Cart();
		
		Food food = foodService.getFoodById(foodId);
		
		cart.setUid(uid);
		cart.setFoodId(food.getFoodId());
		cart.setFoodName(food.getFoodName());
		cart.setFoodCategory(food.getFoodCategory());
		cart.setFoodPrice(food.getFoodPrice());
		cart.setFoodDescription(food.getFoodDescription());
		cart.setFoodQuantity(food.getFoodQuantity());
		cart.setFoodStatus(food.getFoodStatus());
		cart.setFoodImageUrl(food.getFoodImageUrl());
		
		 cartService.addToCart(cart);
		 
		 return new ModelAndView("redirect:/user/get/cart/{uid}");
		
		
	}
	
	@RequestMapping(value="/delete/{cartId}",method = RequestMethod.POST)
	public ModelAndView deleteFromCart(HttpServletRequest request) {
		
		int cartId = Integer.parseInt(request.getParameter("cartId"));
		
		cartService.deleteFromCart(cartId);
		
		return new ModelAndView("redirect:/user/get/cart/{uid}");
	}
	
	@RequestMapping(value="/get/cart/{uid}")
	public ModelAndView viewCart(HttpServletRequest request){
		
		int uid = Integer.parseInt(request.getParameter("uid"));
		
		List<Cart> cartList = cartService.getByUid(uid);
		
        ModelAndView mv = new ModelAndView();
		
		mv.addObject("cartList",cartList);
		mv.setViewName("ViewCart");
		return mv;
		
	
	}
	@RequestMapping("/logout")
	public ModelAndView logut(HttpSession session){
		
		session.invalidate();
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("Logout");
		return mv;
	}
	
	@RequestMapping(value = "/get",method = RequestMethod.GET)
	public ModelAndView getAllMovie(){
		
		List<Food> foodList = foodService.getAllFood();
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("foodList",foodList);
		mv.setViewName("UserDashboard");
		return mv;
		
	}
	
	
	

}
