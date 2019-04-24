package com.phidget22;

public class DistanceSensorDistanceChangeEvent {

	int Distance;
	DistanceSensor Source;

	public DistanceSensorDistanceChangeEvent(DistanceSensor paramDistanceSensor, int paramInt) {
		this.Source = paramDistanceSensor;
		this.Distance = paramInt;
	}

	public int getDistance() {
		return this.Distance;
	}

	public DistanceSensor getSource() {
		return this.Source;
	}

	@Override
	public String toString() {
		return "[DistanceSensorDistanceChangeEvent](Source: " + this.Source + ", " + "Distance: " + this.Distance + ")";
	}
}
