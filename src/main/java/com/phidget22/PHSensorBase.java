package com.phidget22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PHSensorBase extends Phidget {

	private static native long create() throws PhidgetException;

	private long nativePHChangeHandler = 0L;

	private List<PHSensorPHChangeListener> PHChangeListeners = new ArrayList<PHSensorPHChangeListener>();

	public PHSensorBase() throws PhidgetException {
		super(PHSensorBase.create());
	}

	PHSensorBase(long paramLong) {
		super(paramLong);
	}

	public final void addPHChangeListener(PHSensorPHChangeListener paramPHSensorPHChangeListener) {
		synchronized (this.PHChangeListeners) {
			this.PHChangeListeners.add(paramPHSensorPHChangeListener);
			this.enablePHChangeEvents(true);
		}
	}

	private native void enablePHChangeEvents(boolean paramBoolean);

	private void firePHChange(PHSensorPHChangeEvent paramPHSensorPHChangeEvent) {
		Iterator<PHSensorPHChangeListener> localIterator;
		synchronized (this.PHChangeListeners) {
			for (localIterator = this.PHChangeListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onPHChange(paramPHSensorPHChangeEvent);
			}
		}
	}

	public native double getCorrectionTemperature() throws PhidgetException;

	public native int getDataInterval() throws PhidgetException;

	public native double getMaxCorrectionTemperature() throws PhidgetException;

	public native int getMaxDataInterval() throws PhidgetException;

	public native double getMaxPH() throws PhidgetException;

	public native double getMaxPHChangeTrigger() throws PhidgetException;

	public native double getMinCorrectionTemperature() throws PhidgetException;

	public native int getMinDataInterval() throws PhidgetException;

	public native double getMinPH() throws PhidgetException;

	public native double getMinPHChangeTrigger() throws PhidgetException;

	public native double getPH() throws PhidgetException;

	public native double getPHChangeTrigger() throws PhidgetException;

	public final void removePHChangeListener(PHSensorPHChangeListener paramPHSensorPHChangeListener) {
		synchronized (this.PHChangeListeners) {
			this.PHChangeListeners.remove(paramPHSensorPHChangeListener);
			this.enablePHChangeEvents(this.PHChangeListeners.size() > 0);
		}
	}

	public native void setCorrectionTemperature(double paramDouble) throws PhidgetException;

	public native void setDataInterval(int paramInt) throws PhidgetException;

	private final void setDeviceEvents(boolean paramBoolean) {
		this.enablePHChangeEvents(paramBoolean && this.PHChangeListeners.size() > 0);
	}

	public native void setPHChangeTrigger(double paramDouble) throws PhidgetException;
}
