package com.phidget22;

public class RCServoPositionChangeEvent {

	double Position;
	RCServo Source;

	public RCServoPositionChangeEvent(RCServo paramRCServo, double paramDouble) {
		this.Source = paramRCServo;
		this.Position = paramDouble;
	}

	public double getPosition() {
		return this.Position;
	}

	public RCServo getSource() {
		return this.Source;
	}

	@Override
	public String toString() {
		return "[RCServoPositionChangeEvent](Source: " + this.Source + ", " + "Position: " + this.Position + ")";
	}
}
