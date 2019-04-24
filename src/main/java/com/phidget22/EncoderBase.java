package com.phidget22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EncoderBase extends Phidget {

	private static native long create() throws PhidgetException;

	private long nativePositionChangeHandler = 0L;

	private List<EncoderPositionChangeListener> positionChangeListeners = new ArrayList<EncoderPositionChangeListener>();

	public EncoderBase() throws PhidgetException {
		super(EncoderBase.create());
	}

	EncoderBase(long paramLong) {
		super(paramLong);
	}

	public final void addPositionChangeListener(EncoderPositionChangeListener paramEncoderPositionChangeListener) {
		synchronized (this.positionChangeListeners) {
			this.positionChangeListeners.add(paramEncoderPositionChangeListener);
			this.enablePositionChangeEvents(true);
		}
	}

	private native void enablePositionChangeEvents(boolean paramBoolean);

	private void firePositionChange(EncoderPositionChangeEvent paramEncoderPositionChangeEvent) {
		Iterator<EncoderPositionChangeListener> localIterator;
		synchronized (this.positionChangeListeners) {
			for (localIterator = this.positionChangeListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onPositionChange(paramEncoderPositionChangeEvent);
			}
		}
	}

	public native int getDataInterval() throws PhidgetException;

	public native boolean getEnabled() throws PhidgetException;

	public native long getIndexPosition() throws PhidgetException;

	public native EncoderIOMode getIOMode() throws PhidgetException;

	public native int getMaxDataInterval() throws PhidgetException;

	public native int getMaxPositionChangeTrigger() throws PhidgetException;

	public native int getMinDataInterval() throws PhidgetException;

	public native int getMinPositionChangeTrigger() throws PhidgetException;

	public native long getPosition() throws PhidgetException;

	public native int getPositionChangeTrigger() throws PhidgetException;

	public final void removePositionChangeListener(EncoderPositionChangeListener paramEncoderPositionChangeListener) {
		synchronized (this.positionChangeListeners) {
			this.positionChangeListeners.remove(paramEncoderPositionChangeListener);
			this.enablePositionChangeEvents(this.positionChangeListeners.size() > 0);
		}
	}

	public native void setDataInterval(int paramInt) throws PhidgetException;

	private final void setDeviceEvents(boolean paramBoolean) {
		this.enablePositionChangeEvents(paramBoolean && this.positionChangeListeners.size() > 0);
	}

	public native void setEnabled(boolean paramBoolean) throws PhidgetException;

	public native void setIOMode(EncoderIOMode paramEncoderIOMode) throws PhidgetException;

	public native void setPosition(long paramLong) throws PhidgetException;

	public native void setPositionChangeTrigger(int paramInt) throws PhidgetException;
}
