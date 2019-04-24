package com.phidget22;

public class VoltageOutputBase extends Phidget {

	private static native long create() throws PhidgetException;

	public VoltageOutputBase() throws PhidgetException {
		super(VoltageOutputBase.create());
	}

	VoltageOutputBase(long paramLong) {
		super(paramLong);
	}

	public native boolean getEnabled() throws PhidgetException;

	public native double getMaxVoltage() throws PhidgetException;

	public native double getMinVoltage() throws PhidgetException;

	public native double getVoltage() throws PhidgetException;

	public native VoltageOutputRange getVoltageOutputRange() throws PhidgetException;

	private final void setDeviceEvents(boolean paramBoolean) {
	}

	public native void setEnabled(boolean paramBoolean) throws PhidgetException;

	public native void setVoltage(double paramDouble) throws PhidgetException;

	public native void setVoltage(double paramDouble, AsyncListener paramAsyncListener);

	public native void setVoltageOutputRange(VoltageOutputRange paramVoltageOutputRange) throws PhidgetException;
}
