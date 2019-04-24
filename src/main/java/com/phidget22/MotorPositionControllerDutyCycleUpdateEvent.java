package com.phidget22;

public class MotorPositionControllerDutyCycleUpdateEvent {

	double DutyCycle;
	MotorPositionController Source;

	public MotorPositionControllerDutyCycleUpdateEvent(MotorPositionController paramMotorPositionController,
			double paramDouble) {
		this.Source = paramMotorPositionController;
		this.DutyCycle = paramDouble;
	}

	public double getDutyCycle() {
		return this.DutyCycle;
	}

	public MotorPositionController getSource() {
		return this.Source;
	}

	@Override
	public String toString() {
		return "[MotorPositionControllerDutyCycleUpdateEvent](Source: " + this.Source + ", " + "DutyCycle: "
				+ this.DutyCycle + ")";
	}
}
