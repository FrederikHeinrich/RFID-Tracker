package com.phidget22;

public class RCServoTargetPositionReachedEvent {

	double Position;
	RCServo Source;

	public RCServoTargetPositionReachedEvent(RCServo paramRCServo, double paramDouble) {
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
		return "[RCServoTargetPositionReachedEvent](Source: " + this.Source + ", " + "Position: " + this.Position + ")";
	}
}
