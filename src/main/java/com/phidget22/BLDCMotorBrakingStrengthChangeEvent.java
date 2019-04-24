package com.phidget22;

public class BLDCMotorBrakingStrengthChangeEvent {

	double BrakingStrength;
	BLDCMotor Source;

	public BLDCMotorBrakingStrengthChangeEvent(BLDCMotor paramBLDCMotor, double paramDouble) {
		this.Source = paramBLDCMotor;
		this.BrakingStrength = paramDouble;
	}

	public double getBrakingStrength() {
		return this.BrakingStrength;
	}

	public BLDCMotor getSource() {
		return this.Source;
	}

	@Override
	public String toString() {
		return "[BLDCMotorBrakingStrengthChangeEvent](Source: " + this.Source + ", " + "BrakingStrength: "
				+ this.BrakingStrength + ")";
	}
}
