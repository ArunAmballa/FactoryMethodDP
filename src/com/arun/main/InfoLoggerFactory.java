package com.arun.main;

public class InfoLoggerFactory implements ILoggerFactory{

	@Override
	public  ILogger getInstance() {
		
		return new InfoLogger();
	}

}
