package com.phidget22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LightSensorBase extends Phidget {

	private static native long create() throws PhidgetException;

	private List<LightSensorIlluminanceChangeListener> illuminanceChangeListeners = new ArrayList<LightSensorIlluminanceChangeListener>();
	private long nativeIlluminanceChangeHandler = 0L;

	public LightSensorBase() throws PhidgetException {
		super(LightSensorBase.create());
	}

	LightSensorBase(long paramLong) {
		super(paramLong);
	}

	public final void addIlluminanceChangeListener(
			LightSensorIlluminanceChangeListener paramLightSensorIlluminanceChangeListener) {
		synchronized (this.illuminanceChangeListeners) {
			this.illuminanceChangeListeners.add(paramLightSensorIlluminanceChangeListener);
			this.enableIlluminanceChangeEvents(true);
		}
	}

	private native void enableIlluminanceChangeEvents(boolean paramBoolean);

	private void fireIlluminanceChange(LightSensorIlluminanceChangeEvent paramLightSensorIlluminanceChangeEvent) {
		Iterator<LightSensorIlluminanceChangeListener> localIterator;
		synchronized (this.illuminanceChangeListeners) {
			for (localIterator = this.illuminanceChangeListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onIlluminanceChange(paramLightSensorIlluminanceChangeEvent);
			}
		}
	}

	public native int getDataInterval() throws PhidgetException;

	public native double getIlluminance() throws PhidgetException;

	public native double getIlluminanceChangeTrigger() throws PhidgetException;

	public native int getMaxDataInterval() throws PhidgetException;

	public native double getMaxIlluminance() throws PhidgetException;

	public native double getMaxIlluminanceChangeTrigger() throws PhidgetException;

	public native int getMinDataInterval() throws PhidgetException;

	public native double getMinIlluminance() throws PhidgetException;

	public native double getMinIlluminanceChangeTrigger() throws PhidgetException;

	public final void removeIlluminanceChangeListener(
			LightSensorIlluminanceChangeListener paramLightSensorIlluminanceChangeListener) {
		synchronized (this.illuminanceChangeListeners) {
			this.illuminanceChangeListeners.remove(paramLightSensorIlluminanceChangeListener);
			this.enableIlluminanceChangeEvents(this.illuminanceChangeListeners.size() > 0);
		}
	}

	public native void setDataInterval(int paramInt) throws PhidgetException;

	private final void setDeviceEvents(boolean paramBoolean) {
		this.enableIlluminanceChangeEvents(paramBoolean && this.illuminanceChangeListeners.size() > 0);
	}

	public native void setIlluminanceChangeTrigger(double paramDouble) throws PhidgetException;
}
