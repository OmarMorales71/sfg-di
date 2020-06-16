package com.omar.springframework.sfgdi.controllers;

import com.omar.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    //@Autowired autowired is optional for constructors
    public  ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService){
        this.greetingService=greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
