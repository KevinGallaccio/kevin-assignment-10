package com.coderscampus.kevinassignment10.repository;
import com.coderscampus.kevinassignment10.dto.DayResponse;
import com.coderscampus.kevinassignment10.dto.WeekResponse;
import org.springframework.stereotype.Repository;

@Repository
public class MealPlanRepository {

    private WeekResponse weekResponse;
    private DayResponse dayResponse;

    public WeekResponse getWeekResponse() {
        return weekResponse;
    }

    public void setWeekResponse(WeekResponse weekResponse) {
        this.weekResponse = weekResponse;
    }

    public DayResponse getDayResponse() {
        return dayResponse;
    }

    public void setDayResponse(DayResponse dayResponse) {
        this.dayResponse = dayResponse;
    }
}
