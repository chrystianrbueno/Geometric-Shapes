package com.dimed.geometricShapes.rest.tests;

import static org.mockito.Mockito.mock;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

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
	public void ShouldReturnJsonFromTriangleUsingGet() throws Exception {
		mvc.perform(MockMvcRequestBuilders
				.get("/api/shaders/triangle/3/4"))
				.andExpect(status().isOk())
				.andExpect(content().string("{\"area\":6.0}"));
	}
}
