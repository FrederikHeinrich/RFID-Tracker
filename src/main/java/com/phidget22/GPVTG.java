package com.phidget22;

public class GPVTG {

	public double magneticHeading;

	public char mode;

	public double speed;

	public double speedKnots;
	public double trueHeading;

	@Override
	public String toString() {
		return "[GPVTG](trueHeading: " + this.trueHeading + ", " + "magneticHeading: " + this.magneticHeading + ", "
				+ "speedKnots: " + this.speedKnots + ", " + "speed: " + this.speed + ", " + "mode: " + this.mode + ")";
	}
}
