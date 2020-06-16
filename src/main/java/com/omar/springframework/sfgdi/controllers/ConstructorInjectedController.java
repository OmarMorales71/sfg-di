package com.omar.springframework.sfgdi.controllers;

import com.omar.springframework.sfgdi.services.GreetingService;

public class ConstructorInjectedController {

    private GreetingService greetingService;

    public  ConstructorInjectedController(GreetingService greetingService){
        this.greetingService=greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
