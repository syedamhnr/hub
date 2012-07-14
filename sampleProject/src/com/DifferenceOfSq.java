package com;

public class DifferenceOfSq {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long sum1 = 0L;
		long sum2 = 0l;
		for(int i = 1 ; i <=100 ; i ++)
		{
			double j = Math.pow(i, 2);
		    sum1 = (long) (sum1 +j);
		    sum2= sum2+i;
		   
		}
         sum2= (long) Math.pow(sum2, 2);
		System.out.println(""+(sum2-sum1));
	}
	
	//100001st prime num
	

}
