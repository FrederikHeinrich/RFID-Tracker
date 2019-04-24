package com.phidget22;

public class IRCodeEvent {

	int BitCount;

	String Code;

	boolean IsRepeat;
	IR Source;

	public IRCodeEvent(IR paramIR, String paramString, int paramInt, boolean paramBoolean) {
		this.Source = paramIR;
		this.Code = paramString;
		this.BitCount = paramInt;
		this.IsRepeat = paramBoolean;
	}

	public int getBitCount() {
		return this.BitCount;
	}

	public String getCode() {
		return this.Code;
	}

	public boolean getIsRepeat() {
		return this.IsRepeat;
	}

	public IR getSource() {
		return this.Source;
	}

	@Override
	public String toString() {
		return "[IRCodeEvent](Source: " + this.Source + ", " + "Code: " + this.Code + ", " + "BitCount: "
				+ this.BitCount + ", " + "IsRepeat: " + this.IsRepeat + ")";
	}
}
