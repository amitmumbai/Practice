package com.mindtree.ttg.assessment.question1;

/**
 * Question 1 (De Factorial)
 * 
 * @author TTG
 * 
 */
public class DeFactorial {

	/**
	 * Given a number, it determines the product of number of digits in the
	 * factorial of the number and sum of digits in the factorial of the number.
	 * 
	 * @param n
	 *            and n is between 2 and 20 (inclusive of both)
	 * @return the product of number of digits in the factorial of the number
	 *         and sum of digits in the factorial of the number.
	 */
	public long calcDeFactorial(int n) {
		int f=1,c=0,s=0,r,product;
		for(int i=1;i<=n;i++)
		{
			f=f*i;
			System.out.println(f);
		}
		while(f!=0)
		{	
			r=f%10;
			s=s+r;
			f=f/10;
			c++;
		}
		product=s*c;
		return product;
	}

}
