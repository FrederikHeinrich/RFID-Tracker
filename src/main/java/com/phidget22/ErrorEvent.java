package com.phidget22;

public class ErrorEvent {

	ErrorEventCode Code;

	String Description;
	Phidget Source;

	public ErrorEvent(Phidget paramPhidget, ErrorEventCode paramErrorEventCode, String paramString) {
		this.Source = paramPhidget;
		this.Code = paramErrorEventCode;
		this.Description = paramString;
	}

	public ErrorEventCode getCode() {
		return this.Code;
	}

	public String getDescription() {
		return this.Description;
	}

	public Phidget getSource() {
		return this.Source;
	}

	@Override
	public String toString() {
		return "[ErrorEvent](Source: " + this.Source + ", " + "Code: " + this.Code + ", " + "Description: "
				+ this.Description + ")";
	}
}
