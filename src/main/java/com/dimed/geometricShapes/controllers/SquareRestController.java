package com.dimed.geometricShapes.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dimed.geometricShapes.models.SquareModel;

@RestController
@RequestMapping("api/shaders/square")
public class SquareRestController {

	@RequestMapping(value="/{side}", method = RequestMethod.GET, produces = "application/json")
	public SquareModel returnSquare(@PathVariable("side") double side) {
		
		SquareModel newSquare = new SquareModel(side);
		
		return newSquare;
		
	}
}