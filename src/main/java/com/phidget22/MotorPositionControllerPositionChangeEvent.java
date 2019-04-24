package com.phidget22;

public class MotorPositionControllerPositionChangeEvent {

	double Position;
	MotorPositionController Source;

	public MotorPositionControllerPositionChangeEvent(MotorPositionController paramMotorPositionController,
			double paramDouble) {
		this.Source = paramMotorPositionController;
		this.Position = paramDouble;
	}

	public double getPosition() {
		return this.Position;
	}

	public MotorPositionController getSource() {
		return this.Source;
	}

	@Override
	public String toString() {
		return "[MotorPositionControllerPositionChangeEvent](Source: " + this.Source + ", " + "Position: "
				+ this.Position + ")";
	}
}
