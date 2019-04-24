package com.phidget22;

public class DCMotorVelocityUpdateEvent {
	DCMotor Source;

	double Velocity;

	public DCMotorVelocityUpdateEvent(DCMotor paramDCMotor, double paramDouble) {
		this.Source = paramDCMotor;
		this.Velocity = paramDouble;
	}

	public DCMotor getSource() {
		return this.Source;
	}

	public double getVelocity() {
		return this.Velocity;
	}

	@Override
	public String toString() {
		return "[DCMotorVelocityUpdateEvent](Source: " + this.Source + ", " + "Velocity: " + this.Velocity + ")";
	}
}
