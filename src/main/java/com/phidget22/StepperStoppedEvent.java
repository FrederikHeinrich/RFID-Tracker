package com.phidget22;

public class StepperStoppedEvent {
	Stepper Source;

	public StepperStoppedEvent(Stepper paramStepper) {
		this.Source = paramStepper;
	}

	public Stepper getSource() {
		return this.Source;
	}

	@Override
	public String toString() {
		return "[StepperStoppedEvent](Source: " + this.Source + ")";
	}
}
