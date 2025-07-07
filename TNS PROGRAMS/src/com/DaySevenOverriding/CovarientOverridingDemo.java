package com.DaySevenOverriding;

class Colour{
	
	protected Colour getColour()
	
	{
		Colour s= new Colour();
		return s;
		
	}
	

}

//child class  
 class RED extends Colour{
	 
	 protected RED getColour()
	 {
		 RED s= new RED();
		 return s;
	 }
	 
	 
 }

class BLUE extends Colour{
	 
	 protected BLUE getColour()
	 {
		 BLUE s= new BLUE();
		 return s;
	 }
	 
	 
 }



public class CovarientOverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
