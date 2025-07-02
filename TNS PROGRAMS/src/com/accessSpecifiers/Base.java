package com.accessSpecifiers;

public class Base {
	
	int varDefault=10;
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;
	
	void methodDefault()
	{
		System.out.println("default access base class");
		System.out.println("default variable: " +varDefault);
		
		
	}
	void methodPublic()
	{
		System.out.println("public access base class");
		System.out.println("public variable: " +varPublic);
		
		
	}
	void methodPrivate()
	{
		System.out.println("private access base class");
		System.out.println("private variable: " +varPrivate);
		
		
	}
	void methodProtected()
	{
		System.out.println("protected access base class");
		System.out.println("protectedt variable: " +varProtected);
		
		
	}
	
	

}
