package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DivideController {
	
	@GetMapping("/div/{i1}/{i2}")
	public String div(@PathVariable int i1, 
					@PathVariable int i2) {
		DivideOperation operation = new DivideOperation();
		double result;
		try {
			result = operation.calculate(i1, i2);
			return String.valueOf(result);
		} catch (DivideOperationException e) {
			return "Error Divide with zero";
		}
	}
}
