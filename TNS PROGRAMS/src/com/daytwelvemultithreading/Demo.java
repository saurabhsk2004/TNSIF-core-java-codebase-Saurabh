package com.daytwelvemultithreading;

public class Demo {
public static void main(String[] args)
{
	THREADLIFECYCLEDEMO myThread=new THREADLIFECYCLEDEMO();
	System.out.println("before runnable state Thred is alive or not?"+myThread.isAlive());
	myThread.start();
	
	try {
		Thread.sleep(600);
		
	}
	catch(InterruptedException e)
	{
		System.err.println(e.getMessage());
		
	}
	
	System.out.println("after execution state  Thred is alive or not?" +myThread.isAlive());
	
	
	
	
}

}
