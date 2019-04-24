package com.phidget22;

public class GPSPositionFixStateChangeEvent {

	boolean PositionFixState;
	GPS Source;

	public GPSPositionFixStateChangeEvent(GPS paramGPS, boolean paramBoolean) {
		this.Source = paramGPS;
		this.PositionFixState = paramBoolean;
	}

	public boolean getPositionFixState() {
		return this.PositionFixState;
	}

	public GPS getSource() {
		return this.Source;
	}

	@Override
	public String toString() {
		return "[GPSPositionFixStateChangeEvent](Source: " + this.Source + ", " + "PositionFixState: "
				+ this.PositionFixState + ")";
	}
}
