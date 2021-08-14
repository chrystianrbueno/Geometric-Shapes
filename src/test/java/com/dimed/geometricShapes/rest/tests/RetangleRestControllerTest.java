package com.dimed.geometricShapes.rest.tests;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
/**
 * 
 * @author Chrystian Rocha
 *
 */
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
/**
 * 
 * @author Chrystian Rocha
 *
 */
@SpringBootTest
@AutoConfigureMockMvc
public class RetangleRestControllerTest {

	@Autowired
	private MockMvc mvc;
	
	@Test
	public void ShouldReturnJsonFromRetangleUsingPathVariable() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/api/shapes/retangle/4/2"))
			.andExpect(status().isOk())
			.andExpect(content().string("{\"area\":8.0}"));
	}
	
	@Test
	public void ShouldReturnJsonFromRetangleUsingRequestParam() throws Exception{
		mvc.perform(MockMvcRequestBuilders.get("/api/shapes/retangle/")
			.param("base","7")
			.param("height","5"))
				.andExpect(status().isOk())
				.andExpect(content().string("{\"area\":35.0}"));
	}
}
