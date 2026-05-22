package com.kien.springcoredemo;

import org.springframework.stereotype.Component;

@Component // Mark this class as a bean for dependency injection
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice spin bowling for 10 minutes, NOW!!!";
    }
}
