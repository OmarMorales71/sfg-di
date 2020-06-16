package com.omar.springframework.sfgdi.controllers;

import com.omar.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorGreetingService());


    }

    @Test
    void getGreeting() {
        System.out.println("Constructor: "+controller.getGreeting());
    }
}