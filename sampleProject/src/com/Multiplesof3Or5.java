package com;

public class Multiplesof3Or5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	int sum = 0;	
	// project eular no.1
	/*for(int i = 3; i<1000; i++)
	{
		if((i%3==0)||(i%5==0))
		{
			sum = sum+i;
			
		}
		
	}
	System.out.println(sum);*/
	 
	//project eular no 2
	int a = 0;
	int b = 1;
	int c ;
	for (int i = 1 ; i < 100-2 ; i++)
	{
	c = a+b;
	System.out.println(c);
	a=b;
	b=c;
	}
	
	}
	

}
