package com.dimed.geometricShapes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dimed.geometricShapes.models.SquareModel;
/**
 * 
 * @author Chrystian Rocha
 *
 */
@RestController
@RequestMapping("api/shapes/square")
public class SquareRestController {
	/**
	 * example using PathVariable: localhost:8080/api/shapes/square/5
	 * @param side
	 * @return a new SquareModel
	 */
	@RequestMapping(value="/{side}", method = RequestMethod.GET, produces = "application/json")
	public SquareModel returnSquare(@PathVariable double side) {
		
		SquareModel newSquare = new SquareModel(side);
		
		return newSquare;
	}
	
	/**
	 * example using pathParameter: localhost:8080/api/shapes/square/?side=7
	 * @param side
	 * @return a new SquareModel
	 */
	@GetMapping("/")
	public SquareModel returnSquareUsingRequestParam(@RequestParam double side) {
		
		SquareModel newSquare = new SquareModel(side);
		
		return newSquare;
	}
}