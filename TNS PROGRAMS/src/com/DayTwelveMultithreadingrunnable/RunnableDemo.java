package com.DayTwelveMultithreadingrunnable;

public class RunnableDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		Runnable r=new UsingRunnable(10,1,"hi");
				
				Thread t1=new Thread(r);
					t1.start();
	}

}
