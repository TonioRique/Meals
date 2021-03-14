package com.Meal.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


public class MealList{
	
  	@JsonProperty("meals")
	private List<Meal> meals;

    public MealList() {
        meals = new ArrayList<>();
    }

	public List<Meal> getMeals() {
		return meals;
	}

	public void setMeals(List<Meal> meals) {
		this.meals = meals;
	}

	@Override
	public String toString() {
		return "MealList [meals=" + meals + "]";
	}
        
    
}
