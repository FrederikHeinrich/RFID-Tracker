package com.phidget22;

public class Log extends LogBase {
	public static native String[] getSources() throws PhidgetException;

	public Log() throws PhidgetException {
	}
}
