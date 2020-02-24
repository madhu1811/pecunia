package com.cg.pecunia.exception;

public class AmountLessException extends Exception {
	public AmountLessException(String message)
	{
		super(message);
		
	}
	public AmountLessException()
	{
		super();
	}

}
