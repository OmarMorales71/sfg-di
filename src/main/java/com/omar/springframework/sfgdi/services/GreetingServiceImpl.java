package com.omar.springframework.sfgdi.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Cheers!";
    }
}
