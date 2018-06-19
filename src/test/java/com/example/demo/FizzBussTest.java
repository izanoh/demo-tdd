package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBussTest {

	@Test
	public void input_1_should_be_1() {
		FizzBuzz fb = new FizzBuzz();
		String actual = fb.say(1);
		assertEquals( "input 1 Should be 1", "1", actual);
	}
	
	@Test
	public void input_2_should_be_2() {
		FizzBuzz fb = new FizzBuzz();
		String actual = fb.say(2);
		assertEquals( "input 2 Should be 2 ", "2", actual);
	}
	
	@Test
	public void input_3_should_be_Fizz() {
		FizzBuzz fb = new FizzBuzz();
		String actual = fb.say(3);
		assertEquals( "input 3 Should be Fizz ", "Fizz", actual);
	}
	
	@Test
	public void input_4_should_be_4() {
		FizzBuzz fb = new FizzBuzz();
		String actual = fb.say(4);
		assertEquals( "input 4 Should be 4 ", "4", actual);
	}
	
	@Test
	public void input_5_should_be_Buzz() {
		FizzBuzz fb = new FizzBuzz();
		String actual = fb.say(5);
		assertEquals( "input 5 Should be Buzz ", "Buzz", actual);
	}
	
	@Test
	public void input_6_should_be_Fizz() {
		FizzBuzz fb = new FizzBuzz();
		String actual = fb.say(6);
		assertEquals( "input 6 Should be Fizz ", "Fizz", actual);
	}
	

	@Test
	public void input_7_should_be_7() {
		FizzBuzz fb = new FizzBuzz();
		String actual = fb.say(7);
		assertEquals( "input 7 Should be 7 ", "7", actual);
	}
	
	@Test
	public void input_8_should_be_8() {
		FizzBuzz fb = new FizzBuzz();
		String actual = fb.say(8);
		assertEquals( "input 8 Should be 8 ", "8", actual);
	}
	
	@Test
	public void input_9_should_be_Fizz() {
		FizzBuzz fb = new FizzBuzz();
		String actual = fb.say(9);
		assertEquals( "input 9 Should be Fizz ", "Fizz", actual);
	}

	@Test
	public void input_10_should_be_Buss() {
		FizzBuzz fb = new FizzBuzz();
		String actual = fb.say(10);
		assertEquals( "input 10 Should be Buzz ", "Buzz", actual);
	}
	
	@Test
	public void input_15_should_be_FizzBuzz() {
		FizzBuzz fb = new FizzBuzz();
		String actual = fb.say(15);
		assertEquals( "input 15 Should be FizzBuzz ", "FizzBuzz", actual);
	}
	
	@Test
	public void input_20_should_be_Buzz() {
		FizzBuzz fb = new FizzBuzz();
		String actual = fb.say(20);
		assertEquals( "input 20 Should be Buzz ", "Buzz", actual);
	}
}
