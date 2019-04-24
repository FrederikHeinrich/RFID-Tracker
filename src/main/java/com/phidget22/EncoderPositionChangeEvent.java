package com.phidget22;

public class EncoderPositionChangeEvent {

	boolean IndexTriggered;

	int PositionChange;
	Encoder Source;

	double TimeChange;

	public EncoderPositionChangeEvent(Encoder paramEncoder, int paramInt, double paramDouble, boolean paramBoolean) {
		this.Source = paramEncoder;
		this.PositionChange = paramInt;
		this.TimeChange = paramDouble;
		this.IndexTriggered = paramBoolean;
	}

	public boolean getIndexTriggered() {
		return this.IndexTriggered;
	}

	public int getPositionChange() {
		return this.PositionChange;
	}

	public Encoder getSource() {
		return this.Source;
	}

	public double getTimeChange() {
		return this.TimeChange;
	}

	@Override
	public String toString() {
		return "[EncoderPositionChangeEvent](Source: " + this.Source + ", " + "PositionChange: " + this.PositionChange
				+ ", " + "TimeChange: " + this.TimeChange + ", " + "IndexTriggered: " + this.IndexTriggered + ")";
	}
}
