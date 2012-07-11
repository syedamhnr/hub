package com;

public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int p = 1;
		int max = 0;
		for (int n = 999; n>= 900; n--)
		{  Boolean checkIsPalindrome = false;
		   int j = 0;
		   
			for ( j = 999; j >= 900; j--)
			{
				p = n*j;
				checkIsPalindrome = isPalindrome(p);
				if(checkIsPalindrome)
				{
					if(p>max)	
					{ 
						max = p;
					}
					
				}
            
				
			}
		    
		}
		  System.out.println(max);
}

	private static Boolean isPalindrome(int p) {
		
	
		String a = "" + p;
		String b = "" + p;
		StringBuffer rev = new StringBuffer(b);	
		  rev = rev.reverse();
	    b = "" +rev;
		if(b.equals(a))
			  return true;
		
		/*int cons = 0;
		int newno = 0;
		for (int i = 0; i <= m; i++ )
		{
		int rem = m%10;
	    m= m /10;
		newno =   newno*10 + rem;
		cons ++;	 
	    }
		if (cons == 2 )
			newno = newno*10;
		if (cons ==1 )
			newno = newno*100;
		
		if(newno == n)	
		return true ;
		*/
		return false;
	}

}
