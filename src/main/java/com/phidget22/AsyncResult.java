package com.phidget22;

public class AsyncResult {

	ErrorCode ReturnCode;
	Phidget Source;

	public AsyncResult(Phidget paramPhidget, ErrorCode paramErrorCode) {
		this.Source = paramPhidget;
		this.ReturnCode = paramErrorCode;
	}

	public ErrorCode getReturnCode() {
		return this.ReturnCode;
	}

	public Phidget getSource() {
		return this.Source;
	}

	@Override
	public String toString() {
		return "[AsyncResult](Source: " + this.Source + ", " + "ReturnCode: " + this.ReturnCode + ")";
	}
}
