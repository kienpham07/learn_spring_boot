package com.springapp.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping("/")

    public String sayHello() {
        return "Hello World!";
    }

    // expose a new endpoint for "workout"

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Workout!";
    }

    // expose a new endpoint for "fortune"

    @GetMapping("/fortune")
    public String getFortune() {
        return "Today is your lucky day!";
    }

}
