package com.phidget22;

public class DigitalOutputBase extends Phidget {

	private static native long create() throws PhidgetException;

	public DigitalOutputBase() throws PhidgetException {
		super(DigitalOutputBase.create());
	}

	DigitalOutputBase(long paramLong) {
		super(paramLong);
	}

	public native void enableFailsafe(int paramInt) throws PhidgetException;

	public native double getDutyCycle() throws PhidgetException;

	public native double getLEDCurrentLimit() throws PhidgetException;

	public native LEDForwardVoltage getLEDForwardVoltage() throws PhidgetException;

	public native double getMaxDutyCycle() throws PhidgetException;

	public native int getMaxFailsafeTime() throws PhidgetException;

	public native double getMaxLEDCurrentLimit() throws PhidgetException;

	public native double getMinDutyCycle() throws PhidgetException;

	public native int getMinFailsafeTime() throws PhidgetException;

	public native double getMinLEDCurrentLimit() throws PhidgetException;

	public native boolean getState() throws PhidgetException;

	public native void resetFailsafe() throws PhidgetException;

	private final void setDeviceEvents(boolean paramBoolean) {
	}

	public native void setDutyCycle(double paramDouble) throws PhidgetException;

	public native void setDutyCycle(double paramDouble, AsyncListener paramAsyncListener);

	public native void setLEDCurrentLimit(double paramDouble) throws PhidgetException;

	public native void setLEDCurrentLimit(double paramDouble, AsyncListener paramAsyncListener);

	public native void setLEDForwardVoltage(LEDForwardVoltage paramLEDForwardVoltage) throws PhidgetException;

	public native void setState(boolean paramBoolean) throws PhidgetException;

	public native void setState(boolean paramBoolean, AsyncListener paramAsyncListener);
}
