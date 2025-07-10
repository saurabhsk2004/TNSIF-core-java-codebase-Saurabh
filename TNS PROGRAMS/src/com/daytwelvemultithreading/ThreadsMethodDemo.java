package com.daytwelvemultithreading;

public class ThreadsMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildThread t1= new ChildThread(5,"first");
		ChildThread t2= new ChildThread(10,"Second");
		
		t1.start();
		t2.start();
		
		Thread.currentThread().setName("parent thread");
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("current thred "+Thread.currentThread());
		
		try 
		{
			t1.join();
			t2.join();
			
		}
		catch (InterruptedException e)
		{
			Thread.currentThread().interrupt();
			System.err.println("thred interrupted :"+e.getMessage());
		}
		
		System.out.println("---end of the program------");
		
	}

}
