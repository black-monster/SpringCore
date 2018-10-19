package com.nissan.practice.SpringCore;

import org.springframework.stereotype.Component;

@Component
public class Bike implements IVehicle {

	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Bike is running.");
	}

}
