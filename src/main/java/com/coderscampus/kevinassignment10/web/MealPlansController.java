package com.coderscampus.kevinassignment10.web;

import com.coderscampus.kevinassignment10.dto.DayResponse;
import com.coderscampus.kevinassignment10.dto.WeekResponse;
import com.coderscampus.kevinassignment10.repository.MealPlanRepository;
import com.coderscampus.kevinassignment10.service.SpoonacularApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mealplanner")
public class MealPlansController {

    @Autowired
    MealPlanRepository mealPlanRepository;

    @GetMapping("/week")

    public ResponseEntity<WeekResponse> getWeekMeals(String targetCalories,
                                                     String diet,
                                                     String exclude){
        return mealPlanRepository.getWeekResponse(targetCalories, diet, exclude);
    }

    @GetMapping("/day")

    public ResponseEntity<DayResponse> getDayMeals(String targetCalories,
                                                   String diet,
                                                   String exclude){
        return mealPlanRepository.getDayResponse(targetCalories, diet, exclude);
    }
}
