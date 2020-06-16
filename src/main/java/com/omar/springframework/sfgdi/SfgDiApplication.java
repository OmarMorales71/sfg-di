package com.omar.springframework.sfgdi;

import com.omar.springframework.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = applicationContext.getBean("myController", MyController.class);

		String greeting = myController.sayHello();

		System.out.println(greeting);
	}

}
