package com.arun.main;

public class Client {
	
	
	public static void main(String args[])
	{
		ILoggerFactory loggerFactory=new InfoLoggerFactory();
		ILogger logger=loggerFactory.getInstance();
		logger.Log();
	}

}
