package com.daysixfinalMethod;


final class FinalClass
{
	
	void show() 
		{
		
			System.out.println("final class canot be inherited");
		}
}



public class FinalClassDemo
{

	public static void main(String[] args)
		{
		// TODO Auto-generated method stub
		FinalClass f = new FinalClass();
		f.show();
		}

}
