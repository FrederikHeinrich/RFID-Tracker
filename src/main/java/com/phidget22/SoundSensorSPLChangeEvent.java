package com.phidget22;

import java.util.Arrays;

public class SoundSensorSPLChangeEvent {
	double DB;
	double DBA;
	double DBC;
	double[] Octaves;
	SoundSensor Source;

	public SoundSensorSPLChangeEvent(SoundSensor paramSoundSensor, double paramDouble1, double paramDouble2,
			double paramDouble3, double[] paramArrayOfDouble) {
		this.Source = paramSoundSensor;
		this.DB = paramDouble1;
		this.DBA = paramDouble2;
		this.DBC = paramDouble3;
		this.Octaves = paramArrayOfDouble;
	}

	public double getDB() {
		return this.DB;
	}

	public double getDBA() {
		return this.DBA;
	}

	public double getDBC() {
		return this.DBC;
	}

	public double[] getOctaves() {
		return this.Octaves;
	}

	public SoundSensor getSource() {
		return this.Source;
	}

	@Override
	public String toString() {
		return "[SoundSensorSPLChangeEvent](Source: " + this.Source + ", " + "DB: " + this.DB + ", " + "DBA: "
				+ this.DBA + ", " + "DBC: " + this.DBC + ", " + "Octaves: " + Arrays.toString(this.Octaves) + ")";
	}
}
