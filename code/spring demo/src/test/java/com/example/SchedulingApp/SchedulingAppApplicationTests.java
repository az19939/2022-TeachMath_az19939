package com.example.SchedulingApp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SchedulingAppApplicationTests {
	@Autowired
	HelloController HelloController;

	@Test
	void contextLoads() {
	}

	@Test
	void addTest() {
		assert(!HelloController.addName(null));
		assert(HelloController.addName("test"));
		assert(HelloController.names.contains("test"));
	}

}
