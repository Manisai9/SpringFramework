package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Vechile obj = (Vechile) context.getBean("bike");
		obj.drive();
	}
}
