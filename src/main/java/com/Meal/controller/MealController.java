package com.Meal.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.Meal.model.Meal;
import com.Meal.model.MealList;
import com.Meal.service.filter.MealFilter;

@Controller
@RequestMapping("/meal")
public class MealController {
	
	@GetMapping
	public ModelAndView listarTodasAsReceitas(@ModelAttribute("filtro") MealFilter filtro) {
		ModelAndView mv = new ModelAndView("meal");	
		RestTemplate restTemplate = new RestTemplate(); 
		
		
		if(filtro.getStrMeal() == null) {
			MealList entity = restTemplate.getForObject("https://www.themealdb.com/api/json/v1/1/search.php?s=", MealList.class);			
			List<Meal> meals = entity.getMeals();
			mv.addObject("meals", meals);
		}
		else if(filtro.getStrMeal() != null) {			
			UriComponents uri = UriComponentsBuilder.newInstance()
					.scheme("https")
					.host("www.themealdb.com")
					.path("api/json/v1/1/search.php")
					.queryParam("s", filtro.getStrMeal())						
					.build();	
			String url = uri.toString();
			
			MealList entity = restTemplate.getForObject(url, MealList.class);			
			List<Meal> meals = entity.getMeals();
			mv.addObject("meals", meals);
		}
		
				
		return mv;
	}
}
