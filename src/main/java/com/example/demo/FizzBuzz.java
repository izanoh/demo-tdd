package com.example.demo;

public class FizzBuzz {

	public String say(int input) {

		Divide[] rules = {new DivideBy3(),
						new DivideBy5()};
		
		if(canDivideBy3(input)&&canDivideBy5(input)) {
			return "FizzBuzz";
		}
		
		for (Divide rule : rules){
			if(rule.canDivide(input)){
				return rule.say(input);
			}
		}
		
		return String.valueOf(input);
	}

	private boolean canDivideBy5(int input) {
		return input%5==0;
	}

	private boolean canDivideBy3(int input) {
		return input%3==0;
	}

}

interface Divide {
	boolean canDivide(int input);
	String say(int input);
}

class DivideBy3 implements Divide{
	
	@Override
	public boolean canDivide(int input) {
		return input%3==0;
	}

	@Override
	public String say(int input) {
		if (canDivide(input)) {
			return "Fizz";
		} else {
			return String.valueOf(input);
		}
	}
	
}

class DivideBy5 implements Divide{
	
	@Override
	public boolean canDivide(int input) {
		return input%5==0;
	}

	@Override
	public String say(int input) {
		if (canDivide(input)) {
			return "Buzz";
		} else {
			return String.valueOf(input);
		}
	}
	
}

