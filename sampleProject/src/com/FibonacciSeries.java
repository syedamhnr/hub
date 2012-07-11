package com;

public class FibonacciSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	int a = 0;
	int b = 1;
	int sum = 0 ;
	for(int i = 0 ; i < 32 ; i ++)
	{
		int c = a+b;
		a = b ;
		b = c;
		System.out.println("" +i + "  : " +c);
	
		if (c % 2 == 0 )
		{
			sum = sum +c;
		}
	}

	System.out.println(sum);
	}

}
