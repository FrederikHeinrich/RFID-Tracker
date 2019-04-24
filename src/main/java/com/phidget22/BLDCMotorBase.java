package com.phidget22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BLDCMotorBase extends Phidget {

	private static native long create() throws PhidgetException;

	private List<BLDCMotorBrakingStrengthChangeListener> brakingStrengthChangeListeners = new ArrayList<BLDCMotorBrakingStrengthChangeListener>();
	private long nativeBrakingStrengthChangeHandler = 0L;
	private long nativePositionChangeHandler = 0L;
	private long nativeVelocityUpdateHandler = 0L;

	private List<BLDCMotorPositionChangeListener> positionChangeListeners = new ArrayList<BLDCMotorPositionChangeListener>();

	private List<BLDCMotorVelocityUpdateListener> velocityUpdateListeners = new ArrayList<BLDCMotorVelocityUpdateListener>();

	public BLDCMotorBase() throws PhidgetException {
		super(BLDCMotorBase.create());
	}

	BLDCMotorBase(long paramLong) {
		super(paramLong);
	}

	public final void addBrakingStrengthChangeListener(
			BLDCMotorBrakingStrengthChangeListener paramBLDCMotorBrakingStrengthChangeListener) {
		synchronized (this.brakingStrengthChangeListeners) {
			this.brakingStrengthChangeListeners.add(paramBLDCMotorBrakingStrengthChangeListener);
			this.enableBrakingStrengthChangeEvents(true);
		}
	}

	public final void addPositionChangeListener(BLDCMotorPositionChangeListener paramBLDCMotorPositionChangeListener) {
		synchronized (this.positionChangeListeners) {
			this.positionChangeListeners.add(paramBLDCMotorPositionChangeListener);
			this.enablePositionChangeEvents(true);
		}
	}

	public native void addPositionOffset(double paramDouble) throws PhidgetException;

	public final void addVelocityUpdateListener(BLDCMotorVelocityUpdateListener paramBLDCMotorVelocityUpdateListener) {
		synchronized (this.velocityUpdateListeners) {
			this.velocityUpdateListeners.add(paramBLDCMotorVelocityUpdateListener);
			this.enableVelocityUpdateEvents(true);
		}
	}

	private native void enableBrakingStrengthChangeEvents(boolean paramBoolean);

	private native void enablePositionChangeEvents(boolean paramBoolean);

	private native void enableVelocityUpdateEvents(boolean paramBoolean);

	private void fireBrakingStrengthChange(
			BLDCMotorBrakingStrengthChangeEvent paramBLDCMotorBrakingStrengthChangeEvent) {
		Iterator<BLDCMotorBrakingStrengthChangeListener> localIterator;
		synchronized (this.brakingStrengthChangeListeners) {
			for (localIterator = this.brakingStrengthChangeListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onBrakingStrengthChange(paramBLDCMotorBrakingStrengthChangeEvent);

			}
		}
	}

	private void firePositionChange(BLDCMotorPositionChangeEvent paramBLDCMotorPositionChangeEvent) {
		Iterator<BLDCMotorPositionChangeListener> localIterator;
		synchronized (this.positionChangeListeners) {
			for (localIterator = this.positionChangeListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onPositionChange(paramBLDCMotorPositionChangeEvent);

			}
		}
	}

	private void fireVelocityUpdate(BLDCMotorVelocityUpdateEvent paramBLDCMotorVelocityUpdateEvent) {
		Iterator<BLDCMotorVelocityUpdateListener> localIterator;
		synchronized (this.velocityUpdateListeners) {
			for (localIterator = this.velocityUpdateListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onVelocityUpdate(paramBLDCMotorVelocityUpdateEvent);
			}
		}
	}

	public native double getAcceleration() throws PhidgetException;

	public native double getBrakingStrength() throws PhidgetException;

	public native int getDataInterval() throws PhidgetException;

	public native double getMaxAcceleration() throws PhidgetException;

	public native double getMaxBrakingStrength() throws PhidgetException;

	public native int getMaxDataInterval() throws PhidgetException;

	public native double getMaxPosition() throws PhidgetException;

	public native double getMaxStallVelocity() throws PhidgetException;

	public native double getMaxVelocity() throws PhidgetException;

	public native double getMinAcceleration() throws PhidgetException;

	public native double getMinBrakingStrength() throws PhidgetException;

	public native int getMinDataInterval() throws PhidgetException;

	public native double getMinPosition() throws PhidgetException;

	public native double getMinStallVelocity() throws PhidgetException;

	public native double getMinVelocity() throws PhidgetException;

	public native double getPosition() throws PhidgetException;

	public native double getRescaleFactor() throws PhidgetException;

	public native double getStallVelocity() throws PhidgetException;

	public native double getTargetBrakingStrength() throws PhidgetException;

	public native double getTargetVelocity() throws PhidgetException;

	public native double getVelocity() throws PhidgetException;

	public final void removeBrakingStrengthChangeListener(
			BLDCMotorBrakingStrengthChangeListener paramBLDCMotorBrakingStrengthChangeListener) {
		synchronized (this.brakingStrengthChangeListeners) {
			this.brakingStrengthChangeListeners.remove(paramBLDCMotorBrakingStrengthChangeListener);
			this.enableBrakingStrengthChangeEvents(this.brakingStrengthChangeListeners.size() > 0);
		}
	}

	public final void removePositionChangeListener(
			BLDCMotorPositionChangeListener paramBLDCMotorPositionChangeListener) {
		synchronized (this.positionChangeListeners) {
			this.positionChangeListeners.remove(paramBLDCMotorPositionChangeListener);
			this.enablePositionChangeEvents(this.positionChangeListeners.size() > 0);
		}
	}

	public final void removeVelocityUpdateListener(
			BLDCMotorVelocityUpdateListener paramBLDCMotorVelocityUpdateListener) {
		synchronized (this.velocityUpdateListeners) {
			this.velocityUpdateListeners.remove(paramBLDCMotorVelocityUpdateListener);
			this.enableVelocityUpdateEvents(this.velocityUpdateListeners.size() > 0);
		}
	}

	public native void setAcceleration(double paramDouble) throws PhidgetException;

	public native void setDataInterval(int paramInt) throws PhidgetException;

	private final void setDeviceEvents(boolean paramBoolean) {
		this.enableBrakingStrengthChangeEvents(paramBoolean && this.brakingStrengthChangeListeners.size() > 0);
		this.enablePositionChangeEvents(paramBoolean && this.positionChangeListeners.size() > 0);
		this.enableVelocityUpdateEvents(paramBoolean && this.velocityUpdateListeners.size() > 0);
	}

	public native void setRescaleFactor(double paramDouble) throws PhidgetException;

	public native void setStallVelocity(double paramDouble) throws PhidgetException;

	public native void setTargetBrakingStrength(double paramDouble) throws PhidgetException;

	public native void setTargetVelocity(double paramDouble) throws PhidgetException;
}
