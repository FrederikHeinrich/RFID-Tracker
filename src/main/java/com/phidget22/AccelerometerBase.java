package com.phidget22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AccelerometerBase extends Phidget {

	private static native long create() throws PhidgetException;

	private List<AccelerometerAccelerationChangeListener> accelerationChangeListeners = new ArrayList<AccelerometerAccelerationChangeListener>();
	private long nativeAccelerationChangeHandler = 0L;

	public AccelerometerBase() throws PhidgetException {
		super(AccelerometerBase.create());
	}

	AccelerometerBase(long paramLong) {
		super(paramLong);
	}

	public final void addAccelerationChangeListener(
			AccelerometerAccelerationChangeListener paramAccelerometerAccelerationChangeListener) {
		synchronized (this.accelerationChangeListeners) {
			this.accelerationChangeListeners.add(paramAccelerometerAccelerationChangeListener);
			this.enableAccelerationChangeEvents(true);
		}
	}

	private native void enableAccelerationChangeEvents(boolean paramBoolean);

	private void fireAccelerationChange(
			AccelerometerAccelerationChangeEvent paramAccelerometerAccelerationChangeEvent) {
		Iterator<AccelerometerAccelerationChangeListener> localIterator;
		synchronized (this.accelerationChangeListeners) {
			for (localIterator = this.accelerationChangeListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onAccelerationChange(paramAccelerometerAccelerationChangeEvent);
			}
		}
	}

	public native double[] getAcceleration() throws PhidgetException;

	public native double getAccelerationChangeTrigger() throws PhidgetException;

	public native int getAxisCount() throws PhidgetException;

	public native int getDataInterval() throws PhidgetException;

	public native double[] getMaxAcceleration() throws PhidgetException;

	public native double getMaxAccelerationChangeTrigger() throws PhidgetException;

	public native int getMaxDataInterval() throws PhidgetException;

	public native double[] getMinAcceleration() throws PhidgetException;

	public native double getMinAccelerationChangeTrigger() throws PhidgetException;

	public native int getMinDataInterval() throws PhidgetException;

	public native double getTimestamp() throws PhidgetException;

	public final void removeAccelerationChangeListener(
			AccelerometerAccelerationChangeListener paramAccelerometerAccelerationChangeListener) {
		synchronized (this.accelerationChangeListeners) {
			this.accelerationChangeListeners.remove(paramAccelerometerAccelerationChangeListener);
			this.enableAccelerationChangeEvents(this.accelerationChangeListeners.size() > 0);
		}
	}

	public native void setAccelerationChangeTrigger(double paramDouble) throws PhidgetException;

	public native void setDataInterval(int paramInt) throws PhidgetException;

	private final void setDeviceEvents(boolean paramBoolean) {
		this.enableAccelerationChangeEvents(paramBoolean && (this.accelerationChangeListeners.size() > 0));
	}
}
