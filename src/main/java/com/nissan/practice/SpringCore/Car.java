package com.nissan.practice.SpringCore;

import org.springframework.stereotype.Component;

@Component
public class Car implements IVehicle{

	public void drive() {
		System.out.println("Nissan Leaf is running");
	}
}
