package com.phidget22;

public class IRLearnEvent {

	String Code;

	IRCodeInfo CodeInfo;
	IR Source;

	public IRLearnEvent(IR paramIR, String paramString, IRCodeInfo paramIRCodeInfo) {
		this.Source = paramIR;
		this.Code = paramString;
		this.CodeInfo = paramIRCodeInfo;
	}

	public String getCode() {
		return this.Code;
	}

	public IRCodeInfo getCodeInfo() {
		return this.CodeInfo;
	}

	public IR getSource() {
		return this.Source;
	}

	@Override
	public String toString() {
		return "[IRLearnEvent](Source: " + this.Source + ", " + "Code: " + this.Code + ", " + "CodeInfo: "
				+ this.CodeInfo + ")";
	}
}
