package com.dimed.geometricShapes.models;
/**
 * 
 * @author Chrystian Rocha
 *
 */
public class SquareModel implements Figures {

	private double side;
	
	public SquareModel(double side) {
		super();
		this.side = side;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.pow(side, 2);
	}

	@Override
	public String toString() {
		return "SquareModel [side=" + side + ", getArea()=" + getArea() + "]";
	}
	
}
