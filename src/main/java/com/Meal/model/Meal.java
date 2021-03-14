package com.Meal.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Meal{
	
	@JsonProperty("idMeal")
	private String idMeal;
	
	@JsonProperty("strMeal")
	private String strMeal;
	
	@JsonProperty("strCategory")
	private String strCategory;
	
	@JsonProperty("strArea")
	private String strArea;
	
	@JsonProperty("strMealThumb")
	private String strMealThumb;
	
	@JsonProperty("strInstructions")
	private String strInstructions;

	public String getIdMeal() {
		return idMeal;
	}

	public void setIdMeal(String idMeal) {
		this.idMeal = idMeal;
	}

	public String getStrMeal() {
		return strMeal;
	}

	public void setStrMeal(String strMeal) {
		this.strMeal = strMeal;
	}

	public String getStrCategory() {
		return strCategory;
	}

	public void setStrCategory(String strCategory) {
		this.strCategory = strCategory;
	}

	public String getStrArea() {
		return strArea;
	}

	public void setStrArea(String strArea) {
		this.strArea = strArea;
	}

	public String getStrMealThumb() {
		return strMealThumb;
	}

	public void setStrMealThumb(String strMealThumb) {
		this.strMealThumb = strMealThumb;
	}

	public String getStrInstructions() {
		return strInstructions;
	}

	public void setStrInstructions(String strInstructions) {
		this.strInstructions = strInstructions;
	}
	
	
	
}
