package com.evolvus.junitdemo;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.fail;

import org.junit.Test;


public class Exception2Test {

	/*
	 * @Test public void test() { fail("Not yet implemented"); }
	 */
	@Test	
    public void testDivisionWithException() {
        try {
            int i = 1 / 0;
            fail(); //remember this line, else 'may' false positive
        } catch (ArithmeticException e) {
        	
       //e.printStackTrace();
        	
           assertThat(e.getMessage(), is("/ by zero"));

            //assert others
        }
    }

}
