package com.coderscampus.kevinassignment10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Nutrients {
    @JsonProperty("calories")
    private double calories;
    @JsonProperty("carbohydrates")
    private double carbohydrates;
    @JsonProperty("fat")
    private double fat;
    @JsonProperty("protein")
    private double protein;

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }
}
