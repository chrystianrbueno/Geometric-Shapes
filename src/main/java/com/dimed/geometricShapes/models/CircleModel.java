package com.dimed.geometricShapes.models;
/**
 * 
 * @author Chrystian Rocha
 *
 */
public class CircleModel implements Figures{

	private double radius;
	
	public CircleModel(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.pow(radius, 2) * Math.PI;
	}

	@Override
	public String toString() {
		return "CircleModel [raio=" + radius + ", getArea()=" + getArea() + "]";
	}

}
