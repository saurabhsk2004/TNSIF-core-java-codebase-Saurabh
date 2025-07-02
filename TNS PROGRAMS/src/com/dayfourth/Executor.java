package com.dayfourth;

public class Executor {
	public static void main (String[] args) {
		
		Base b1= new Base();
		
		b1.methodDefault();
		b1.methodPrivate();
		b1.methodPublic();
//		b1.methodProtected();
		
		b1.varDefault=11;
		b1.methodDefault();
		
	}

}
