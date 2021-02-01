package com.evolvus.junitdemo;

public class AirthmeticDivide {

	public int divideNumber(int a, int b) {
		System.out.println("divideNumber...." + a);
		if (a == 0) {
			throw new NullPointerException();
		}
		System.out.println("divideNumber post...." + a);

		int x = a / b;
		String.valueOf(x).length();
		return x;

	}
}
