package com.coderscampus.kevinassignment10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

public class WeekResponse {
    private Map<String, Day> week;

    public Map<String, Day> getWeek() {
        return week;
    }

    public void setWeek(Map<String, Day> week) {
        this.week = week;
    }
}
