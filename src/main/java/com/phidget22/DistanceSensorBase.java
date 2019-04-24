package com.phidget22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DistanceSensorBase extends Phidget {

	private static native long create() throws PhidgetException;

	private List<DistanceSensorDistanceChangeListener> distanceChangeListeners = new ArrayList<DistanceSensorDistanceChangeListener>();
	private long nativeDistanceChangeHandler = 0L;
	private long nativeSonarReflectionsUpdateHandler = 0L;

	private List<DistanceSensorSonarReflectionsUpdateListener> sonarReflectionsUpdateListeners = new ArrayList<DistanceSensorSonarReflectionsUpdateListener>();

	public DistanceSensorBase() throws PhidgetException {
		super(DistanceSensorBase.create());
	}

	DistanceSensorBase(long paramLong) {
		super(paramLong);
	}

	public final void addDistanceChangeListener(
			DistanceSensorDistanceChangeListener paramDistanceSensorDistanceChangeListener) {
		synchronized (this.distanceChangeListeners) {
			this.distanceChangeListeners.add(paramDistanceSensorDistanceChangeListener);
			this.enableDistanceChangeEvents(true);
		}
	}

	public final void addSonarReflectionsUpdateListener(
			DistanceSensorSonarReflectionsUpdateListener paramDistanceSensorSonarReflectionsUpdateListener) {
		synchronized (this.sonarReflectionsUpdateListeners) {
			this.sonarReflectionsUpdateListeners.add(paramDistanceSensorSonarReflectionsUpdateListener);
			this.enableSonarReflectionsUpdateEvents(true);
		}
	}

	private native void enableDistanceChangeEvents(boolean paramBoolean);

	private native void enableSonarReflectionsUpdateEvents(boolean paramBoolean);

	private void fireDistanceChange(DistanceSensorDistanceChangeEvent paramDistanceSensorDistanceChangeEvent) {
		Iterator<DistanceSensorDistanceChangeListener> localIterator;
		synchronized (this.distanceChangeListeners) {
			for (localIterator = this.distanceChangeListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onDistanceChange(paramDistanceSensorDistanceChangeEvent);

			}
		}
	}

	private void fireSonarReflectionsUpdate(
			DistanceSensorSonarReflectionsUpdateEvent paramDistanceSensorSonarReflectionsUpdateEvent) {
		Iterator<DistanceSensorSonarReflectionsUpdateListener> localIterator;
		synchronized (this.sonarReflectionsUpdateListeners) {
			for (localIterator = this.sonarReflectionsUpdateListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onSonarReflectionsUpdate(paramDistanceSensorSonarReflectionsUpdateEvent);
			}
		}
	}

	public native int getDataInterval() throws PhidgetException;

	public native int getDistance() throws PhidgetException;

	public native int getDistanceChangeTrigger() throws PhidgetException;

	public native int getMaxDataInterval() throws PhidgetException;

	public native int getMaxDistance() throws PhidgetException;

	public native int getMaxDistanceChangeTrigger() throws PhidgetException;

	public native int getMinDataInterval() throws PhidgetException;

	public native int getMinDistance() throws PhidgetException;

	public native int getMinDistanceChangeTrigger() throws PhidgetException;

	public native boolean getSonarQuietMode() throws PhidgetException;

	public native DistanceSensorSonarReflections getSonarReflections() throws PhidgetException;

	public final void removeDistanceChangeListener(
			DistanceSensorDistanceChangeListener paramDistanceSensorDistanceChangeListener) {
		synchronized (this.distanceChangeListeners) {
			this.distanceChangeListeners.remove(paramDistanceSensorDistanceChangeListener);
			this.enableDistanceChangeEvents(this.distanceChangeListeners.size() > 0);
		}
	}

	public final void removeSonarReflectionsUpdateListener(
			DistanceSensorSonarReflectionsUpdateListener paramDistanceSensorSonarReflectionsUpdateListener) {
		synchronized (this.sonarReflectionsUpdateListeners) {
			this.sonarReflectionsUpdateListeners.remove(paramDistanceSensorSonarReflectionsUpdateListener);
			this.enableSonarReflectionsUpdateEvents(this.sonarReflectionsUpdateListeners.size() > 0);
		}
	}

	public native void setDataInterval(int paramInt) throws PhidgetException;

	private final void setDeviceEvents(boolean paramBoolean) {
		this.enableDistanceChangeEvents(paramBoolean && this.distanceChangeListeners.size() > 0);
		this.enableSonarReflectionsUpdateEvents(paramBoolean && this.sonarReflectionsUpdateListeners.size() > 0);
	}

	public native void setDistanceChangeTrigger(int paramInt) throws PhidgetException;

	public native void setSonarQuietMode(boolean paramBoolean) throws PhidgetException;
}
