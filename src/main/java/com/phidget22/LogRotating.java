package com.phidget22;

public class LogRotating {

	public int keepCount;
	public long size;

	@Override
	public String toString() {
		return "[LogRotating](size: " + this.size + ", " + "keepCount: " + this.keepCount + ")";
	}
}
