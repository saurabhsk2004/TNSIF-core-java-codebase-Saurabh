package com.DaySevenOverriding;

public class OverRidingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RBI rbi;
		//dynamic binding assiging child clas to refrence variable
		
		rbi= new SBI();
		System.out.println(rbi.getRateofInterest());
		
		rbi= new RBI();
		System.out.println(rbi.getRateofInterest());
		
		rbi= new ICICI();
		System.out.println(rbi.getRateofInterest());
		
		
		rbi= new HDFC();
		System.out.println(rbi.getRateofInterest());
	}

}
