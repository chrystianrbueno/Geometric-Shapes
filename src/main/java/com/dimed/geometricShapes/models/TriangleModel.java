package com.dimed.geometricShapes.models;

public class TriangleModel implements Figures {

	private double base;
	private double height;
	
	public TriangleModel(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (base * height) / 2;
	}

	@Override
	public String toString() {
		return "TriangleModel [base=" + base + ", height=" + height + ", getArea()=" + getArea() + "]";
	}

}
