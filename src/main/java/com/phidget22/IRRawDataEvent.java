package com.phidget22;

import java.util.Arrays;

public class IRRawDataEvent {
	int[] Data;
	IR Source;

	public IRRawDataEvent(IR paramIR, int[] paramArrayOfInt) {
		this.Source = paramIR;
		this.Data = paramArrayOfInt;
	}

	public int[] getData() {
		return this.Data;
	}

	public IR getSource() {
		return this.Source;
	}

	@Override
	public String toString() {
		return "[IRRawDataEvent](Source: " + this.Source + ", " + "Data: " + Arrays.toString(this.Data) + ")";
	}
}
