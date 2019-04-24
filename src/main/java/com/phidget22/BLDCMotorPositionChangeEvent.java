package com.phidget22;

public class BLDCMotorPositionChangeEvent {

	double Position;
	BLDCMotor Source;

	public BLDCMotorPositionChangeEvent(BLDCMotor paramBLDCMotor, double paramDouble) {
		this.Source = paramBLDCMotor;
		this.Position = paramDouble;
	}

	public double getPosition() {
		return this.Position;
	}

	public BLDCMotor getSource() {
		return this.Source;
	}

	@Override
	public String toString() {
		return "[BLDCMotorPositionChangeEvent](Source: " + this.Source + ", " + "Position: " + this.Position + ")";
	}
}
