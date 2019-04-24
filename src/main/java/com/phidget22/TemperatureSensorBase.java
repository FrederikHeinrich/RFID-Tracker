package com.phidget22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TemperatureSensorBase extends Phidget {

	private static native long create() throws PhidgetException;

	private long nativeTemperatureChangeHandler = 0L;

	private List<TemperatureSensorTemperatureChangeListener> temperatureChangeListeners = new ArrayList<TemperatureSensorTemperatureChangeListener>();

	public TemperatureSensorBase() throws PhidgetException {
		super(TemperatureSensorBase.create());
	}

	TemperatureSensorBase(long paramLong) {
		super(paramLong);
	}

	public final void addTemperatureChangeListener(
			TemperatureSensorTemperatureChangeListener paramTemperatureSensorTemperatureChangeListener) {
		synchronized (this.temperatureChangeListeners) {
			this.temperatureChangeListeners.add(paramTemperatureSensorTemperatureChangeListener);
			this.enableTemperatureChangeEvents(true);
		}
	}

	private native void enableTemperatureChangeEvents(boolean paramBoolean);

	private void fireTemperatureChange(
			TemperatureSensorTemperatureChangeEvent paramTemperatureSensorTemperatureChangeEvent) {
		Iterator<TemperatureSensorTemperatureChangeListener> localIterator;
		synchronized (this.temperatureChangeListeners) {
			for (localIterator = this.temperatureChangeListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onTemperatureChange(paramTemperatureSensorTemperatureChangeEvent);
			}
		}
	}

	public native int getDataInterval() throws PhidgetException;

	public native int getMaxDataInterval() throws PhidgetException;

	public native double getMaxTemperature() throws PhidgetException;

	public native double getMaxTemperatureChangeTrigger() throws PhidgetException;

	public native int getMinDataInterval() throws PhidgetException;

	public native double getMinTemperature() throws PhidgetException;

	public native double getMinTemperatureChangeTrigger() throws PhidgetException;

	public native RTDType getRTDType() throws PhidgetException;

	public native RTDWireSetup getRTDWireSetup() throws PhidgetException;

	public native double getTemperature() throws PhidgetException;

	public native double getTemperatureChangeTrigger() throws PhidgetException;

	public native ThermocoupleType getThermocoupleType() throws PhidgetException;

	public final void removeTemperatureChangeListener(
			TemperatureSensorTemperatureChangeListener paramTemperatureSensorTemperatureChangeListener) {
		synchronized (this.temperatureChangeListeners) {
			this.temperatureChangeListeners.remove(paramTemperatureSensorTemperatureChangeListener);
			this.enableTemperatureChangeEvents(this.temperatureChangeListeners.size() > 0);
		}
	}

	public native void setDataInterval(int paramInt) throws PhidgetException;

	private final void setDeviceEvents(boolean paramBoolean) {
		this.enableTemperatureChangeEvents(paramBoolean && this.temperatureChangeListeners.size() > 0);
	}

	public native void setRTDType(RTDType paramRTDType) throws PhidgetException;

	public native void setRTDWireSetup(RTDWireSetup paramRTDWireSetup) throws PhidgetException;

	public native void setTemperatureChangeTrigger(double paramDouble) throws PhidgetException;

	public native void setThermocoupleType(ThermocoupleType paramThermocoupleType) throws PhidgetException;
}
