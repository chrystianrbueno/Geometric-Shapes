package com.dimed.geometricShapes.models.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.dimed.geometricShapes.models.RetangleModel;

public class RetangleModelTest {

	@Test
	public void shouldReturnArea32FromRetangleUsingBase4AndHeight8() {
		RetangleModel newRetangle = new RetangleModel(4,8);
		
		double expected = 32.0000;
		double actual = newRetangle.getArea();
		
		assertEquals(expected, actual, 0.0001);
	}
}
