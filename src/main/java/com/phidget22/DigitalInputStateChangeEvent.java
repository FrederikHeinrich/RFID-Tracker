package com.phidget22;

public class DigitalInputStateChangeEvent {
	DigitalInput Source;

	boolean State;

	public DigitalInputStateChangeEvent(DigitalInput paramDigitalInput, boolean paramBoolean) {
		this.Source = paramDigitalInput;
		this.State = paramBoolean;
	}

	public DigitalInput getSource() {
		return this.Source;
	}

	public boolean getState() {
		return this.State;
	}

	@Override
	public String toString() {
		return "[DigitalInputStateChangeEvent](Source: " + this.Source + ", " + "State: " + this.State + ")";
	}
}
