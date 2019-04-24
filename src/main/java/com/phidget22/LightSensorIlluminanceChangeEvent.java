package com.phidget22;

public class LightSensorIlluminanceChangeEvent {

	double Illuminance;
	LightSensor Source;

	public LightSensorIlluminanceChangeEvent(LightSensor paramLightSensor, double paramDouble) {
		this.Source = paramLightSensor;
		this.Illuminance = paramDouble;
	}

	public double getIlluminance() {
		return this.Illuminance;
	}

	public LightSensor getSource() {
		return this.Source;
	}

	@Override
	public String toString() {
		return "[LightSensorIlluminanceChangeEvent](Source: " + this.Source + ", " + "Illuminance: " + this.Illuminance
				+ ")";
	}
}
