package com.example.environment;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import javax.annotation.Resource;

@SpringBootTest
@ActiveProfiles("prod")
class EnvironmentAbstractionApplicationTests {
	@Resource(name = "env")
	private String env;

	@Test
	void contextLoads() {
	}

	@Test()
	void ProfileTest() {
		System.out.println(env);
	}

}
