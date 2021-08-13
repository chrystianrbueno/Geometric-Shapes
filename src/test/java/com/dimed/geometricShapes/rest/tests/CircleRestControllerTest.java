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
public class CircleRestControllerTest {

	@Autowired
	private MockMvc mvc;
	
	@Test
	public void ShouldReturnJsonFromCircleUsingGet() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/api/shaders/circle/1"))
		.andExpect(status().isOk())
		.andExpect(content().string("{\"area\":3.141592653589793}"));
	}
}
