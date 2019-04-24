package com.phidget22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CapacitiveTouchBase extends Phidget {

	private static native long create() throws PhidgetException;

	private long nativeTouchEndHandler = 0L;
	private long nativeTouchHandler = 0L;

	private List<CapacitiveTouchTouchEndListener> touchEndListeners = new ArrayList<CapacitiveTouchTouchEndListener>();

	private List<CapacitiveTouchTouchListener> touchListeners = new ArrayList<CapacitiveTouchTouchListener>();

	public CapacitiveTouchBase() throws PhidgetException {
		super(CapacitiveTouchBase.create());
	}

	CapacitiveTouchBase(long paramLong) {
		super(paramLong);
	}

	public final void addTouchEndListener(CapacitiveTouchTouchEndListener paramCapacitiveTouchTouchEndListener) {
		synchronized (this.touchEndListeners) {
			this.touchEndListeners.add(paramCapacitiveTouchTouchEndListener);
			this.enableTouchEndEvents(true);
		}
	}

	public final void addTouchListener(CapacitiveTouchTouchListener paramCapacitiveTouchTouchListener) {
		synchronized (this.touchListeners) {
			this.touchListeners.add(paramCapacitiveTouchTouchListener);
			this.enableTouchEvents(true);
		}
	}

	private native void enableTouchEndEvents(boolean paramBoolean);

	private native void enableTouchEvents(boolean paramBoolean);

	private void fireTouch(CapacitiveTouchTouchEvent paramCapacitiveTouchTouchEvent) {
		Iterator<CapacitiveTouchTouchListener> localIterator;
		synchronized (this.touchListeners) {
			for (localIterator = this.touchListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onTouch(paramCapacitiveTouchTouchEvent);

			}
		}
	}

	private void fireTouchEnd(CapacitiveTouchTouchEndEvent paramCapacitiveTouchTouchEndEvent) {
		Iterator<CapacitiveTouchTouchEndListener> localIterator;
		synchronized (this.touchEndListeners) {
			for (localIterator = this.touchEndListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onTouchEnd(paramCapacitiveTouchTouchEndEvent);
			}
		}
	}

	public native int getDataInterval() throws PhidgetException;

	public native boolean getIsTouched() throws PhidgetException;

	public native int getMaxDataInterval() throws PhidgetException;

	public native double getMaxSensitivity() throws PhidgetException;

	public native double getMaxTouchValue() throws PhidgetException;

	public native double getMaxTouchValueChangeTrigger() throws PhidgetException;

	public native int getMinDataInterval() throws PhidgetException;

	public native double getMinSensitivity() throws PhidgetException;

	public native double getMinTouchValue() throws PhidgetException;

	public native double getMinTouchValueChangeTrigger() throws PhidgetException;

	public native double getSensitivity() throws PhidgetException;

	public native double getTouchValue() throws PhidgetException;

	public native double getTouchValueChangeTrigger() throws PhidgetException;

	public final void removeTouchEndListener(CapacitiveTouchTouchEndListener paramCapacitiveTouchTouchEndListener) {
		synchronized (this.touchEndListeners) {
			this.touchEndListeners.remove(paramCapacitiveTouchTouchEndListener);
			this.enableTouchEndEvents(this.touchEndListeners.size() > 0);
		}
	}

	public final void removeTouchListener(CapacitiveTouchTouchListener paramCapacitiveTouchTouchListener) {
		synchronized (this.touchListeners) {
			this.touchListeners.remove(paramCapacitiveTouchTouchListener);
			this.enableTouchEvents(this.touchListeners.size() > 0);
		}
	}

	public native void setDataInterval(int paramInt) throws PhidgetException;

	private final void setDeviceEvents(boolean paramBoolean) {
		this.enableTouchEvents(paramBoolean && this.touchListeners.size() > 0);
		this.enableTouchEndEvents(paramBoolean && this.touchEndListeners.size() > 0);
	}

	public native void setSensitivity(double paramDouble) throws PhidgetException;

	public native void setTouchValueChangeTrigger(double paramDouble) throws PhidgetException;
}
