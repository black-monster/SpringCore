package com.nissan.practice.SpringCore;

public class Tyre {

	
	String brandName;

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	@Override
	public String toString() {
		return "Tyre [brandName=" + brandName + "]";
	}
	
}
