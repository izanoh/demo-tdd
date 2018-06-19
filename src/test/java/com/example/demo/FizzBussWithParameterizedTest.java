package com.example.demo;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FizzBussWithParameterizedTest {
	private int input;
	private String output;
		
	public FizzBussWithParameterizedTest(int input, String output) {
		this.input = input;
		this.output = output;
	}
	
	@Test
	public void input_in_parameter_should_be_output_parameter() {
		FizzBuzz fb = new FizzBuzz();
		String actual = fb.say(input);
		assertEquals( "input "+ input +" Should be " + output, output, actual);
	}
	
	@Parameters
	public static Collection<Object[]> myData(){
		return Arrays.asList(new Object[][]{
			{1, "1"},
			{2, "2"},
			{3, "Fizz"},
			{4, "4"},
			{5, "Buzz"},
			{6, "Fizz"},
			{7, "7"},
			{8, "8"},
			{9, "Fizz"},
			{10, "Buzz"},
			{15, "FizzBuzz"},
			{20, "Buzz"},
			{21, "Fizz"},
			{22, "22"},
			{30, "FizzBuzz"},
		});
	}
	

}
