package com.phidget22;

public class RCServoVelocityChangeEvent {
	RCServo Source;

	double Velocity;

	public RCServoVelocityChangeEvent(RCServo paramRCServo, double paramDouble) {
		this.Source = paramRCServo;
		this.Velocity = paramDouble;
	}

	public RCServo getSource() {
		return this.Source;
	}

	public double getVelocity() {
		return this.Velocity;
	}

	@Override
	public String toString() {
		return "[RCServoVelocityChangeEvent](Source: " + this.Source + ", " + "Velocity: " + this.Velocity + ")";
	}
}
