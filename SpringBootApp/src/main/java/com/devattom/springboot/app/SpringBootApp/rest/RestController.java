package com.devattom.springboot.app.SpringBootApp.rest;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    // expose '/' endpoint that return hello world

    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
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
