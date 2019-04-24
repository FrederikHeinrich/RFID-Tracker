package com.phidget22;

public class CurrentInputCurrentChangeEvent {

	double Current;
	CurrentInput Source;

	public CurrentInputCurrentChangeEvent(CurrentInput paramCurrentInput, double paramDouble) {
		this.Source = paramCurrentInput;
		this.Current = paramDouble;
	}

	public double getCurrent() {
		return this.Current;
	}

	public CurrentInput getSource() {
		return this.Source;
	}

	@Override
	public String toString() {
		return "[CurrentInputCurrentChangeEvent](Source: " + this.Source + ", " + "Current: " + this.Current + ")";
	}
}
