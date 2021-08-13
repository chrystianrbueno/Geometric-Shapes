package com.dimed.geometricShapes.models.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.dimed.geometricShapes.models.CircleModel;
/**
 * 
 * @author Chrystian Rocha
 *
 */
public class CircleModelTest {
	
	@Test
	public void shouldReturnArea12Dot57FromCircleUsingRadius2() {
		CircleModel testCircle = new CircleModel(2);
		
		double expected = 12.57;
		double actual = testCircle.getArea();
		
		assertEquals(expected, actual, 0.01);
	}
}
