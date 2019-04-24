package com.phidget22;

public class CapacitiveTouchTouchEndEvent {
	CapacitiveTouch Source;

	public CapacitiveTouchTouchEndEvent(CapacitiveTouch paramCapacitiveTouch) {
		this.Source = paramCapacitiveTouch;
	}

	public CapacitiveTouch getSource() {
		return this.Source;
	}

	@Override
	public String toString() {
		return "[CapacitiveTouchTouchEndEvent](Source: " + this.Source + ")";
	}
}
