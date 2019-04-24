package com.phidget22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PressureSensorBase extends Phidget {

	private static native long create() throws PhidgetException;

	private long nativePressureChangeHandler = 0L;

	private List<PressureSensorPressureChangeListener> pressureChangeListeners = new ArrayList<PressureSensorPressureChangeListener>();

	public PressureSensorBase() throws PhidgetException {
		super(PressureSensorBase.create());
	}

	PressureSensorBase(long paramLong) {
		super(paramLong);
	}

	public final void addPressureChangeListener(
			PressureSensorPressureChangeListener paramPressureSensorPressureChangeListener) {
		synchronized (this.pressureChangeListeners) {
			this.pressureChangeListeners.add(paramPressureSensorPressureChangeListener);
			this.enablePressureChangeEvents(true);
		}
	}

	private native void enablePressureChangeEvents(boolean paramBoolean);

	private void firePressureChange(PressureSensorPressureChangeEvent paramPressureSensorPressureChangeEvent) {
		Iterator<PressureSensorPressureChangeListener> localIterator;
		synchronized (this.pressureChangeListeners) {
			for (localIterator = this.pressureChangeListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onPressureChange(paramPressureSensorPressureChangeEvent);
			}
		}
	}

	public native int getDataInterval() throws PhidgetException;

	public native int getMaxDataInterval() throws PhidgetException;

	public native double getMaxPressure() throws PhidgetException;

	public native double getMaxPressureChangeTrigger() throws PhidgetException;

	public native int getMinDataInterval() throws PhidgetException;

	public native double getMinPressure() throws PhidgetException;

	public native double getMinPressureChangeTrigger() throws PhidgetException;

	public native double getPressure() throws PhidgetException;

	public native double getPressureChangeTrigger() throws PhidgetException;

	public final void removePressureChangeListener(
			PressureSensorPressureChangeListener paramPressureSensorPressureChangeListener) {
		synchronized (this.pressureChangeListeners) {
			this.pressureChangeListeners.remove(paramPressureSensorPressureChangeListener);
			this.enablePressureChangeEvents(this.pressureChangeListeners.size() > 0);
		}
	}

	public native void setDataInterval(int paramInt) throws PhidgetException;

	private final void setDeviceEvents(boolean paramBoolean) {
		this.enablePressureChangeEvents(paramBoolean && this.pressureChangeListeners.size() > 0);
	}

	public native void setPressureChangeTrigger(double paramDouble) throws PhidgetException;
}
