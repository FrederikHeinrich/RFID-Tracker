package com.phidget22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SoundSensorBase extends Phidget {

	private static native long create() throws PhidgetException;

	private long nativeSPLChangeHandler = 0L;

	private List<SoundSensorSPLChangeListener> SPLChangeListeners = new ArrayList<SoundSensorSPLChangeListener>();

	public SoundSensorBase() throws PhidgetException {
		super(SoundSensorBase.create());
	}

	SoundSensorBase(long paramLong) {
		super(paramLong);
	}

	public final void addSPLChangeListener(SoundSensorSPLChangeListener paramSoundSensorSPLChangeListener) {
		synchronized (this.SPLChangeListeners) {
			this.SPLChangeListeners.add(paramSoundSensorSPLChangeListener);
			this.enableSPLChangeEvents(true);
		}
	}

	private native void enableSPLChangeEvents(boolean paramBoolean);

	private void fireSPLChange(SoundSensorSPLChangeEvent paramSoundSensorSPLChangeEvent) {
		Iterator<SoundSensorSPLChangeListener> localIterator;
		synchronized (this.SPLChangeListeners) {
			for (localIterator = this.SPLChangeListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onSPLChange(paramSoundSensorSPLChangeEvent);
			}
		}
	}

	public native int getDataInterval() throws PhidgetException;

	public native double getdB() throws PhidgetException;

	public native double getdBA() throws PhidgetException;

	public native double getdBC() throws PhidgetException;

	public native int getMaxDataInterval() throws PhidgetException;

	public native double getMaxdB() throws PhidgetException;

	public native double getMaxSPLChangeTrigger() throws PhidgetException;

	public native int getMinDataInterval() throws PhidgetException;

	public native double getMinSPLChangeTrigger() throws PhidgetException;

	public native double getNoiseFloor() throws PhidgetException;

	public native double[] getOctaves() throws PhidgetException;

	public native double getSPLChangeTrigger() throws PhidgetException;

	public native SPLRange getSPLRange() throws PhidgetException;

	public final void removeSPLChangeListener(SoundSensorSPLChangeListener paramSoundSensorSPLChangeListener) {
		synchronized (this.SPLChangeListeners) {
			this.SPLChangeListeners.remove(paramSoundSensorSPLChangeListener);
			this.enableSPLChangeEvents(this.SPLChangeListeners.size() > 0);
		}
	}

	public native void setDataInterval(int paramInt) throws PhidgetException;

	private final void setDeviceEvents(boolean paramBoolean) {
		this.enableSPLChangeEvents(paramBoolean && this.SPLChangeListeners.size() > 0);
	}

	public native void setSPLChangeTrigger(double paramDouble) throws PhidgetException;

	public native void setSPLRange(SPLRange paramSPLRange) throws PhidgetException;
}
