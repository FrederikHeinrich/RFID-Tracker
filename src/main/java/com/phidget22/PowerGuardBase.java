package com.phidget22;

public class PowerGuardBase extends Phidget {

	private static native long create() throws PhidgetException;

	public PowerGuardBase() throws PhidgetException {
		super(PowerGuardBase.create());
	}

	PowerGuardBase(long paramLong) {
		super(paramLong);
	}

	public native FanMode getFanMode() throws PhidgetException;

	public native double getMaxOverVoltage() throws PhidgetException;

	public native double getMinOverVoltage() throws PhidgetException;

	public native double getOverVoltage() throws PhidgetException;

	public native boolean getPowerEnabled() throws PhidgetException;

	private final void setDeviceEvents(boolean paramBoolean) {
	}

	public native void setFanMode(FanMode paramFanMode) throws PhidgetException;

	public native void setOverVoltage(double paramDouble) throws PhidgetException;

	public native void setPowerEnabled(boolean paramBoolean) throws PhidgetException;
}
