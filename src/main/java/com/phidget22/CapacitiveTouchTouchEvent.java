package com.phidget22;

public class CapacitiveTouchTouchEvent {
	CapacitiveTouch Source;

	double TouchValue;

	public CapacitiveTouchTouchEvent(CapacitiveTouch paramCapacitiveTouch, double paramDouble) {
		this.Source = paramCapacitiveTouch;
		this.TouchValue = paramDouble;
	}

	public CapacitiveTouch getSource() {
		return this.Source;
	}

	public double getTouchValue() {
		return this.TouchValue;
	}

	@Override
	public String toString() {
		return "[CapacitiveTouchTouchEvent](Source: " + this.Source + ", " + "TouchValue: " + this.TouchValue + ")";
	}
}
