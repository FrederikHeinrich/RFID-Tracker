package com.phidget22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MotorPositionControllerBase extends Phidget {

	private static native long create() throws PhidgetException;

	private List<MotorPositionControllerDutyCycleUpdateListener> dutyCycleUpdateListeners = new ArrayList<MotorPositionControllerDutyCycleUpdateListener>();
	private long nativeDutyCycleUpdateHandler = 0L;
	private long nativePositionChangeHandler = 0L;

	private List<MotorPositionControllerPositionChangeListener> positionChangeListeners = new ArrayList<MotorPositionControllerPositionChangeListener>();

	public MotorPositionControllerBase() throws PhidgetException {
		super(MotorPositionControllerBase.create());
	}

	MotorPositionControllerBase(long paramLong) {
		super(paramLong);
	}

	public final void addDutyCycleUpdateListener(
			MotorPositionControllerDutyCycleUpdateListener paramMotorPositionControllerDutyCycleUpdateListener) {
		synchronized (this.dutyCycleUpdateListeners) {
			this.dutyCycleUpdateListeners.add(paramMotorPositionControllerDutyCycleUpdateListener);
			this.enableDutyCycleUpdateEvents(true);
		}
	}

	public final void addPositionChangeListener(
			MotorPositionControllerPositionChangeListener paramMotorPositionControllerPositionChangeListener) {
		synchronized (this.positionChangeListeners) {
			this.positionChangeListeners.add(paramMotorPositionControllerPositionChangeListener);
			this.enablePositionChangeEvents(true);
		}
	}

	public native void addPositionOffset(double paramDouble) throws PhidgetException;

	private native void enableDutyCycleUpdateEvents(boolean paramBoolean);

	private native void enablePositionChangeEvents(boolean paramBoolean);

	private void fireDutyCycleUpdate(
			MotorPositionControllerDutyCycleUpdateEvent paramMotorPositionControllerDutyCycleUpdateEvent) {
		Iterator<MotorPositionControllerDutyCycleUpdateListener> localIterator;
		synchronized (this.dutyCycleUpdateListeners) {
			for (localIterator = this.dutyCycleUpdateListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onDutyCycleUpdate(paramMotorPositionControllerDutyCycleUpdateEvent);

			}
		}
	}

	private void firePositionChange(
			MotorPositionControllerPositionChangeEvent paramMotorPositionControllerPositionChangeEvent) {
		Iterator<MotorPositionControllerPositionChangeListener> localIterator;
		synchronized (this.positionChangeListeners) {
			for (localIterator = this.positionChangeListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onPositionChange(paramMotorPositionControllerPositionChangeEvent);
			}
		}
	}

	public native double getAcceleration() throws PhidgetException;

	public native double getCurrentLimit() throws PhidgetException;

	public native double getCurrentRegulatorGain() throws PhidgetException;

	public native int getDataInterval() throws PhidgetException;

	public native double getDeadBand() throws PhidgetException;

	public native double getDutyCycle() throws PhidgetException;

	public native boolean getEngaged() throws PhidgetException;

	public native FanMode getFanMode() throws PhidgetException;

	public native EncoderIOMode getIOMode() throws PhidgetException;

	public native double getKd() throws PhidgetException;

	public native double getKi() throws PhidgetException;

	public native double getKp() throws PhidgetException;

	public native double getMaxAcceleration() throws PhidgetException;

	public native double getMaxCurrentLimit() throws PhidgetException;

	public native double getMaxCurrentRegulatorGain() throws PhidgetException;

	public native int getMaxDataInterval() throws PhidgetException;

	public native double getMaxPosition() throws PhidgetException;

	public native double getMaxStallVelocity() throws PhidgetException;

	public native double getMaxVelocityLimit() throws PhidgetException;

	public native double getMinAcceleration() throws PhidgetException;

	public native double getMinCurrentLimit() throws PhidgetException;

	public native double getMinCurrentRegulatorGain() throws PhidgetException;

	public native int getMinDataInterval() throws PhidgetException;

	public native double getMinPosition() throws PhidgetException;

	public native double getMinStallVelocity() throws PhidgetException;

	public native double getMinVelocityLimit() throws PhidgetException;

	public native double getPosition() throws PhidgetException;

	public native double getRescaleFactor() throws PhidgetException;

	public native double getStallVelocity() throws PhidgetException;

	public native double getTargetPosition() throws PhidgetException;

	public native double getVelocityLimit() throws PhidgetException;

	public final void removeDutyCycleUpdateListener(
			MotorPositionControllerDutyCycleUpdateListener paramMotorPositionControllerDutyCycleUpdateListener) {
		synchronized (this.dutyCycleUpdateListeners) {
			this.dutyCycleUpdateListeners.remove(paramMotorPositionControllerDutyCycleUpdateListener);
			this.enableDutyCycleUpdateEvents(this.dutyCycleUpdateListeners.size() > 0);
		}
	}

	public final void removePositionChangeListener(
			MotorPositionControllerPositionChangeListener paramMotorPositionControllerPositionChangeListener) {
		synchronized (this.positionChangeListeners) {
			this.positionChangeListeners.remove(paramMotorPositionControllerPositionChangeListener);
			this.enablePositionChangeEvents(this.positionChangeListeners.size() > 0);
		}
	}

	public native void setAcceleration(double paramDouble) throws PhidgetException;

	public native void setCurrentLimit(double paramDouble) throws PhidgetException;

	public native void setCurrentRegulatorGain(double paramDouble) throws PhidgetException;

	public native void setDataInterval(int paramInt) throws PhidgetException;

	public native void setDeadBand(double paramDouble) throws PhidgetException;

	private final void setDeviceEvents(boolean paramBoolean) {
		this.enableDutyCycleUpdateEvents(paramBoolean && this.dutyCycleUpdateListeners.size() > 0);
		this.enablePositionChangeEvents(paramBoolean && this.positionChangeListeners.size() > 0);
	}

	public native void setEngaged(boolean paramBoolean) throws PhidgetException;

	public native void setFanMode(FanMode paramFanMode) throws PhidgetException;

	public native void setIOMode(EncoderIOMode paramEncoderIOMode) throws PhidgetException;

	public native void setKd(double paramDouble) throws PhidgetException;

	public native void setKi(double paramDouble) throws PhidgetException;

	public native void setKp(double paramDouble) throws PhidgetException;

	public native void setRescaleFactor(double paramDouble) throws PhidgetException;

	public native void setStallVelocity(double paramDouble) throws PhidgetException;

	public native void setTargetPosition(double paramDouble) throws PhidgetException;

	public native void setTargetPosition(double paramDouble, AsyncListener paramAsyncListener);

	public native void setVelocityLimit(double paramDouble) throws PhidgetException;
}
