package com.example.demo;

public class DivideOperation {

	public double calculate(int operand1, int operand2) throws DivideOperationException {
		if (operand2==0) {
			throw new DivideOperationException();
		}
		return operand1/operand2;
	}

}
