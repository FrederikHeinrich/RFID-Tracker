package com.phidget22;

public class DCMotorBrakingStrengthChangeEvent {

	double BrakingStrength;
	DCMotor Source;

	public DCMotorBrakingStrengthChangeEvent(DCMotor paramDCMotor, double paramDouble) {
		this.Source = paramDCMotor;
		this.BrakingStrength = paramDouble;
	}

	public double getBrakingStrength() {
		return this.BrakingStrength;
	}

	public DCMotor getSource() {
		return this.Source;
	}

	@Override
	public String toString() {
		return "[DCMotorBrakingStrengthChangeEvent](Source: " + this.Source + ", " + "BrakingStrength: "
				+ this.BrakingStrength + ")";
	}
}
