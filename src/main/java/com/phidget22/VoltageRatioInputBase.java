package com.phidget22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VoltageRatioInputBase extends Phidget {

	private static native long create() throws PhidgetException;

	private long nativeSensorChangeHandler = 0L;
	private long nativeVoltageRatioChangeHandler = 0L;

	private List<VoltageRatioInputSensorChangeListener> sensorChangeListeners = new ArrayList<VoltageRatioInputSensorChangeListener>();

	private List<VoltageRatioInputVoltageRatioChangeListener> voltageRatioChangeListeners = new ArrayList<VoltageRatioInputVoltageRatioChangeListener>();

	public VoltageRatioInputBase() throws PhidgetException {
		super(VoltageRatioInputBase.create());
	}

	VoltageRatioInputBase(long paramLong) {
		super(paramLong);
	}

	public final void addSensorChangeListener(
			VoltageRatioInputSensorChangeListener paramVoltageRatioInputSensorChangeListener) {
		synchronized (this.sensorChangeListeners) {
			this.sensorChangeListeners.add(paramVoltageRatioInputSensorChangeListener);
			this.enableSensorChangeEvents(true);
		}
	}

	public final void addVoltageRatioChangeListener(
			VoltageRatioInputVoltageRatioChangeListener paramVoltageRatioInputVoltageRatioChangeListener) {
		synchronized (this.voltageRatioChangeListeners) {
			this.voltageRatioChangeListeners.add(paramVoltageRatioInputVoltageRatioChangeListener);
			this.enableVoltageRatioChangeEvents(true);
		}
	}

	private native void enableSensorChangeEvents(boolean paramBoolean);

	private native void enableVoltageRatioChangeEvents(boolean paramBoolean);

	private void fireSensorChange(VoltageRatioInputSensorChangeEvent paramVoltageRatioInputSensorChangeEvent) {
		Iterator<VoltageRatioInputSensorChangeListener> localIterator;
		synchronized (this.sensorChangeListeners) {
			for (localIterator = this.sensorChangeListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onSensorChange(paramVoltageRatioInputSensorChangeEvent);

			}
		}
	}

	private void fireVoltageRatioChange(
			VoltageRatioInputVoltageRatioChangeEvent paramVoltageRatioInputVoltageRatioChangeEvent) {
		Iterator<VoltageRatioInputVoltageRatioChangeListener> localIterator;
		synchronized (this.voltageRatioChangeListeners) {
			for (localIterator = this.voltageRatioChangeListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onVoltageRatioChange(paramVoltageRatioInputVoltageRatioChangeEvent);
			}
		}
	}

	public native boolean getBridgeEnabled() throws PhidgetException;

	public native BridgeGain getBridgeGain() throws PhidgetException;

	public native int getDataInterval() throws PhidgetException;

	public native int getMaxDataInterval() throws PhidgetException;

	public native double getMaxVoltageRatio() throws PhidgetException;

	public native double getMaxVoltageRatioChangeTrigger() throws PhidgetException;

	public native int getMinDataInterval() throws PhidgetException;

	public native double getMinVoltageRatio() throws PhidgetException;

	public native double getMinVoltageRatioChangeTrigger() throws PhidgetException;

	public native VoltageRatioSensorType getSensorType() throws PhidgetException;

	public native UnitInfo getSensorUnit() throws PhidgetException;

	public native double getSensorValue() throws PhidgetException;

	public native double getSensorValueChangeTrigger() throws PhidgetException;

	public native double getVoltageRatio() throws PhidgetException;

	public native double getVoltageRatioChangeTrigger() throws PhidgetException;

	public final void removeSensorChangeListener(
			VoltageRatioInputSensorChangeListener paramVoltageRatioInputSensorChangeListener) {
		synchronized (this.sensorChangeListeners) {
			this.sensorChangeListeners.remove(paramVoltageRatioInputSensorChangeListener);
			this.enableSensorChangeEvents(this.sensorChangeListeners.size() > 0);
		}
	}

	public final void removeVoltageRatioChangeListener(
			VoltageRatioInputVoltageRatioChangeListener paramVoltageRatioInputVoltageRatioChangeListener) {
		synchronized (this.voltageRatioChangeListeners) {
			this.voltageRatioChangeListeners.remove(paramVoltageRatioInputVoltageRatioChangeListener);
			this.enableVoltageRatioChangeEvents(this.voltageRatioChangeListeners.size() > 0);
		}
	}

	public native void setBridgeEnabled(boolean paramBoolean) throws PhidgetException;

	public native void setBridgeGain(BridgeGain paramBridgeGain) throws PhidgetException;

	public native void setDataInterval(int paramInt) throws PhidgetException;

	private final void setDeviceEvents(boolean paramBoolean) {
		this.enableSensorChangeEvents(paramBoolean && this.sensorChangeListeners.size() > 0);
		this.enableVoltageRatioChangeEvents(paramBoolean && this.voltageRatioChangeListeners.size() > 0);
	}

	public native void setSensorType(VoltageRatioSensorType paramVoltageRatioSensorType) throws PhidgetException;

	public native void setSensorValueChangeTrigger(double paramDouble) throws PhidgetException;

	public native void setVoltageRatioChangeTrigger(double paramDouble) throws PhidgetException;
}
