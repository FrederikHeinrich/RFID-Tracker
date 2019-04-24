package com.phidget22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GyroscopeBase extends Phidget {

	private static native long create() throws PhidgetException;

	private List<GyroscopeAngularRateUpdateListener> angularRateUpdateListeners = new ArrayList<GyroscopeAngularRateUpdateListener>();
	private long nativeAngularRateUpdateHandler = 0L;

	public GyroscopeBase() throws PhidgetException {
		super(GyroscopeBase.create());
	}

	GyroscopeBase(long paramLong) {
		super(paramLong);
	}

	public final void addAngularRateUpdateListener(
			GyroscopeAngularRateUpdateListener paramGyroscopeAngularRateUpdateListener) {
		synchronized (this.angularRateUpdateListeners) {
			this.angularRateUpdateListeners.add(paramGyroscopeAngularRateUpdateListener);
			this.enableAngularRateUpdateEvents(true);
		}
	}

	private native void enableAngularRateUpdateEvents(boolean paramBoolean);

	private void fireAngularRateUpdate(GyroscopeAngularRateUpdateEvent paramGyroscopeAngularRateUpdateEvent) {
		Iterator<GyroscopeAngularRateUpdateListener> localIterator;
		synchronized (this.angularRateUpdateListeners) {
			for (localIterator = this.angularRateUpdateListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onAngularRateUpdate(paramGyroscopeAngularRateUpdateEvent);
			}
		}
	}

	public native double[] getAngularRate() throws PhidgetException;

	public native int getAxisCount() throws PhidgetException;

	public native int getDataInterval() throws PhidgetException;

	public native double[] getMaxAngularRate() throws PhidgetException;

	public native int getMaxDataInterval() throws PhidgetException;

	public native double[] getMinAngularRate() throws PhidgetException;

	public native int getMinDataInterval() throws PhidgetException;

	public native double getTimestamp() throws PhidgetException;

	public final void removeAngularRateUpdateListener(
			GyroscopeAngularRateUpdateListener paramGyroscopeAngularRateUpdateListener) {
		synchronized (this.angularRateUpdateListeners) {
			this.angularRateUpdateListeners.remove(paramGyroscopeAngularRateUpdateListener);
			this.enableAngularRateUpdateEvents(this.angularRateUpdateListeners.size() > 0);
		}
	}

	public native void setDataInterval(int paramInt) throws PhidgetException;

	private final void setDeviceEvents(boolean paramBoolean) {
		this.enableAngularRateUpdateEvents(paramBoolean && this.angularRateUpdateListeners.size() > 0);
	}

	public native void zero() throws PhidgetException;
}
