package com.DayElevenFinallyblockDemo;

public class greatervalueExeception extends Exception {
	public greatervalueExeception(String string)
	{
		super(string);
	}
	public greatervalueExeception()
	{
	super("percentage should not be greater than 100");
	}

}
