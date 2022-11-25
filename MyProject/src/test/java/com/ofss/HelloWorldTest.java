package com.ofss;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HelloWorldTest {
	
	@Test
	public void testSayhello() {
		
		HelloWorld t = new HelloWorld();
		String actual = t.Sayhello();
		String expected ="Hello World !!";
		assertEquals(expected, actual);
	
	}
	
	
	// If you don't add this @Test annotation, this method will not be considered as a test case
		@Test
		public void testCalculateSimpleInterest()
		{
			// unit testing code for testing "calculateInterest()" method
			HelloWorld hw=new HelloWorld();
			double actual=hw.calculateSimpleInterest(1000, 0.1, 1);
			double expected=1100;
			// compare if actual is equal to expected, if so, unit testing passes
			// if not, unit testing fails, you need to look at the dev code for 
			// any fix required
			assertEquals(expected, actual);
		}

}
