package com.phidget22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StepperBase extends Phidget {

	private static native long create() throws PhidgetException;

	private long nativePositionChangeHandler = 0L;
	private long nativeStoppedHandler = 0L;
	private long nativeVelocityChangeHandler = 0L;

	private List<StepperPositionChangeListener> positionChangeListeners = new ArrayList<StepperPositionChangeListener>();

	private List<StepperStoppedListener> stoppedListeners = new ArrayList<StepperStoppedListener>();

	private List<StepperVelocityChangeListener> velocityChangeListeners = new ArrayList<StepperVelocityChangeListener>();

	public StepperBase() throws PhidgetException {
		super(StepperBase.create());
	}

	StepperBase(long paramLong) {
		super(paramLong);
	}

	public final void addPositionChangeListener(StepperPositionChangeListener paramStepperPositionChangeListener) {
		synchronized (this.positionChangeListeners) {
			this.positionChangeListeners.add(paramStepperPositionChangeListener);
			this.enablePositionChangeEvents(true);
		}
	}

	public native void addPositionOffset(double paramDouble) throws PhidgetException;

	public final void addStoppedListener(StepperStoppedListener paramStepperStoppedListener) {
		synchronized (this.stoppedListeners) {
			this.stoppedListeners.add(paramStepperStoppedListener);
			this.enableStoppedEvents(true);
		}
	}

	public final void addVelocityChangeListener(StepperVelocityChangeListener paramStepperVelocityChangeListener) {
		synchronized (this.velocityChangeListeners) {
			this.velocityChangeListeners.add(paramStepperVelocityChangeListener);
			this.enableVelocityChangeEvents(true);
		}
	}

	private native void enablePositionChangeEvents(boolean paramBoolean);

	private native void enableStoppedEvents(boolean paramBoolean);

	private native void enableVelocityChangeEvents(boolean paramBoolean);

	private void firePositionChange(StepperPositionChangeEvent paramStepperPositionChangeEvent) {
		Iterator<StepperPositionChangeListener> localIterator;
		synchronized (this.positionChangeListeners) {
			for (localIterator = this.positionChangeListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onPositionChange(paramStepperPositionChangeEvent);

			}
		}
	}

	private void fireStopped(StepperStoppedEvent paramStepperStoppedEvent) {
		Iterator<StepperStoppedListener> localIterator;
		synchronized (this.stoppedListeners) {
			for (localIterator = this.stoppedListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onStopped(paramStepperStoppedEvent);

			}
		}
	}

	private void fireVelocityChange(StepperVelocityChangeEvent paramStepperVelocityChangeEvent) {
		Iterator<StepperVelocityChangeListener> localIterator;
		synchronized (this.velocityChangeListeners) {
			for (localIterator = this.velocityChangeListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onVelocityChange(paramStepperVelocityChangeEvent);
			}
		}
	}

	public native double getAcceleration() throws PhidgetException;

	public native StepperControlMode getControlMode() throws PhidgetException;

	public native double getCurrentLimit() throws PhidgetException;

	public native int getDataInterval() throws PhidgetException;

	public native boolean getEngaged() throws PhidgetException;

	public native double getHoldingCurrentLimit() throws PhidgetException;

	public native boolean getIsMoving() throws PhidgetException;

	public native double getMaxAcceleration() throws PhidgetException;

	public native double getMaxCurrentLimit() throws PhidgetException;

	public native int getMaxDataInterval() throws PhidgetException;

	public native double getMaxPosition() throws PhidgetException;

	public native double getMaxVelocityLimit() throws PhidgetException;

	public native double getMinAcceleration() throws PhidgetException;

	public native double getMinCurrentLimit() throws PhidgetException;

	public native int getMinDataInterval() throws PhidgetException;

	public native double getMinPosition() throws PhidgetException;

	public native double getMinVelocityLimit() throws PhidgetException;

	public native double getPosition() throws PhidgetException;

	public native double getRescaleFactor() throws PhidgetException;

	public native double getTargetPosition() throws PhidgetException;

	public native double getVelocity() throws PhidgetException;

	public native double getVelocityLimit() throws PhidgetException;

	public final void removePositionChangeListener(StepperPositionChangeListener paramStepperPositionChangeListener) {
		synchronized (this.positionChangeListeners) {
			this.positionChangeListeners.remove(paramStepperPositionChangeListener);
			this.enablePositionChangeEvents(this.positionChangeListeners.size() > 0);
		}
	}

	public final void removeStoppedListener(StepperStoppedListener paramStepperStoppedListener) {
		synchronized (this.stoppedListeners) {
			this.stoppedListeners.remove(paramStepperStoppedListener);
			this.enableStoppedEvents(this.stoppedListeners.size() > 0);
		}
	}

	public final void removeVelocityChangeListener(StepperVelocityChangeListener paramStepperVelocityChangeListener) {
		synchronized (this.velocityChangeListeners) {
			this.velocityChangeListeners.remove(paramStepperVelocityChangeListener);
			this.enableVelocityChangeEvents(this.velocityChangeListeners.size() > 0);
		}
	}

	public native void setAcceleration(double paramDouble) throws PhidgetException;

	public native void setControlMode(StepperControlMode paramStepperControlMode) throws PhidgetException;

	public native void setCurrentLimit(double paramDouble) throws PhidgetException;

	public native void setDataInterval(int paramInt) throws PhidgetException;

	private final void setDeviceEvents(boolean paramBoolean) {
		this.enablePositionChangeEvents(paramBoolean && this.positionChangeListeners.size() > 0);
		this.enableStoppedEvents(paramBoolean && this.stoppedListeners.size() > 0);
		this.enableVelocityChangeEvents(paramBoolean && this.velocityChangeListeners.size() > 0);
	}

	public native void setEngaged(boolean paramBoolean) throws PhidgetException;

	public native void setHoldingCurrentLimit(double paramDouble) throws PhidgetException;

	public native void setRescaleFactor(double paramDouble) throws PhidgetException;

	public native void setTargetPosition(double paramDouble) throws PhidgetException;

	public native void setTargetPosition(double paramDouble, AsyncListener paramAsyncListener);

	public native void setVelocityLimit(double paramDouble) throws PhidgetException;
}
