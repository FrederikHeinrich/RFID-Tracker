 package com.phidget22;


 import java.util.ArrayList;
 import java.util.Iterator;
 import java.util.List;



















 public class RCServoBase extends Phidget
 {
	
	 private static native long create() throws PhidgetException;

	 private long nativePositionChangeHandler = 0L;
	 private long nativeTargetPositionReachedHandler = 0L;
	 private long nativeVelocityChangeHandler = 0L;
	
	 private List<RCServoPositionChangeListener> positionChangeListeners = new ArrayList<RCServoPositionChangeListener>();
	
	 private List<RCServoTargetPositionReachedListener> targetPositionReachedListeners = new ArrayList<RCServoTargetPositionReachedListener>();
	
	 private List<RCServoVelocityChangeListener> velocityChangeListeners = new ArrayList<RCServoVelocityChangeListener>();

	
	 public RCServoBase() throws PhidgetException {
		 super(RCServoBase.create());
		 }

	 RCServoBase(long paramLong)
	 {
		 super(paramLong);
		 }

	
	 public final void addPositionChangeListener(
			RCServoPositionChangeListener paramRCServoPositionChangeListener) {
		 synchronized (this.positionChangeListeners) {
			 this.positionChangeListeners.add(paramRCServoPositionChangeListener);
			 this.enablePositionChangeEvents(true);
			 }
	}

	
	 public final void addTargetPositionReachedListener(
			RCServoTargetPositionReachedListener paramRCServoTargetPositionReachedListener) {
		synchronized (this.targetPositionReachedListeners) {
			 this.targetPositionReachedListeners.add(paramRCServoTargetPositionReachedListener);
			 this.enableTargetPositionReachedEvents(true);
			 }
	}

	
	 public final void addVelocityChangeListener(
			RCServoVelocityChangeListener paramRCServoVelocityChangeListener) {
		synchronized (this.velocityChangeListeners) {
			 this.velocityChangeListeners.add(paramRCServoVelocityChangeListener);
			 this.enableVelocityChangeEvents(true);
			 }
	}

	
	 private native void enablePositionChangeEvents(boolean paramBoolean);

	
	 private native void enableTargetPositionReachedEvents(boolean paramBoolean);

	
	 private native void enableVelocityChangeEvents(boolean paramBoolean);

	
	 private void firePositionChange(RCServoPositionChangeEvent paramRCServoPositionChangeEvent) {
		Iterator<RCServoPositionChangeListener> localIterator;
		 synchronized (this.positionChangeListeners) {
			 for (localIterator = this.positionChangeListeners.iterator(); localIterator.hasNext();) {
				 localIterator.next().onPositionChange(paramRCServoPositionChangeEvent);
				
			}
		}
		 }

	
	 private void fireTargetPositionReached(
			RCServoTargetPositionReachedEvent paramRCServoTargetPositionReachedEvent) {
		Iterator<RCServoTargetPositionReachedListener> localIterator;
		 synchronized (this.targetPositionReachedListeners) {
			 for (localIterator = this.targetPositionReachedListeners.iterator(); localIterator.hasNext();) {
				 localIterator.next().onTargetPositionReached(paramRCServoTargetPositionReachedEvent);
				
			}
		}
		 }

	
	 private void fireVelocityChange(RCServoVelocityChangeEvent paramRCServoVelocityChangeEvent) {
		Iterator<RCServoVelocityChangeListener> localIterator;
		 synchronized (this.velocityChangeListeners) {
			 for (localIterator = this.velocityChangeListeners.iterator(); localIterator.hasNext();) {
				 localIterator.next().onVelocityChange(paramRCServoVelocityChangeEvent);
				 }
			 }
		 }

	
	 public native double getAcceleration() throws PhidgetException;

	
	 public native int getDataInterval() throws PhidgetException;

	
	 public native boolean getEngaged() throws PhidgetException;

	
	 public native boolean getIsMoving() throws PhidgetException;

	
	 public native double getMaxAcceleration() throws PhidgetException;

	
	 public native int getMaxDataInterval() throws PhidgetException;

	
	 public native double getMaxPosition() throws PhidgetException;

	
	 public native double getMaxPulseWidth() throws PhidgetException;

	
	 public native double getMaxPulseWidthLimit() throws PhidgetException;

	
	 public native double getMaxTorque() throws PhidgetException;

	
	 public native double getMaxVelocityLimit() throws PhidgetException;

	
	 public native double getMinAcceleration() throws PhidgetException;

	
	 public native int getMinDataInterval() throws PhidgetException;

	
	 public native double getMinPosition() throws PhidgetException;

	
	 public native double getMinPulseWidth() throws PhidgetException;

	
	 public native double getMinPulseWidthLimit() throws PhidgetException;

	
	 public native double getMinTorque() throws PhidgetException;

	
	 public native double getMinVelocityLimit() throws PhidgetException;

	
	 public native double getPosition() throws PhidgetException;

	
	 public native boolean getSpeedRampingState() throws PhidgetException;

	
	 public native double getTargetPosition() throws PhidgetException;

	
	 public native double getTorque() throws PhidgetException;

	
	 public native double getVelocity() throws PhidgetException;

	
	 public native double getVelocityLimit() throws PhidgetException;

	
	 public native RCServoVoltage getVoltage() throws PhidgetException;

	
	 public final void removePositionChangeListener(
			RCServoPositionChangeListener paramRCServoPositionChangeListener) {
		synchronized (this.positionChangeListeners) {
			 this.positionChangeListeners.remove(paramRCServoPositionChangeListener);
			 this.enablePositionChangeEvents(this.positionChangeListeners.size() > 0);
			 }
	}

	
	 public final void removeTargetPositionReachedListener(
			RCServoTargetPositionReachedListener paramRCServoTargetPositionReachedListener) {
		synchronized (this.targetPositionReachedListeners) {
			 this.targetPositionReachedListeners.remove(paramRCServoTargetPositionReachedListener);
			 this.enableTargetPositionReachedEvents(this.targetPositionReachedListeners.size() > 0);
			 }
	}

	
	 public final void removeVelocityChangeListener(
			RCServoVelocityChangeListener paramRCServoVelocityChangeListener) {
		synchronized (this.velocityChangeListeners) {
			 this.velocityChangeListeners.remove(paramRCServoVelocityChangeListener);
			 this.enableVelocityChangeEvents(this.velocityChangeListeners.size() > 0);
			 }
	}

	
	 public native void setAcceleration(double paramDouble) throws PhidgetException;

	
	 public native void setDataInterval(int paramInt) throws PhidgetException;

	
	 private final void setDeviceEvents(boolean paramBoolean) {
		 this.enablePositionChangeEvents(paramBoolean && (this.positionChangeListeners.size() > 0));
		 this
				.enableTargetPositionReachedEvents(paramBoolean && (this.targetPositionReachedListeners.size() > 0));
		 this.enableVelocityChangeEvents(paramBoolean && (this.velocityChangeListeners.size() > 0));
		 }

	
	 public native void setEngaged(boolean paramBoolean) throws PhidgetException;

	
	 public native void setMaxPosition(double paramDouble) throws PhidgetException;

	
	 public native void setMaxPulseWidth(double paramDouble) throws PhidgetException;

	
	 public native void setMinPosition(double paramDouble) throws PhidgetException;

	
	 public native void setMinPulseWidth(double paramDouble) throws PhidgetException;

	
	 public native void setSpeedRampingState(boolean paramBoolean) throws PhidgetException;

	
	 public native void setTargetPosition(double paramDouble) throws PhidgetException;

	
	 public native void setTargetPosition(double paramDouble, AsyncListener paramAsyncListener);

	
	 public native void setTorque(double paramDouble) throws PhidgetException;

	
	 public native void setVelocityLimit(double paramDouble) throws PhidgetException;

	
	 public native void setVoltage(RCServoVoltage paramRCServoVoltage) throws PhidgetException;
	 }

/*
 
  Java
 * compiler version: 7 (51.0) JD-Core Version: 0.7.1
 */