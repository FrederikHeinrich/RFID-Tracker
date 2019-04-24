package com.phidget22;

public class PhidgetException extends Exception {

	private static final long serialVersionUID = 1L;
	private String description;

	private ErrorCode errno;

	private PhidgetException(int paramInt, String paramString) {
		super(paramString);

		this.errno = ErrorCode.getEnum(paramInt);
		this.description = paramString;
	}

	public String getDescription() {
		return this.description;
	}

	public ErrorCode getErrorCode() {
		return this.errno;
	}

	@Override
	public String toString() {
		return "PhidgetException " + this.errno + " (" + this.description + ")";
	}
}
