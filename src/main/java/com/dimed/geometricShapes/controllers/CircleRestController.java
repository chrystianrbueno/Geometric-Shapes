package com.dimed.geometricShapes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dimed.geometricShapes.models.CircleModel;

/**
 * 
 * @author Chrystian Rocha
 *
 */
@RestController
@RequestMapping("api/shapes/circle")
public class CircleRestController {
	/**
	 * example using PathVariable: localhost:8080/api/shapes/circle/5
	 * 
	 * @param radius
	 * @return a new CircleModel
	 */

	@RequestMapping(value = "/{radius}", method = RequestMethod.GET, produces = "application/json")
	public CircleModel returnCircle(@PathVariable double radius) {

		CircleModel newCircle = new CircleModel(radius);

		return newCircle;
	}

	/**
	 * 
	 * example using pathParameter: localhost:8080/api/shapes/circle/?radius=5
	 * @param radius
	 * @return a CircleModel
	 */
	@GetMapping("/")
	public CircleModel returnCircleUsingRequestParam(@RequestParam double radius) {
		
		CircleModel newCircle = new CircleModel(radius);
		
		return newCircle;
	}

}
