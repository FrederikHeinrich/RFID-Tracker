package com.phidget22;

import java.util.Arrays;

public class AccelerometerAccelerationChangeEvent {
	double[] Acceleration;
	Accelerometer Source;
	double Timestamp;

	public AccelerometerAccelerationChangeEvent(Accelerometer paramAccelerometer, double[] paramArrayOfDouble,
			double paramDouble) {
		this.Source = paramAccelerometer;
		this.Acceleration = paramArrayOfDouble;
		this.Timestamp = paramDouble;
	}

	public double[] getAcceleration() {
		return this.Acceleration;
	}

	public Accelerometer getSource() {
		return this.Source;
	}

	public double getTimestamp() {
		return this.Timestamp;
	}

	@Override
	public String toString() {
		return "[AccelerometerAccelerationChangeEvent](Source: " + this.Source + ", " + "Acceleration: "
				+ Arrays.toString(this.Acceleration) + ", " + "Timestamp: " + this.Timestamp + ")";
	}
}