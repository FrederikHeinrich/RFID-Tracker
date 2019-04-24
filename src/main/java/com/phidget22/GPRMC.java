package com.phidget22;

public class GPRMC {

	public double heading;

	public double latitude;

	public double longitude;

	public double magneticVariation;

	public char mode;

	public double speedKnots;
	public char status;

	@Override
	public String toString() {
		return "[GPRMC](status: " + this.status + ", " + "latitude: " + this.latitude + ", " + "longitude: "
				+ this.longitude + ", " + "speedKnots: " + this.speedKnots + ", " + "heading: " + this.heading + ", "
				+ "magneticVariation: " + this.magneticVariation + ", " + "mode: " + this.mode + ")";
	}
}
