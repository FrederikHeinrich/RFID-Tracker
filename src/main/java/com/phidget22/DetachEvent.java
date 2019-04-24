package com.phidget22;

public class DetachEvent {
	Phidget Source;

	public DetachEvent(Phidget paramPhidget) {
		this.Source = paramPhidget;
	}

	public Phidget getSource() {
		return this.Source;
	}

	@Override
	public String toString() {
		return "[DetachEvent](Source: " + this.Source + ")";
	}
}
