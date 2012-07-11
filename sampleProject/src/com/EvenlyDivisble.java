package com;

public class EvenlyDivisble {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 0;
		for( i = 2520 ; ; i = i +10)
		{
			for (int j= 1 ; j<=20 ; j ++)
			{
	          if(i%j==0)
	          {
	        	  continue;
	          }
	          else
	          {
	        	  break;
	          }
			}
			  System.out.println(i);
		}
    
	}

}
