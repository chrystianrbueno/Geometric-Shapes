package com.dimed.geometricShapes.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dimed.geometricShapes.models.RetangleModel;

/**
 * 
 * @author Chrystian Rocha
 *
 */
@RestController
@RequestMapping("api/shaders/retangle")
public class RetangleRestController {
	
	@RequestMapping(value= "/{base}/{height}", method= RequestMethod.GET, produces = "application/json")
	public RetangleModel returnRetangle(@PathVariable("base") double base, @PathVariable("height") double height) {
		RetangleModel newRetangle = new RetangleModel(base, height);
		
		return newRetangle;
	}

}
