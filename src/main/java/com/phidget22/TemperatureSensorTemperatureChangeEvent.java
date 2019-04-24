package com.phidget22;

public class TemperatureSensorTemperatureChangeEvent {
	TemperatureSensor Source;

	double Temperature;

	public TemperatureSensorTemperatureChangeEvent(TemperatureSensor paramTemperatureSensor, double paramDouble) {
		this.Source = paramTemperatureSensor;
		this.Temperature = paramDouble;
	}

	public TemperatureSensor getSource() {
		return this.Source;
	}

	public double getTemperature() {
		return this.Temperature;
	}

	@Override
	public String toString() {
		return "[TemperatureSensorTemperatureChangeEvent](Source: " + this.Source + ", " + "Temperature: "
				+ this.Temperature + ")";
	}
}
