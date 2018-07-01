package com.mindtree.ttg.assessment.question1;

import org.junit.Test;

import junit.framework.TestCase;

public class DeFactorialTest extends TestCase {

	@Test
	public void testCalcDeFactorialOne() {
		int n = 10;
		long expected = 189;
		DeFactorial object = new DeFactorial();
		long actual = object.calcDeFactorial(n);
		assertEquals(expected, actual);
	}
}