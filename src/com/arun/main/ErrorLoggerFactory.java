package com.arun.main;

public class ErrorLoggerFactory implements ILoggerFactory{

	@Override
	public ILogger getInstance() {

		return new ErrorLogger();
	}

}
