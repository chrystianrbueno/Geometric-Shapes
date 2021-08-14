package com.dimed.geometricShapes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dimed.geometricShapes.models.TriangleModel;
/**
 * 
 * @author Chrystian Rocha
 *
 */
@RestController
@RequestMapping("api/shapes/triangle")
public class TriangleRestController {
	/**
	 * example using PathVariable: localhost:8080/api/shapes/triangle/3/4
	 * @param base
	 * @param height
	 * @return a new TriangleModel
	 */
	@RequestMapping(value = "{base}/{height}", method = RequestMethod.GET, produces = "application/json")
	public TriangleModel returnTriangle(@PathVariable double base, @PathVariable double height){
		
		TriangleModel newTriangle = new TriangleModel(base, height);
		
		return newTriangle;
	}
	
	/**
	 * example using pathParameter: localhost:8080/api/shapes/triangle/?base=3&height=4
	 * @param base
	 * @param height
	 * @return
	 */
	@GetMapping("/")
	public TriangleModel returnTriangleUsingRequestParam(@RequestParam double base, double height) {
		
		TriangleModel newTriangle = new TriangleModel(base, height);
		
		return newTriangle;
	}
}
