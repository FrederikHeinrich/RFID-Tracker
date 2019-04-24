package com.phidget22;

import java.util.Arrays;

public class DistanceSensorSonarReflectionsUpdateEvent {
	int[] Amplitudes;
	int Count;
	int[] Distances;
	DistanceSensor Source;

	public DistanceSensorSonarReflectionsUpdateEvent(DistanceSensor paramDistanceSensor, int[] paramArrayOfInt1,
			int[] paramArrayOfInt2, int paramInt) {
		this.Source = paramDistanceSensor;
		this.Distances = paramArrayOfInt1;
		this.Amplitudes = paramArrayOfInt2;
		this.Count = paramInt;
	}

	public int[] getAmplitudes() {
		return this.Amplitudes;
	}

	public int getCount() {
		return this.Count;
	}

	public int[] getDistances() {
		return this.Distances;
	}

	public DistanceSensor getSource() {
		return this.Source;
	}

	@Override
	public String toString() {
		return "[DistanceSensorSonarReflectionsUpdateEvent](Source: " + this.Source + ", " + "Distances: "
				+ Arrays.toString(this.Distances) + ", " + "Amplitudes: " + Arrays.toString(this.Amplitudes) + ", "
				+ "Count: " + this.Count + ")";
	}
}
