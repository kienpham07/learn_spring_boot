package com.kien.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice hitting with bat for 30 minutes, NOW!!! (Dependency Injection)";
    }
}
