package com.phidget22;

public class PressureSensorPressureChangeEvent {

	double Pressure;
	PressureSensor Source;

	public PressureSensorPressureChangeEvent(PressureSensor paramPressureSensor, double paramDouble) {
		this.Source = paramPressureSensor;
		this.Pressure = paramDouble;
	}

	public double getPressure() {
		return this.Pressure;
	}

	public PressureSensor getSource() {
		return this.Source;
	}

	@Override
	public String toString() {
		return "[PressureSensorPressureChangeEvent](Source: " + this.Source + ", " + "Pressure: " + this.Pressure + ")";
	}
}
