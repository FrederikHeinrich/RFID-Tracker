package com.phidget22;

public class BLDCMotorVelocityUpdateEvent {
	BLDCMotor Source;

	double Velocity;

	public BLDCMotorVelocityUpdateEvent(BLDCMotor paramBLDCMotor, double paramDouble) {
		this.Source = paramBLDCMotor;
		this.Velocity = paramDouble;
	}

	public BLDCMotor getSource() {
		return this.Source;
	}

	public double getVelocity() {
		return this.Velocity;
	}

	@Override
	public String toString() {
		return "[BLDCMotorVelocityUpdateEvent](Source: " + this.Source + ", " + "Velocity: " + this.Velocity + ")";
	}
}
