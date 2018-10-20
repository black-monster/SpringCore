package com.nissan.practice.SpringCore;

import org.springframework.stereotype.Component;

@Component
public class Tyre {

	
	String brandName;

	public Tyre() {
		
	}
	public Tyre(String brandName) {
		super();
		this.brandName = brandName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	
	// toString Method for autowired annotation (video 9).
	
	@Override
	public String toString() {
		return "It's working.";
	}
	// toString Method before autowired annotation(Video 9).
	/*@Override
	public String toString() {
		return "Tyre [brandName=" + brandName + "]";
	}*/
	
}
