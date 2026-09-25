package com.springboot.demo.myfirstapp.RestController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class funRestController {
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach Name" + coachName + " " + "team Name "+ teamName;
    }

    @GetMapping("/")
    public String sayHello(){
        return "Hello world";
    }

    @GetMapping("/workout")
    public String sayWorkout(){
        return "I am in workout";
    }
}
