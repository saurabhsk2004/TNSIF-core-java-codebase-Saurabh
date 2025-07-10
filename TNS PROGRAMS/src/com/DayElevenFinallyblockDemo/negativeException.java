package com.DayElevenFinallyblockDemo;

public class negativeException extends Exception{
	public negativeException(String string)
	{
		super(string);
	}
	public negativeException()
	{
		super ("Percentag should not be negative");
	}

}
