package com.evolvus.junitdemo;

import org.junit.Test;

public class Exception1Test {

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	
	@Test(expected = ArithmeticException.class)
    public void testDivisionWithException() {
        int i = 1 / 0;
    }

}
