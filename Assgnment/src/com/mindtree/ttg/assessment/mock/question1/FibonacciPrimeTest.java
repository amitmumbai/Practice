package com.mindtree.ttg.assessment.mock.question1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciPrimeTest {


	@Test
	public void testIsFibPrimeOne() {
		int[] listOne = new int[5];
		
		FibonacciPrime fibPrime = new FibonacciPrime();
		listOne[0] = 10;
		listOne[1] = 3;
		listOne[2] = 5;
		listOne[3] = 4;
		listOne[4] = 89;

		String expected = new String ("nyyny");
		String actual = fibPrime.isFibPrime(listOne);
		assertEquals(expected, actual);
		
	}
}
