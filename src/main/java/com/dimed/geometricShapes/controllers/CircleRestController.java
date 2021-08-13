package com.dimed.geometricShapes.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dimed.geometricShapes.models.CircleModel;

/**
 * 
 * @author Chrystian Rocha
 *
 */
@RestController
@RequestMapping("api/shaders/circle")
public class CircleRestController {
	
	@RequestMapping(value = "/{radius}", method = RequestMethod.GET, produces = "application/json")
	public CircleModel returnCircle(@PathVariable("radius") double radius) {
		
		CircleModel newCircle = new CircleModel(radius);

		return newCircle;
	}

}
