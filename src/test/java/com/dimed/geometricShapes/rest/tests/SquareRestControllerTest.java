package com.dimed.geometricShapes.rest.tests;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
public class SquareRestControllerTest {

	@Autowired
	MockMvc mvc;
	
	@Test
	public void testReturnSquareJson() throws Exception {
		mvc.perform(MockMvcRequestBuilders
				.get("/api/shaders/square/2"))
				.andExpect(status().isOk())
				.andExpect(content().string("{\"area\":4.0}"));
	}
}
