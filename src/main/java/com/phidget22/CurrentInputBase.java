package com.phidget22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CurrentInputBase extends Phidget {

	private static native long create() throws PhidgetException;

	private List<CurrentInputCurrentChangeListener> currentChangeListeners = new ArrayList<CurrentInputCurrentChangeListener>();
	private long nativeCurrentChangeHandler = 0L;

	public CurrentInputBase() throws PhidgetException {
		super(CurrentInputBase.create());
	}

	CurrentInputBase(long paramLong) {
		super(paramLong);
	}

	public final void addCurrentChangeListener(
			CurrentInputCurrentChangeListener paramCurrentInputCurrentChangeListener) {
		synchronized (this.currentChangeListeners) {
			this.currentChangeListeners.add(paramCurrentInputCurrentChangeListener);
			this.enableCurrentChangeEvents(true);
		}
	}

	private native void enableCurrentChangeEvents(boolean paramBoolean);

	private void fireCurrentChange(CurrentInputCurrentChangeEvent paramCurrentInputCurrentChangeEvent) {
		Iterator<CurrentInputCurrentChangeListener> localIterator;
		synchronized (this.currentChangeListeners) {
			for (localIterator = this.currentChangeListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onCurrentChange(paramCurrentInputCurrentChangeEvent);
			}
		}
	}

	public native double getCurrent() throws PhidgetException;

	public native double getCurrentChangeTrigger() throws PhidgetException;

	public native int getDataInterval() throws PhidgetException;

	public native double getMaxCurrent() throws PhidgetException;

	public native double getMaxCurrentChangeTrigger() throws PhidgetException;

	public native int getMaxDataInterval() throws PhidgetException;

	public native double getMinCurrent() throws PhidgetException;

	public native double getMinCurrentChangeTrigger() throws PhidgetException;

	public native int getMinDataInterval() throws PhidgetException;

	public native PowerSupply getPowerSupply() throws PhidgetException;

	public final void removeCurrentChangeListener(
			CurrentInputCurrentChangeListener paramCurrentInputCurrentChangeListener) {
		synchronized (this.currentChangeListeners) {
			this.currentChangeListeners.remove(paramCurrentInputCurrentChangeListener);
			this.enableCurrentChangeEvents(this.currentChangeListeners.size() > 0);
		}
	}

	public native void setCurrentChangeTrigger(double paramDouble) throws PhidgetException;

	public native void setDataInterval(int paramInt) throws PhidgetException;

	private final void setDeviceEvents(boolean paramBoolean) {
		this.enableCurrentChangeEvents(paramBoolean && this.currentChangeListeners.size() > 0);
	}

	public native void setPowerSupply(PowerSupply paramPowerSupply) throws PhidgetException;
}
