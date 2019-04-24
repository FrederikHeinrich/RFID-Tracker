package com.phidget22;

public class NetServerAddedEvent {

	long Kv;

	PhidgetServer Server;
	Net Source;

	public NetServerAddedEvent(Net paramNet, PhidgetServer paramPhidgetServer, long paramLong) {
		this.Source = paramNet;
		this.Server = paramPhidgetServer;
		this.Kv = paramLong;
	}

	public long getKv() {
		return this.Kv;
	}

	public PhidgetServer getServer() {
		return this.Server;
	}

	public Net getSource() {
		return this.Source;
	}

	@Override
	public String toString() {
		return "[NetServerAddedEvent](Source: " + this.Source + ", " + "Server: " + this.Server + ", " + "Kv: "
				+ this.Kv + ")";
	}
}
