package com.phidget22;

public class IRCode {

	public int bitCount;
	public String code;

	@Override
	public String toString() {
		return "[IRCode](code: " + this.code + ", " + "bitCount: " + this.bitCount + ")";
	}
}
