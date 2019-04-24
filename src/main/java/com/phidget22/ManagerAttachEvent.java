package com.phidget22;

public class ManagerAttachEvent {

	Phidget Channel;
	Manager Source;

	public ManagerAttachEvent(Manager paramManager, Phidget paramPhidget) {
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
		return "[ManagerAttachEvent](Source: " + this.Source + ", " + "Channel: " + this.Channel + ")";
	}
}
