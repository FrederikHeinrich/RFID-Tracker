package com.phidget22;

public class RFIDTag {

	public RFIDProtocol protocol;
	public String tagString;

	@Override
	public String toString() {
		return "[RFIDTag](tagString: " + this.tagString + ", " + "protocol: " + this.protocol + ")";
	}
}
