package com.foodbox.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.foodbox.app.beans.Food;
import com.foodbox.app.service.IFoodService;
import com.foodbox.app.service.IUserService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class AdminController {


	@Autowired
	IFoodService foodService;
	
	@Autowired
	IUserService service;
	
	@RequestMapping(value = "/add",method = RequestMethod.POST)
	public ModelAndView addMovie(Food food) {
		
		foodService.addFood(food);
		
		return new ModelAndView("redirect:/admin/get");
	}
	
	@RequestMapping(value = "/update",method = RequestMethod.POST)
	public ModelAndView updateMovie(Food food) {
		
		foodService.updateFood(food);
		
		return new ModelAndView("redirect:/admin/get");
	}
	
	@RequestMapping(value = "/get",method = RequestMethod.GET)
	public ModelAndView getAllMovie(){
		
		List<Food> movieList = foodService.getAllFood();
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("movieList",movieList);
		mv.setViewName("AdminDashboard");
		return mv;
		
	}
	
	@RequestMapping(value="/delete/{id}",method = RequestMethod.POST)
	public ModelAndView deleteMovie(@RequestParam("id") int foodId){
		
		foodService.deleteFood(foodId);
		
		return new ModelAndView("redirect:/admin/get");
	}
	
	@RequestMapping(value="/get/name/{name}",method = RequestMethod.GET)
	public List<Food> searchFood(@RequestParam("name") String foodName){
		
		return foodService.getFoodByName(foodName);
	}
	
	@RequestMapping("/logout")
	public ModelAndView logut(HttpSession session){
		
		session.invalidate();
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("Logout");
		return mv;
	}


}
