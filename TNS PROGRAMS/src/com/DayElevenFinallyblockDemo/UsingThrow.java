package com.DayElevenFinallyblockDemo;

import java.util.Scanner;

public class UsingThrow {
	
	static int AcceptNumber()
	{
		
		Scanner sc=new  Scanner(System.in);
		
		int n= sc.nextInt();
		sc.close();
		return n;
		
		
	}
	
	public static void main (String [] args) {
	int per;  
	System.out.println("enten your percentage");
	
	per=AcceptNumber();
	try {
		if(per<0)
			throw new negativeException();
		else if (per>100) 
		{
			throw new greatervalueExeception();
	  	}
		else 
			System.out.println("Valid percentage");
		
	}
	catch(negativeException | greatervalueExeception e)
	{
		System.err.println("Errorr..."+e.getMessage());
	}

	
	}

}
