package com.phidget22;

public class NetServerRemovedEvent {

	PhidgetServer Server;
	Net Source;

	public NetServerRemovedEvent(Net paramNet, PhidgetServer paramPhidgetServer) {
		this.Source = paramNet;
		this.Server = paramPhidgetServer;
	}

	public PhidgetServer getServer() {
		return this.Server;
	}

	public Net getSource() {
		return this.Source;
	}

	@Override
	public String toString() {
		return "[NetServerRemovedEvent](Source: " + this.Source + ", " + "Server: " + this.Server + ")";
	}
}
