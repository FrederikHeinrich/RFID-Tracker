package com.phidget22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VoltageInputBase extends Phidget {

	private static native long create() throws PhidgetException;

	private long nativeSensorChangeHandler = 0L;
	private long nativeVoltageChangeHandler = 0L;

	private List<VoltageInputSensorChangeListener> sensorChangeListeners = new ArrayList<VoltageInputSensorChangeListener>();

	private List<VoltageInputVoltageChangeListener> voltageChangeListeners = new ArrayList<VoltageInputVoltageChangeListener>();

	public VoltageInputBase() throws PhidgetException {
		super(VoltageInputBase.create());
	}

	VoltageInputBase(long paramLong) {
		super(paramLong);
	}

	public final void addSensorChangeListener(VoltageInputSensorChangeListener paramVoltageInputSensorChangeListener) {
		synchronized (this.sensorChangeListeners) {
			this.sensorChangeListeners.add(paramVoltageInputSensorChangeListener);
			this.enableSensorChangeEvents(true);
		}
	}

	public final void addVoltageChangeListener(
			VoltageInputVoltageChangeListener paramVoltageInputVoltageChangeListener) {
		synchronized (this.voltageChangeListeners) {
			this.voltageChangeListeners.add(paramVoltageInputVoltageChangeListener);
			this.enableVoltageChangeEvents(true);
		}
	}

	private native void enableSensorChangeEvents(boolean paramBoolean);

	private native void enableVoltageChangeEvents(boolean paramBoolean);

	private void fireSensorChange(VoltageInputSensorChangeEvent paramVoltageInputSensorChangeEvent) {
		Iterator<VoltageInputSensorChangeListener> localIterator;
		synchronized (this.sensorChangeListeners) {
			for (localIterator = this.sensorChangeListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onSensorChange(paramVoltageInputSensorChangeEvent);

			}
		}
	}

	private void fireVoltageChange(VoltageInputVoltageChangeEvent paramVoltageInputVoltageChangeEvent) {
		Iterator<VoltageInputVoltageChangeListener> localIterator;
		synchronized (this.voltageChangeListeners) {
			for (localIterator = this.voltageChangeListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onVoltageChange(paramVoltageInputVoltageChangeEvent);
			}
		}
	}

	public native int getDataInterval() throws PhidgetException;

	public native int getMaxDataInterval() throws PhidgetException;

	public native double getMaxVoltage() throws PhidgetException;

	public native double getMaxVoltageChangeTrigger() throws PhidgetException;

	public native int getMinDataInterval() throws PhidgetException;

	public native double getMinVoltage() throws PhidgetException;

	public native double getMinVoltageChangeTrigger() throws PhidgetException;

	public native PowerSupply getPowerSupply() throws PhidgetException;

	public native VoltageSensorType getSensorType() throws PhidgetException;

	public native UnitInfo getSensorUnit() throws PhidgetException;

	public native double getSensorValue() throws PhidgetException;

	public native double getSensorValueChangeTrigger() throws PhidgetException;

	public native double getVoltage() throws PhidgetException;

	public native double getVoltageChangeTrigger() throws PhidgetException;

	public native VoltageRange getVoltageRange() throws PhidgetException;

	public final void removeSensorChangeListener(
			VoltageInputSensorChangeListener paramVoltageInputSensorChangeListener) {
		synchronized (this.sensorChangeListeners) {
			this.sensorChangeListeners.remove(paramVoltageInputSensorChangeListener);
			this.enableSensorChangeEvents(this.sensorChangeListeners.size() > 0);
		}
	}

	public final void removeVoltageChangeListener(
			VoltageInputVoltageChangeListener paramVoltageInputVoltageChangeListener) {
		synchronized (this.voltageChangeListeners) {
			this.voltageChangeListeners.remove(paramVoltageInputVoltageChangeListener);
			this.enableVoltageChangeEvents(this.voltageChangeListeners.size() > 0);
		}
	}

	public native void setDataInterval(int paramInt) throws PhidgetException;

	private final void setDeviceEvents(boolean paramBoolean) {
		this.enableSensorChangeEvents(paramBoolean && this.sensorChangeListeners.size() > 0);
		this.enableVoltageChangeEvents(paramBoolean && this.voltageChangeListeners.size() > 0);
	}

	public native void setPowerSupply(PowerSupply paramPowerSupply) throws PhidgetException;

	public native void setSensorType(VoltageSensorType paramVoltageSensorType) throws PhidgetException;

	public native void setSensorValueChangeTrigger(double paramDouble) throws PhidgetException;

	public native void setVoltageChangeTrigger(double paramDouble) throws PhidgetException;

	public native void setVoltageRange(VoltageRange paramVoltageRange) throws PhidgetException;
}
