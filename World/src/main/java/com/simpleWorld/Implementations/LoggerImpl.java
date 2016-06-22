package com.simpleWorld.Implementations;

import java.util.Date;

import com.simpleWorld.Api.Logger;

public class LoggerImpl implements Logger {

	@Override
	public void log(String message) {
		System.out.println(new Date() + ": " + message);
	}

}
