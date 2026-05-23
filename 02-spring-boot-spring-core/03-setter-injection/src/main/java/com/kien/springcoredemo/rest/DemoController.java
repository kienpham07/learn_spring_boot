package com.kien.springcoredemo.rest;

import com.kien.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field of Coach type
    private Coach myCoach;

    // define a constructor that injects the Coach object (dependency injection)
    @Autowired
    public void setCoach(Coach theCoach){ // Setter Injection
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
