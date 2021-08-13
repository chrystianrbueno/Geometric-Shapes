package com.dimed.geometricShapes.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dimed.geometricShapes.models.TriangleModel;

@RestController
@RequestMapping("api/shaders/triangle")
public class TriangleRestController {

	@RequestMapping(value = "{base}/{height}", method = RequestMethod.GET, produces = "application/json")
	public TriangleModel returnTriangle(@PathVariable double base, @PathVariable double height){
		
		TriangleModel newTriangle = new TriangleModel(base, height);
		
		return newTriangle;
	}
}
