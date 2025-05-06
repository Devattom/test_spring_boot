package com.devattom.springboot.app.SpringBootApp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Value("${team.name}")
    public String teamName;

    @Value("${coach.name}")
    public String coachName;

    @GetMapping("/")
    public String sayHello() {
        return "Hello World! Team Name: " + teamName + " Coach Name: " + coachName;
    }

    @GetMapping("/new")
    public String newEndpoint()
    {
        return "New Endpoint";
    }

    @GetMapping("/HAHA")
    public String haha() {
        return "Haha";
    }
}
