package com.coderscampus.kevinassignment10.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class KevinAssignment10Config {

    @Value("${spoonacular.api.key}")
    private String apiKey;

    @Value("${spoonacular.urls.base}")
    private String spoonacularBaseUrl;

    @Value("${spoonacular.urls.mealplan}")
    private String mealPlanEndpoint;

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public String apiKey() {
        return apiKey;
    }

    @Bean
    public String spoonacularBaseUrl() {
        return spoonacularBaseUrl;
    }

    @Bean
    public String mealPlanEndpoint() {
        return mealPlanEndpoint;
    }
}
