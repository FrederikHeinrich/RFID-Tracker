package com.phidget22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DCMotorBase extends Phidget {

	private static native long create() throws PhidgetException;

	private List<DCMotorBackEMFChangeListener> backEMFChangeListeners = new ArrayList<DCMotorBackEMFChangeListener>();

	private List<DCMotorBrakingStrengthChangeListener> brakingStrengthChangeListeners = new ArrayList<DCMotorBrakingStrengthChangeListener>();
	private long nativeBackEMFChangeHandler = 0L;
	private long nativeBrakingStrengthChangeHandler = 0L;
	private long nativeVelocityUpdateHandler = 0L;

	private List<DCMotorVelocityUpdateListener> velocityUpdateListeners = new ArrayList<DCMotorVelocityUpdateListener>();

	public DCMotorBase() throws PhidgetException {
		super(DCMotorBase.create());
	}

	DCMotorBase(long paramLong) {
		super(paramLong);
	}

	public final void addBackEMFChangeListener(DCMotorBackEMFChangeListener paramDCMotorBackEMFChangeListener) {
		synchronized (this.backEMFChangeListeners) {
			this.backEMFChangeListeners.add(paramDCMotorBackEMFChangeListener);
			this.enableBackEMFChangeEvents(true);
		}
	}

	public final void addBrakingStrengthChangeListener(
			DCMotorBrakingStrengthChangeListener paramDCMotorBrakingStrengthChangeListener) {
		synchronized (this.brakingStrengthChangeListeners) {
			this.brakingStrengthChangeListeners.add(paramDCMotorBrakingStrengthChangeListener);
			this.enableBrakingStrengthChangeEvents(true);
		}
	}

	public final void addVelocityUpdateListener(DCMotorVelocityUpdateListener paramDCMotorVelocityUpdateListener) {
		synchronized (this.velocityUpdateListeners) {
			this.velocityUpdateListeners.add(paramDCMotorVelocityUpdateListener);
			this.enableVelocityUpdateEvents(true);
		}
	}

	private native void enableBackEMFChangeEvents(boolean paramBoolean);

	private native void enableBrakingStrengthChangeEvents(boolean paramBoolean);

	private native void enableVelocityUpdateEvents(boolean paramBoolean);

	private void fireBackEMFChange(DCMotorBackEMFChangeEvent paramDCMotorBackEMFChangeEvent) {
		Iterator<DCMotorBackEMFChangeListener> localIterator;
		synchronized (this.backEMFChangeListeners) {
			for (localIterator = this.backEMFChangeListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onBackEMFChange(paramDCMotorBackEMFChangeEvent);

			}
		}
	}

	private void fireBrakingStrengthChange(DCMotorBrakingStrengthChangeEvent paramDCMotorBrakingStrengthChangeEvent) {
		Iterator<DCMotorBrakingStrengthChangeListener> localIterator;
		synchronized (this.brakingStrengthChangeListeners) {
			for (localIterator = this.brakingStrengthChangeListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onBrakingStrengthChange(paramDCMotorBrakingStrengthChangeEvent);

			}
		}
	}

	private void fireVelocityUpdate(DCMotorVelocityUpdateEvent paramDCMotorVelocityUpdateEvent) {
		Iterator<DCMotorVelocityUpdateListener> localIterator;
		synchronized (this.velocityUpdateListeners) {
			for (localIterator = this.velocityUpdateListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onVelocityUpdate(paramDCMotorVelocityUpdateEvent);
			}
		}
	}

	public native double getAcceleration() throws PhidgetException;

	public native double getBackEMF() throws PhidgetException;

	public native boolean getBackEMFSensingState() throws PhidgetException;

	public native double getBrakingStrength() throws PhidgetException;

	public native double getCurrentLimit() throws PhidgetException;

	public native double getCurrentRegulatorGain() throws PhidgetException;

	public native int getDataInterval() throws PhidgetException;

	public native FanMode getFanMode() throws PhidgetException;

	public native double getMaxAcceleration() throws PhidgetException;

	public native double getMaxBrakingStrength() throws PhidgetException;

	public native double getMaxCurrentLimit() throws PhidgetException;

	public native double getMaxCurrentRegulatorGain() throws PhidgetException;

	public native int getMaxDataInterval() throws PhidgetException;

	public native double getMaxVelocity() throws PhidgetException;

	public native double getMinAcceleration() throws PhidgetException;

	public native double getMinBrakingStrength() throws PhidgetException;

	public native double getMinCurrentLimit() throws PhidgetException;

	public native double getMinCurrentRegulatorGain() throws PhidgetException;

	public native int getMinDataInterval() throws PhidgetException;

	public native double getMinVelocity() throws PhidgetException;

	public native double getTargetBrakingStrength() throws PhidgetException;

	public native double getTargetVelocity() throws PhidgetException;

	public native double getVelocity() throws PhidgetException;

	public final void removeBackEMFChangeListener(DCMotorBackEMFChangeListener paramDCMotorBackEMFChangeListener) {
		synchronized (this.backEMFChangeListeners) {
			this.backEMFChangeListeners.remove(paramDCMotorBackEMFChangeListener);
			this.enableBackEMFChangeEvents(this.backEMFChangeListeners.size() > 0);
		}
	}

	public final void removeBrakingStrengthChangeListener(
			DCMotorBrakingStrengthChangeListener paramDCMotorBrakingStrengthChangeListener) {
		synchronized (this.brakingStrengthChangeListeners) {
			this.brakingStrengthChangeListeners.remove(paramDCMotorBrakingStrengthChangeListener);
			this.enableBrakingStrengthChangeEvents(this.brakingStrengthChangeListeners.size() > 0);
		}
	}

	public final void removeVelocityUpdateListener(DCMotorVelocityUpdateListener paramDCMotorVelocityUpdateListener) {
		synchronized (this.velocityUpdateListeners) {
			this.velocityUpdateListeners.remove(paramDCMotorVelocityUpdateListener);
			this.enableVelocityUpdateEvents(this.velocityUpdateListeners.size() > 0);
		}
	}

	public native void setAcceleration(double paramDouble) throws PhidgetException;

	public native void setBackEMFSensingState(boolean paramBoolean) throws PhidgetException;

	public native void setCurrentLimit(double paramDouble) throws PhidgetException;

	public native void setCurrentRegulatorGain(double paramDouble) throws PhidgetException;

	public native void setDataInterval(int paramInt) throws PhidgetException;

	private final void setDeviceEvents(boolean paramBoolean) {
		this.enableBackEMFChangeEvents(paramBoolean && this.backEMFChangeListeners.size() > 0);
		this.enableBrakingStrengthChangeEvents(paramBoolean && this.brakingStrengthChangeListeners.size() > 0);
		this.enableVelocityUpdateEvents(paramBoolean && this.velocityUpdateListeners.size() > 0);
	}

	public native void setFanMode(FanMode paramFanMode) throws PhidgetException;

	public native void setTargetBrakingStrength(double paramDouble) throws PhidgetException;

	public native void setTargetVelocity(double paramDouble) throws PhidgetException;
}
