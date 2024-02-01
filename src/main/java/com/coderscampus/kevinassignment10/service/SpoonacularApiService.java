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

    public WeekResponse getWeekMeals(String numCalories, String diet, String exclusions) {
        String apiUrl = buildApiUrl("week", numCalories, diet, exclusions);
        return restTemplate.getForObject(apiUrl, WeekResponse.class);
    }

    public DayResponse getDayMeals(String numCalories, String diet, String exclusions) {
        String apiUrl = buildApiUrl("day", numCalories, diet, exclusions);
        return restTemplate.getForObject(apiUrl, DayResponse.class);
    }

    private String buildApiUrl(String timeFrame, String numCalories, String diet, String exclusions) {
        if (spoonacularBaseUrl == null || mealPlanEndpoint == null || apiKey == null) {
            throw new IllegalArgumentException("One or more required properties are null");
        }
        return UriComponentsBuilder.fromHttpUrl(spoonacularBaseUrl + mealPlanEndpoint)
                .queryParam("timeFrame", timeFrame)
                .queryParam("numCalories", numCalories)
                .queryParam("diet", diet)
                .queryParam("exclusions", exclusions)
                .queryParam("apiKey", apiKey)
                .build()
                .toUriString();
    }
}
