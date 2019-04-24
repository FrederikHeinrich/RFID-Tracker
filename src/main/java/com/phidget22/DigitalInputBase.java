package com.phidget22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DigitalInputBase extends Phidget {

	private static native long create() throws PhidgetException;

	private long nativeStateChangeHandler = 0L;

	private List<DigitalInputStateChangeListener> stateChangeListeners = new ArrayList<DigitalInputStateChangeListener>();

	public DigitalInputBase() throws PhidgetException {
		super(DigitalInputBase.create());
	}

	DigitalInputBase(long paramLong) {
		super(paramLong);
	}

	public final void addStateChangeListener(DigitalInputStateChangeListener paramDigitalInputStateChangeListener) {
		synchronized (this.stateChangeListeners) {
			this.stateChangeListeners.add(paramDigitalInputStateChangeListener);
			this.enableStateChangeEvents(true);
		}
	}

	private native void enableStateChangeEvents(boolean paramBoolean);

	private void fireStateChange(DigitalInputStateChangeEvent paramDigitalInputStateChangeEvent) {
		Iterator<DigitalInputStateChangeListener> localIterator;
		synchronized (this.stateChangeListeners) {
			for (localIterator = this.stateChangeListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onStateChange(paramDigitalInputStateChangeEvent);
			}
		}
	}

	public native InputMode getInputMode() throws PhidgetException;

	public native PowerSupply getPowerSupply() throws PhidgetException;

	public native boolean getState() throws PhidgetException;

	public final void removeStateChangeListener(DigitalInputStateChangeListener paramDigitalInputStateChangeListener) {
		synchronized (this.stateChangeListeners) {
			this.stateChangeListeners.remove(paramDigitalInputStateChangeListener);
			this.enableStateChangeEvents(this.stateChangeListeners.size() > 0);
		}
	}

	private final void setDeviceEvents(boolean paramBoolean) {
		this.enableStateChangeEvents(paramBoolean && this.stateChangeListeners.size() > 0);
	}

	public native void setInputMode(InputMode paramInputMode) throws PhidgetException;

	public native void setPowerSupply(PowerSupply paramPowerSupply) throws PhidgetException;
}
