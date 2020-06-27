package com.learncode.demospring;

import org.springframework.beans.factory.annotation.Required;

public class CarA implements Car {
private Engine engine;
private String carName;
private String cost;               
private String modelNumber;

	public CarA(String carName){
		this.carName=carName;
	}
	
	@Required
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Required
	public void setCost(String cost) {
		this.cost = cost;
	}
	
	@Required
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	@Override
	public void getPrice() {
		System.out.println("Car "+carName);
		System.out.println("Model Number "+modelNumber);
		System.out.println("Engine "+ engine.getDetails());
		System.out.println("Base Model Cost "+cost);

	}

}
