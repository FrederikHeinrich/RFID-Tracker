package com.phidget22;

public class PHSensorPHChangeEvent {

	double PH;
	PHSensor Source;

	public PHSensorPHChangeEvent(PHSensor paramPHSensor, double paramDouble) {
		this.Source = paramPHSensor;
		this.PH = paramDouble;
	}

	public double getPH() {
		return this.PH;
	}

	public PHSensor getSource() {
		return this.Source;
	}

	@Override
	public String toString() {
		return "[PHSensorPHChangeEvent](Source: " + this.Source + ", " + "PH: " + this.PH + ")";
	}
}
