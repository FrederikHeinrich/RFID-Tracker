package com.phidget22;

public class StepperVelocityChangeEvent {
	Stepper Source;

	double Velocity;

	public StepperVelocityChangeEvent(Stepper paramStepper, double paramDouble) {
		this.Source = paramStepper;
		this.Velocity = paramDouble;
	}

	public Stepper getSource() {
		return this.Source;
	}

	public double getVelocity() {
		return this.Velocity;
	}

	@Override
	public String toString() {
		return "[StepperVelocityChangeEvent](Source: " + this.Source + ", " + "Velocity: " + this.Velocity + ")";
	}
}
