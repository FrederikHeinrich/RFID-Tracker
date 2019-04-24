package com.phidget22;

import java.util.Arrays;

public class MagnetometerMagneticFieldChangeEvent {
	double[] MagneticField;
	Magnetometer Source;
	double Timestamp;

	public MagnetometerMagneticFieldChangeEvent(Magnetometer paramMagnetometer, double[] paramArrayOfDouble,
			double paramDouble) {
		this.Source = paramMagnetometer;
		this.MagneticField = paramArrayOfDouble;
		this.Timestamp = paramDouble;
	}

	public double[] getMagneticField() {
		return this.MagneticField;
	}

	public Magnetometer getSource() {
		return this.Source;
	}

	public double getTimestamp() {
		return this.Timestamp;
	}

	@Override
	public String toString() {
		return "[MagnetometerMagneticFieldChangeEvent](Source: " + this.Source + ", " + "MagneticField: "
				+ Arrays.toString(this.MagneticField) + ", " + "Timestamp: " + this.Timestamp + ")";
	}
}
