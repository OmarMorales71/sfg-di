package com.omar.springframework.sfgdi.controllers;

import com.omar.springframework.sfgdi.services.GreetingService;
import com.omar.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp(){
        controller = new PropertyInjectedController();

        controller.greetingService = new GreetingServiceImpl();

    }
    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}