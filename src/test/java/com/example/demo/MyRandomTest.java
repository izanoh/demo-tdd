package com.example.demo;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class MyRandomTest {

	@Test
	public void test1() {
		Random ran = new Random() {
			@Override
			protected int next(int bits) {
				return 5;
			}
			
		};
		
		MyRandom myRandom = new MyRandom(ran);
		int actual = myRandom.generateStub();
		assertEquals(" it should be in 5 ", 5 , actual);
	}
	
	@Test
	public void test2() {
		Random ran = new Random5();
		MyRandom myRandom = new MyRandom(ran);
		int actual = myRandom.generateStub();
		assertEquals(" it should be in 5 ", 5 , actual);
	}
}

class Random5 extends Random {
 
	@Override
	protected int next(int bits) {
		return 5;
	}
	
}