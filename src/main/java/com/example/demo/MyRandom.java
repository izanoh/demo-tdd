package com.example.demo;

import java.util.Random;

public class MyRandom {
	
	Random random;
	
	public MyRandom() {
	}

	public MyRandom(Random random) {
		this.random = random;
	}

	public int generate() {
		Random random1 = new Random();
		return random1.nextInt(10);
	}
	
	public int generateStub() {
		return this.random.nextInt(10);
	}
}
