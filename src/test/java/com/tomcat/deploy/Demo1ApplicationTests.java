package com.tomcat.deploy;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;




@SpringBootTest
@AutoConfigureMockMvc
class Demo1ApplicationTests {
	@Autowired
	private FirstController controller;
	
	@Autowired
	private MockMvc mockMvc;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

	@Test
	public void  checkThis() throws Exception {
	
		mockMvc.perform(get("/api/greet"))
			    .andExpect(status().isOk());
	}
	
	@Test
	public void checkThisToo() throws Exception {
	
		mockMvc.perform(get("/api/greet2"))
			    .andExpect(status().isOk());
	}
}
