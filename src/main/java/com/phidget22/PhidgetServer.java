package com.phidget22;

public class PhidgetServer {

	public String addr;

	public int flags;

	public String host;
	public String name;

	public int port;

	public String stype;

	public ServerType type;

	@Override
	public String toString() {
		return "[PhidgetServer](name: " + this.name + ", " + "stype: " + this.stype + ", " + "type: " + this.type + ", "
				+ "flags: " + this.flags + ", " + "addr: " + this.addr + ", " + "host: " + this.host + ", " + "port: "
				+ this.port + ")";
	}
}
