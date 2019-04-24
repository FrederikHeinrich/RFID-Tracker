package com.phidget22;

public class RFIDTagEvent {

	RFIDProtocol Protocol;
	RFID Source;

	String Tag;

	public RFIDTagEvent(RFID paramRFID, String paramString, RFIDProtocol paramRFIDProtocol) {
		this.Source = paramRFID;
		this.Tag = paramString;
		this.Protocol = paramRFIDProtocol;
	}

	public RFIDProtocol getProtocol() {
		return this.Protocol;
	}

	public RFID getSource() {
		return this.Source;
	}

	public String getTag() {
		return this.Tag;
	}

	@Override
	public String toString() {
		return "[RFIDTagEvent](Source: " + this.Source + ", " + "Tag: " + this.Tag + ", " + "Protocol: " + this.Protocol
				+ ")";
	}
}
