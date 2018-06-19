package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.MockitoAnnotations.initMocks;
import static org.mockito.BDDMockito.given;

public class AddControllerUnitTest {

	@Mock
	private AddOperation addOperation;
	
	private AddController addController;
	
	@Before
	public void inti() {
		initMocks(this);
		addController = new AddController();
		addController.setOperation(addOperation);
	}
	
	@Test
	public void test() {
		
		given(addOperation.calculate(1, 1)).willReturn(2.0);
		
		AddController addController = new AddController();
		addController.setOperation(addOperation);
		String actualResult = addController.add(1, 1);
		assertEquals("2.0", actualResult);
	}

}
