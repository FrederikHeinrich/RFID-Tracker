package com.phidget22;

public class AttachEvent {
	Phidget Source;

	public AttachEvent(Phidget paramPhidget) {
		this.Source = paramPhidget;
	}

	public Phidget getSource() {
		return this.Source;
	}

	@Override
	public String toString() {
		return "[AttachEvent](Source: " + this.Source + ")";
	}
}
