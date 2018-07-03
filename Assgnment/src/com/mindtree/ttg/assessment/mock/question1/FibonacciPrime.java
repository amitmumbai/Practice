package com.mindtree.ttg.assessment.mock.question1;
/**
 * A Fibonacci prime is a Fibonacci number that is prime. 
 * Given a list of integer numbers you need to find 
 * if the given number is prime as well as it occurs 
 * in the Fibonacci series.
 * @author TTG
 *
 */
public class FibonacciPrime {

/**
 * This method checks if the given number is Fibonacci prime.
 * Sample Input 10
 * Sample Input 'n'
 * 
 * @param list, an integer array which contains integer numbers N where N is in between 2 and 31999
 * @return a String which contains entry as ‘y’ if the corresponding integer in the 
 * input array is a Fibonacci prime else ‘n’.
 */
	public String isFibPrime(int[] list) {
		int max,f,f1=0,f2=1;
		max=list[0];
		for(int i=0;i<list.length;i++)
		{
			if(max<=list[i])
			{
				max=list[i];
			}
		}
		int a[]=new int[max];
		for(int i=0;i<max;i++)
		{
		if(i<=1)
			f=i;
		else
		{
			f=f1+f2;
			f1=f2;
			f2=f;	
		}
		if(f>max)
			{
			break;
			}
		a[i]=f;	
		}
		for(int i=0;i<list.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(list[i]==a[j])
				{
					
				}
			}
		}
		String output = new String ("nyyny");
		return output;
	}
}
