package com.evolvus.junitdemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

//@ignore
public class CalculatorJunitTest {

	Calculator calculator = new Calculator();

	@Test
	public void testAddition() {
		System.out.println("calculator  addition test");
		assertEquals("addition", 8, calculator.add(5, 3));

	}

	@Test
	public void substratct() {
		System.out.println("calculator substration  test");
		assertEquals("substraction", 2, calculator.substratct(5, 3));

	}

}
