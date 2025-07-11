package com.DayThirteenSynchronization;

public class InSufficientBalanceExcepion extends Exception {

	public InSufficientBalanceExcepion()
	{
		super("Insufficient balance in your account");
	}
	
	public InSufficientBalanceExcepion(String message)
	{
		super(message);
	}
}