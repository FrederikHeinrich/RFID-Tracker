package com.phidget22;

import java.util.Arrays;

public class GyroscopeAngularRateUpdateEvent {
	double[] AngularRate;
	Gyroscope Source;
	double Timestamp;

	public GyroscopeAngularRateUpdateEvent(Gyroscope paramGyroscope, double[] paramArrayOfDouble, double paramDouble) {
		this.Source = paramGyroscope;
		this.AngularRate = paramArrayOfDouble;
		this.Timestamp = paramDouble;
	}

	public double[] getAngularRate() {
		return this.AngularRate;
	}

	public Gyroscope getSource() {
		return this.Source;
	}

	public double getTimestamp() {
		return this.Timestamp;
	}

	@Override
	public String toString() {
		return "[GyroscopeAngularRateUpdateEvent](Source: " + this.Source + ", " + "AngularRate: "
				+ Arrays.toString(this.AngularRate) + ", " + "Timestamp: " + this.Timestamp + ")";
	}
}
