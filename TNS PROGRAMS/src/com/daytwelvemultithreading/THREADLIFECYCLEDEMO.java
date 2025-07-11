package com.daytwelvemultithreading;

public class THREADLIFECYCLEDEMO  extends Thread{


	public void run ()
	{
		System.out.println("--inside run() thread is alive or not ?"+this.isAlive());
		int num =0;
		while(num<4)
		{
			num++;
			System.out.println("num = "+num);
		}
		try {
			sleep(500);
			System.out.println("--is not runnable state, thread is alive or not ?"+this.isAlive());
		}
		catch(InterruptedException e)
		{
			System.out.println("thred is interrupted...." +e.getMessage());
		}
	
	}
}
