package com.barboza.sfgdi;

import com.barboza.sfgdi.controllers.ConstructoriInjectedController;
import com.barboza.sfgdi.controllers.MyController;
import com.barboza.sfgdi.controllers.PropertyInjectedController;
import com.barboza.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		String returnString = myController.sayHello();
		System.out.println(returnString);
		System.out.println("----- Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("----- Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("----- Constructor");
		ConstructoriInjectedController constructoriInjectedController = (ConstructoriInjectedController) ctx.getBean("constructoriInjectedController");
		System.out.println(constructoriInjectedController.getGreeting());
	}

}
