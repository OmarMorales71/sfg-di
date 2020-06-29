package com.omar.springframework.sfgdi;

import com.omar.springframework.sfgdi.controllers.*;
import com.omar.springframework.sfgdi.examplebeans.FakeDataSource;
import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.w3c.dom.ls.LSOutput;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SfgDiApplication.class, args);

        /*
        I18nController i18nController = applicationContext.getBean("i18nController", I18nController.class);

        System.out.println(i18nController.sayHello());

        MyController myController = applicationContext.getBean("myController", MyController.class);

        //String greeting = myController.sayHello();

        System.out.println("myController: " + myController.getGreeting());

        PropertyInjectedController propertyInjectedController = applicationContext.getBean("propertyInjectedController", PropertyInjectedController.class);

        System.out.println("Property: " + propertyInjectedController.getGreeting());

        SetterInjectedController setterInjectedController = applicationContext.getBean("setterInjectedController", SetterInjectedController.class);

        System.out.println("Setter: " + setterInjectedController.getGreeting());

        ConstructorInjectedController constructorInjectedController = applicationContext.getBean("constructorInjectedController", ConstructorInjectedController.class);

        System.out.println("Constructor: " + constructorInjectedController.getGreeting());
        */

        FakeDataSource fakeDataSource = applicationContext.getBean("fakeDataSource", FakeDataSource.class);

        System.out.println(fakeDataSource.getUser());

        System.out.println(fakeDataSource.getPassword());

        System.out.println(fakeDataSource.getUrl());
    }

}
