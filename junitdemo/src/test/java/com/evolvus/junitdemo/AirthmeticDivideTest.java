package com.evolvus.junitdemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AirthmeticDivideTest {

	/*
	 * @Test public void test() { fail("Not yet implemented"); }
	 */

	@Test
	public void dividetest() {
		AirthmeticDivide at = new AirthmeticDivide();

		try {
			// code goes here
			// at.divideNumber(0, 2);
			 //assertEquals("divide", 2, at.divideNumber(0, 10));
			
			//fail();
			
			assertEquals("divide", 2, at.divideNumber(0, 10));

		} catch (NullPointerException e) {
			// TODO: handle exception
			assertEquals(e.getMessage(), (null));

		}
	}

}
