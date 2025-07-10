package com.DayElevenFinallyblockDemo;

public class greatervalueException extends Exception{
	public greatervalueException(String string)
	{
		super(string);
	}
	public greatervalueException()
	{
	super("percentage should not be greater than 100");
	}
}
