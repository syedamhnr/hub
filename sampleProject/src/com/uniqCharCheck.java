package com;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class uniqCharCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String notUniq;
		try {
		BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
		notUniq= buffReader.readLine();	
		Boolean is_uniq = checkUniq(notUniq);
		System.out.println(is_uniq ? "The word have  unique characters " : "the word do not have unique characters");
		} catch (IOException e) {
			System.out.println( "error while reading........");
			e.printStackTrace();
		}

	}

	private static Boolean checkUniq(String notUniq) {
		for (int i = 0 ; i < notUniq.length(); i++)
		{
		 String a = notUniq.substring(i,i+1);
		 String temp =  notUniq.substring(i+1);
		 if(temp.contains(a))
			 return false;
		    
		}
		
		return true;
	}

}
