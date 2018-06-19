package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class DivideControllerTest {
	
	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void _4_div_2_should_be_2() {
		String result = restTemplate.getForObject("/div/4/2", String.class);
		assertEquals( "It should be 2.0", "2.0", result);
	}
	
	@Test
	public void _90_div_3_should_be_30() {
		String result = restTemplate.getForObject("/div/90/3", String.class);
		assertEquals( "It should be 30.0","30.0", result);
	}
	
	@Test
	public void _1_div_0_should_be_error_divide_with_zero() {
		String result = restTemplate.getForObject("/div/1/0", String.class);
		assertEquals( "It should be error divide by zero", "Error Divide with zero", result);
	}

}
