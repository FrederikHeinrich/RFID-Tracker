package com.phidget22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ResistanceInputBase extends Phidget {

	private static native long create() throws PhidgetException;

	private long nativeResistanceChangeHandler = 0L;

	private List<ResistanceInputResistanceChangeListener> resistanceChangeListeners = new ArrayList<ResistanceInputResistanceChangeListener>();

	public ResistanceInputBase() throws PhidgetException {
		super(ResistanceInputBase.create());
	}

	ResistanceInputBase(long paramLong) {
		super(paramLong);
	}

	public final void addResistanceChangeListener(
			ResistanceInputResistanceChangeListener paramResistanceInputResistanceChangeListener) {
		synchronized (this.resistanceChangeListeners) {
			this.resistanceChangeListeners.add(paramResistanceInputResistanceChangeListener);
			this.enableResistanceChangeEvents(true);
		}
	}

	private native void enableResistanceChangeEvents(boolean paramBoolean);

	private void fireResistanceChange(ResistanceInputResistanceChangeEvent paramResistanceInputResistanceChangeEvent) {
		Iterator<ResistanceInputResistanceChangeListener> localIterator;
		synchronized (this.resistanceChangeListeners) {
			for (localIterator = this.resistanceChangeListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onResistanceChange(paramResistanceInputResistanceChangeEvent);
			}
		}
	}

	public native int getDataInterval() throws PhidgetException;

	public native int getMaxDataInterval() throws PhidgetException;

	public native double getMaxResistance() throws PhidgetException;

	public native double getMaxResistanceChangeTrigger() throws PhidgetException;

	public native int getMinDataInterval() throws PhidgetException;

	public native double getMinResistance() throws PhidgetException;

	public native double getMinResistanceChangeTrigger() throws PhidgetException;

	public native double getResistance() throws PhidgetException;

	public native double getResistanceChangeTrigger() throws PhidgetException;

	public native RTDWireSetup getRTDWireSetup() throws PhidgetException;

	public final void removeResistanceChangeListener(
			ResistanceInputResistanceChangeListener paramResistanceInputResistanceChangeListener) {
		synchronized (this.resistanceChangeListeners) {
			this.resistanceChangeListeners.remove(paramResistanceInputResistanceChangeListener);
			this.enableResistanceChangeEvents(this.resistanceChangeListeners.size() > 0);
		}
	}

	public native void setDataInterval(int paramInt) throws PhidgetException;

	private final void setDeviceEvents(boolean paramBoolean) {
		this.enableResistanceChangeEvents(paramBoolean && this.resistanceChangeListeners.size() > 0);
	}

	public native void setResistanceChangeTrigger(double paramDouble) throws PhidgetException;

	public native void setRTDWireSetup(RTDWireSetup paramRTDWireSetup) throws PhidgetException;
}
