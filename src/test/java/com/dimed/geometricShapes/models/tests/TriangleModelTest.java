package com.dimed.geometricShapes.models.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.dimed.geometricShapes.models.TriangleModel;

public class TriangleModelTest {

	@Test
	public void shouldReturnArea12FromTriangleUsingBase3AndHeight4() {
		TriangleModel newTriangle = new TriangleModel(3,4);
		
		double expected = 12.00;
		double actual = newTriangle.getArea();
		
		assertEquals(expected, actual, 0.01);
	}
}