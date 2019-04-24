package com.phidget22;

public class GPSHeadingChangeEvent {

	double Heading;
	GPS Source;

	double Velocity;

	public GPSHeadingChangeEvent(GPS paramGPS, double paramDouble1, double paramDouble2) {
		this.Source = paramGPS;
		this.Heading = paramDouble1;
		this.Velocity = paramDouble2;
	}

	public double getHeading() {
		return this.Heading;
	}

	public GPS getSource() {
		return this.Source;
	}

	public double getVelocity() {
		return this.Velocity;
	}

	@Override
	public String toString() {
		return "[GPSHeadingChangeEvent](Source: " + this.Source + ", " + "Heading: " + this.Heading + ", "
				+ "Velocity: " + this.Velocity + ")";
	}
}
