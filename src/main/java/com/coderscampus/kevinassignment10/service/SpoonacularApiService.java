package com.coderscampus.kevinassignment10.service;

import com.coderscampus.kevinassignment10.dto.DayResponse;
import com.coderscampus.kevinassignment10.dto.WeekResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class SpoonacularApiService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private String apiKey;

    @Autowired
    private String spoonacularBaseUrl;

    @Autowired
    private String mealPlanEndpoint;

    public WeekResponse getWeekMeals(String targetCalories, String diet, String exclude) {
        String apiUrl = buildApiUrl("week", targetCalories, diet, exclude);
        return restTemplate.getForObject(apiUrl, WeekResponse.class);
    }

    public DayResponse getDayMeals(String targetCalories, String diet, String exclude) {
        String apiUrl = buildApiUrl("day", targetCalories, diet, exclude);
        return restTemplate.getForObject(apiUrl, DayResponse.class);
    }

    private String buildApiUrl(String timeFrame, String targetCalories, String diet, String exclude) {
        if (spoonacularBaseUrl == null || mealPlanEndpoint == null || apiKey == null) {
            throw new IllegalArgumentException("One or more required properties are null");
        }
        return UriComponentsBuilder.fromHttpUrl(spoonacularBaseUrl + mealPlanEndpoint)
                .queryParam("timeFrame", timeFrame)
                .queryParam("targetCalories", targetCalories)
                .queryParam("diet", diet)
                .queryParam("exclude", exclude)
                .queryParam("apiKey", apiKey)
                .build()
                .toUriString();
    }
}
