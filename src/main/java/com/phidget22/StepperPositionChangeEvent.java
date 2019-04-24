package com.phidget22;

public class StepperPositionChangeEvent {

	double Position;
	Stepper Source;

	public StepperPositionChangeEvent(Stepper paramStepper, double paramDouble) {
		this.Source = paramStepper;
		this.Position = paramDouble;
	}

	public double getPosition() {
		return this.Position;
	}

	public Stepper getSource() {
		return this.Source;
	}

	@Override
	public String toString() {
		return "[StepperPositionChangeEvent](Source: " + this.Source + ", " + "Position: " + this.Position + ")";
	}
}
