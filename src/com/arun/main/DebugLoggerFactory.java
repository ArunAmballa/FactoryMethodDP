package com.arun.main;

public class DebugLoggerFactory implements ILoggerFactory{

	@Override
	public ILogger getInstance() {
		
		return new DebugLogger();
	}

}
