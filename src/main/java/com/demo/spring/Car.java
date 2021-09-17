package com.demo.spring;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vechile {

	public void drive() {
		System.out.println("New Car");
	}
}
