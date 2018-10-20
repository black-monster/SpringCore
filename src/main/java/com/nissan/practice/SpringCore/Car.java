package com.nissan.practice.SpringCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements IVehicle{

	
	// This is for understanding Autowired annotation.
	@Autowired
	private Tyre tyre;
	
	
	public Tyre getTyre() {
		return tyre;
	}


	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	// Drive method for autowired annotation (Video 9).
	
	public void drive() {
		System.out.println("Car"+tyre);
	}
	
	
	
	// Drive method before video 9 (Autowired Annotation).
//	public void drive() {
//		System.out.println("Nissan Leaf is running");
//	}
}
