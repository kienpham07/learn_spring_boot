package com.springapp.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // Inject my custom properties for coach.name and team.name
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // expose a new endpoint for "teaminfo"
    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "The coach is " + coachName + " and the team is " + teamName;
    }


    // expose "/" that returns "Hello World!"
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
