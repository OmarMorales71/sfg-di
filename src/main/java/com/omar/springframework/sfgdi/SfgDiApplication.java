package com.omar.springframework.sfgdi;

import com.omar.springframework.sfgdi.controllers.ConstructorInjectedController;
import com.omar.springframework.sfgdi.controllers.MyController;
import com.omar.springframework.sfgdi.controllers.PropertyInjectedController;
import com.omar.springframework.sfgdi.controllers.SetterInjectedController;
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

		MyController myController = applicationContext.getBean("myController", MyController.class);

		String greeting = myController.sayHello();

		System.out.println(greeting);

		PropertyInjectedController propertyInjectedController = applicationContext.getBean("propertyInjectedController", PropertyInjectedController.class);

		System.out.println("Property: "+propertyInjectedController.getGreeting());

		SetterInjectedController setterInjectedController = applicationContext.getBean("setterInjectedController", SetterInjectedController.class);

		System.out.println("Setter: "+setterInjectedController.getGreeting());

		ConstructorInjectedController constructorInjectedController = applicationContext.getBean("constructorInjectedController", ConstructorInjectedController.class);

		System.out.println("Constructor: "+constructorInjectedController.getGreeting());

}

}