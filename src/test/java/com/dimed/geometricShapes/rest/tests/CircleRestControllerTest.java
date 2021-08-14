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
	public void ShouldReturnJsonFromCircleUsingPathVariable() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/api/shapes/circle/1"))
			.andExpect(status().isOk())
			.andExpect(content().string("{\"radius\":1.0,\"area\":3.141592653589793}"));
	}
	
	@Test
	public void ShouldReturnJsonFromCircleUsingRequestParam() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/api/shapes/circle/")
			.param("radius", "2"))
				.andExpect(status().isOk())
				.andExpect(content().string("{\"radius\":2.0,\"area\":12.566370614359172}"));
	}
}
