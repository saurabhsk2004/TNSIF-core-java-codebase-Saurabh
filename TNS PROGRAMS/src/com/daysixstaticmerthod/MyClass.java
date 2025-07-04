package com.daysixstaticmerthod;

public class MyClass {
	
	private int section;
	private static int srNo;
	
	
	static 
	{
		System.out.println("---witin main method----");
		srNo=1000;
		
	}


	public MyClass()
		{
			System.out.println("---witin constructor----");
			srNo++;
			section++;
		}


	@Override
	public String toString() {
		return "MyClass [section=" + section + "]";
	}	

	static void display()
	{
		System.out.println("serial no:" +srNo);
	}
	
	
}
