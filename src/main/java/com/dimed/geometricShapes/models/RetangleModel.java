package com.dimed.geometricShapes.models;

public class RetangleModel implements Figures {
	private double base;
	private double height;

	
	public RetangleModel(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return base * height;
	}

	@Override
	public String toString() {
		return "RetangleModel [base=" + base + ", height=" + height + ", getArea()=" + getArea() + "]";
	}

}
