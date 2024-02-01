package com.coderscampus.kevinassignment10.repository;
import com.coderscampus.kevinassignment10.dto.DayResponse;
import com.coderscampus.kevinassignment10.dto.WeekResponse;
import com.coderscampus.kevinassignment10.service.SpoonacularApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public class MealPlanRepository {

    @Autowired
    private SpoonacularApiService spoonacularApiService;

    private WeekResponse weekResponse;
    private DayResponse dayResponse;

    public ResponseEntity<WeekResponse> getWeekResponse(String targetCalories,
                                                        String diet,
                                                        String exclude) {
        weekResponse = spoonacularApiService.getWeekMeals(targetCalories, diet, exclude);
        return ResponseEntity.ok(weekResponse);
    }

    public ResponseEntity<DayResponse> getDayResponse(String targetCalories,
                               String diet,
                               String exclude) {
        dayResponse = spoonacularApiService.getDayMeals(targetCalories, diet, exclude);
        return ResponseEntity.ok(dayResponse);
    }
}
