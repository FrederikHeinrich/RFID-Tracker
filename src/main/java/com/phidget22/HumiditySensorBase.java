package com.phidget22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HumiditySensorBase extends Phidget {

	private static native long create() throws PhidgetException;

	private List<HumiditySensorHumidityChangeListener> humidityChangeListeners = new ArrayList<HumiditySensorHumidityChangeListener>();
	private long nativeHumidityChangeHandler = 0L;

	public HumiditySensorBase() throws PhidgetException {
		super(HumiditySensorBase.create());
	}

	HumiditySensorBase(long paramLong) {
		super(paramLong);
	}

	public final void addHumidityChangeListener(
			HumiditySensorHumidityChangeListener paramHumiditySensorHumidityChangeListener) {
		synchronized (this.humidityChangeListeners) {
			this.humidityChangeListeners.add(paramHumiditySensorHumidityChangeListener);
			this.enableHumidityChangeEvents(true);
		}
	}

	private native void enableHumidityChangeEvents(boolean paramBoolean);

	private void fireHumidityChange(HumiditySensorHumidityChangeEvent paramHumiditySensorHumidityChangeEvent) {
		Iterator<HumiditySensorHumidityChangeListener> localIterator;
		synchronized (this.humidityChangeListeners) {
			for (localIterator = this.humidityChangeListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onHumidityChange(paramHumiditySensorHumidityChangeEvent);
			}
		}
	}

	public native int getDataInterval() throws PhidgetException;

	public native double getHumidity() throws PhidgetException;

	public native double getHumidityChangeTrigger() throws PhidgetException;

	public native int getMaxDataInterval() throws PhidgetException;

	public native double getMaxHumidity() throws PhidgetException;

	public native double getMaxHumidityChangeTrigger() throws PhidgetException;

	public native int getMinDataInterval() throws PhidgetException;

	public native double getMinHumidity() throws PhidgetException;

	public native double getMinHumidityChangeTrigger() throws PhidgetException;

	public final void removeHumidityChangeListener(
			HumiditySensorHumidityChangeListener paramHumiditySensorHumidityChangeListener) {
		synchronized (this.humidityChangeListeners) {
			this.humidityChangeListeners.remove(paramHumiditySensorHumidityChangeListener);
			this.enableHumidityChangeEvents(this.humidityChangeListeners.size() > 0);
		}
	}

	public native void setDataInterval(int paramInt) throws PhidgetException;

	private final void setDeviceEvents(boolean paramBoolean) {
		this.enableHumidityChangeEvents(paramBoolean && this.humidityChangeListeners.size() > 0);
	}

	public native void setHumidityChangeTrigger(double paramDouble) throws PhidgetException;
}
