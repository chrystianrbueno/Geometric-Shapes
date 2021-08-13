package com.dimed.geometricShapes.models.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.dimed.geometricShapes.models.SquareModel;
/**
 * 
 * @author Chrystian Rocha
 *
 */
public class SquareModelTest {

	@Test
	public void shouldReturnArea16FromSquareUsingSide4() {
		SquareModel testSquare = new SquareModel(4);
		
		double expected = 16.0000;
		double actual = testSquare.getArea();
		
		assertEquals(expected, actual, 0.0001);
	}
}
