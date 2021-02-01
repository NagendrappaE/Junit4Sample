package com.evolvus.junitdemo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BasicAnnotationTest {

	@Test
	public void test() {
		// fail("Not yet implemented");

		System.out.println("hhhhhh");
	}

	@BeforeClass
	public static void runOnceBeforeClass() {
		System.out.println("@BeforeClass - runOnceBeforeClass");
	}

	@AfterClass
	public static void runOnceAfterClass() {
		System.out.println("@AfterClass - runOnceAfterClass");
	}

	@Before
	public void runBeforeTestMethod() {
		System.out.println("@Before - runBeforeTestMethod");
	}
	
	@After
    public void runAfterTestMethod() {
        System.out.println("@After - runAfterTestMethod");
    }

	@Test
	public void test1() {
		// fail("Not yet implemented");

		System.out.println("yyyy");
	}

}
