package com.phidget22;

public class HumiditySensorHumidityChangeEvent {

	double Humidity;
	HumiditySensor Source;

	public HumiditySensorHumidityChangeEvent(HumiditySensor paramHumiditySensor, double paramDouble) {
		this.Source = paramHumiditySensor;
		this.Humidity = paramDouble;
	}

	public double getHumidity() {
		return this.Humidity;
	}

	public HumiditySensor getSource() {
		return this.Source;
	}

	@Override
	public String toString() {
		return "[HumiditySensorHumidityChangeEvent](Source: " + this.Source + ", " + "Humidity: " + this.Humidity + ")";
	}
}
