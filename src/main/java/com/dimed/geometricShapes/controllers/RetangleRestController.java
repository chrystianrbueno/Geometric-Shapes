package com.dimed.geometricShapes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dimed.geometricShapes.models.RetangleModel;
/**
 * 
 * @author Chrystian Rocha
 *
 */
@RestController
@RequestMapping("api/shapes/retangle")
public class RetangleRestController {
	/**
	 * example using PathVariable: localhost:8080/api/shapes/retangle/7/5
	 * @param base
	 * @param height
	 * @return a new RetangleModel
	 */
	@RequestMapping(value= "/{base}/{height}", method= RequestMethod.GET, produces = "application/json")
	public RetangleModel returnRetangle(@PathVariable double base, @PathVariable double height) {
		
		RetangleModel newRetangle = new RetangleModel(base, height);
		
		return newRetangle;
	}
	
	/**
	 * example using pathParameter: localhost:8080/api/shapes/retangle/?base=7&height=5
	 * @param base
	 * @param height
	 * @return a new RetangleModel
	 */
	@GetMapping("/")
	public RetangleModel returnRetangleUsingRequestParam(@RequestParam double base, double height) {
		RetangleModel newRetangle = new RetangleModel(base, height);
		
		return newRetangle;
	}

}
