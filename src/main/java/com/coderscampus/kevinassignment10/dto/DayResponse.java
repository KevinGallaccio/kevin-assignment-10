package com.coderscampus.kevinassignment10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class DayResponse {
    @JsonProperty("meals")
    private List<Meal> meals;
    @JsonProperty("nutrients")
    private Nutrients nutrients;

    public List<Meal> getMeals() {
        return meals;
    }

    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }

    public Nutrients getNutrients() {
        return nutrients;
    }

    public void setNutrients(Nutrients nutrients) {
        this.nutrients = nutrients;
    }
}
