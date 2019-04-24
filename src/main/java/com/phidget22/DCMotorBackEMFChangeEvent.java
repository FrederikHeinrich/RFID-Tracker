package com.phidget22;

public class DCMotorBackEMFChangeEvent {

	double BackEMF;
	DCMotor Source;

	public DCMotorBackEMFChangeEvent(DCMotor paramDCMotor, double paramDouble) {
		this.Source = paramDCMotor;
		this.BackEMF = paramDouble;
	}

	public double getBackEMF() {
		return this.BackEMF;
	}

	public DCMotor getSource() {
		return this.Source;
	}

	@Override
	public String toString() {
		return "[DCMotorBackEMFChangeEvent](Source: " + this.Source + ", " + "BackEMF: " + this.BackEMF + ")";
	}
}
