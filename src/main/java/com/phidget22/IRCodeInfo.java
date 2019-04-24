package com.phidget22;

import java.util.Arrays;

public class IRCodeInfo {
	public int bitCount;
	public int carrierFrequency;
	public double dutyCycle;
	public IRCodeEncoding encoding;
	public int gap;
	public int[] header;
	public IRCodeLength length;
	public int minRepeat;
	public int[] one;
	public int[] repeat;
	public String toggleMask;
	public int trail;
	public int[] zero;

	@Override
	public String toString() {
		return "[IRCodeInfo](bitCount: " + this.bitCount + ", " + "encoding: " + this.encoding + ", " + "length: "
				+ this.length + ", " + "gap: " + this.gap + ", " + "trail: " + this.trail + ", " + "header: "
				+ Arrays.toString(this.header) + ", " + "one: " + Arrays.toString(this.one) + ", " + "zero: "
				+ Arrays.toString(this.zero) + ", " + "repeat: " + Arrays.toString(this.repeat) + ", " + "minRepeat: "
				+ this.minRepeat + ", " + "dutyCycle: " + this.dutyCycle + ", " + "carrierFrequency: "
				+ this.carrierFrequency + ", " + "toggleMask: " + this.toggleMask + ")";
	}
}
