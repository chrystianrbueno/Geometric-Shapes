package com.dimed.geometricShapes.rest.tests;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
/**
 * 
 * @author Chrystian Rocha
 *
 */
@SpringBootTest
@AutoConfigureMockMvc
public class TriangleRestControllerTest {

	@Autowired
	MockMvc mvc;
	
	@Test
	public void ShouldReturnJsonFromTriangleUsingPathVariable() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/api/shapes/triangle/3/4"))
			.andExpect(status().isOk())
			.andExpect(content().string("{\"area\":6.0}"));
	}
	
	@Test
	public void ShouldReturnJsonFromTriangleUsingRequestParam() throws Exception{
		mvc.perform(MockMvcRequestBuilders.get("/api/shapes/triangle/")
		.param("base", "6").param("height", "7"))
			.andExpect(status().isOk())
			.andExpect(content().string("{\"area\":21.0}"));
		
	}
}
