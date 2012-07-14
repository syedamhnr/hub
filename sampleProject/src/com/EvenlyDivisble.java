package com;

public class EvenlyDivisble {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	// dis is my sol
		 int n = 20;
	     long pr = 2520L;
	     int[] prime = {11,13,17,19};
       for(int i  : prime)
       {
        pr = pr*i; //multiplying all the prime numbers
       }
 	    for (int j = 11 ; j <= 20 ; j++)  
 	     {
 	    	// checking wether the nos from 11 to 20 divides the product
 	    	if(pr%j !=0 )
 	    	{
 	    		if(j%2==0)
 	    			pr= pr*2;
 	    		if(j%3==0)
 	    			pr= pr*3;
 	    	}
 	     }
      System.out.println(pr);
    
	}
	
	// one of the amazing  soln.. given in project eular
	/*int limit = 20;
	int[] primesBelowLimit = {2,3,5,7,11,13,17,19};
	int product = 1;
	for(int p : primesBelowLimit){
		product *= Math.pow(p, (int)(Math.log(limit)/Math.log(p))); 			
	}
	System.out.println(product);
	}*/
}
