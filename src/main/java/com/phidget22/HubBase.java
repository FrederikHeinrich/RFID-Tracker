package com.phidget22;

public class HubBase extends Phidget {

	private static native long create() throws PhidgetException;

	public HubBase() throws PhidgetException {
		super(HubBase.create());
	}

	HubBase(long paramLong) {
		super(paramLong);
	}

	private final void setDeviceEvents(boolean paramBoolean) {
	}

	public native void setPortPower(int paramInt, boolean paramBoolean) throws PhidgetException;
}
