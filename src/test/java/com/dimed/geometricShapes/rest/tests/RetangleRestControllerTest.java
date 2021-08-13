package com.dimed.geometricShapes.rest.tests;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

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
	public void ShouldReturnJsonFromRetangleUsingGet() throws Exception {
		mvc.perform(get("/api/shaders/retangle/2/4"))
		.andExpect(status().isOk())
		.andExpect(content().string("{\"area\":8.0}"));
	}
}
