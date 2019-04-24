package com.phidget22;

public class ManagerDetachEvent {

	Phidget Channel;
	Manager Source;

	public ManagerDetachEvent(Manager paramManager, Phidget paramPhidget) {
		this.Source = paramManager;
		this.Channel = paramPhidget;
	}

	public Phidget getChannel() {
		return this.Channel;
	}

	public Manager getSource() {
		return this.Source;
	}

	@Override
	public String toString() {
		return "[ManagerDetachEvent](Source: " + this.Source + ", " + "Channel: " + this.Channel + ")";
	}
}
