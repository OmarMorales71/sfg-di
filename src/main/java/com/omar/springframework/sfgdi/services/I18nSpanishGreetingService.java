package com.omar.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nGreetingService")
public class I18nSpanishGreetingService implements  GreetingService{
    @Override
    public String sayGreeting() {
        return "¡Hola mundo! - ES";
    }
}