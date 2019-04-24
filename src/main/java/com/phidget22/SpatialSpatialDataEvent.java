package com.phidget22;

import java.util.Arrays;

public class SpatialSpatialDataEvent {
	double[] Acceleration;
	double[] AngularRate;
	double[] MagneticField;
	Spatial Source;
	double Timestamp;

	public SpatialSpatialDataEvent(Spatial paramSpatial, double[] paramArrayOfDouble1, double[] paramArrayOfDouble2,
			double[] paramArrayOfDouble3, double paramDouble) {
		this.Source = paramSpatial;
		this.Acceleration = paramArrayOfDouble1;
		this.AngularRate = paramArrayOfDouble2;
		this.MagneticField = paramArrayOfDouble3;
		this.Timestamp = paramDouble;
	}

	public double[] getAcceleration() {
		return this.Acceleration;
	}

	public double[] getAngularRate() {
		return this.AngularRate;
	}

	public double[] getMagneticField() {
		return this.MagneticField;
	}

	public Spatial getSource() {
		return this.Source;
	}

	public double getTimestamp() {
		return this.Timestamp;
	}

	@Override
	public String toString() {
		return "[SpatialSpatialDataEvent](Source: " + this.Source + ", " + "Acceleration: "
				+ Arrays.toString(this.Acceleration) + ", " + "AngularRate: " + Arrays.toString(this.AngularRate) + ", "
				+ "MagneticField: " + Arrays.toString(this.MagneticField) + ", " + "Timestamp: " + this.Timestamp + ")";
	}
}
