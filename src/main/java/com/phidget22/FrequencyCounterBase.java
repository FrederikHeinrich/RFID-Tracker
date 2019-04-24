package com.phidget22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FrequencyCounterBase extends Phidget {

	private static native long create() throws PhidgetException;

	private List<FrequencyCounterCountChangeListener> countChangeListeners = new ArrayList<FrequencyCounterCountChangeListener>();

	private List<FrequencyCounterFrequencyChangeListener> frequencyChangeListeners = new ArrayList<FrequencyCounterFrequencyChangeListener>();
	private long nativeCountChangeHandler = 0L;
	private long nativeFrequencyChangeHandler = 0L;

	public FrequencyCounterBase() throws PhidgetException {
		super(FrequencyCounterBase.create());
	}

	FrequencyCounterBase(long paramLong) {
		super(paramLong);
	}

	public final void addCountChangeListener(
			FrequencyCounterCountChangeListener paramFrequencyCounterCountChangeListener) {
		synchronized (this.countChangeListeners) {
			this.countChangeListeners.add(paramFrequencyCounterCountChangeListener);
			this.enableCountChangeEvents(true);
		}
	}

	public final void addFrequencyChangeListener(
			FrequencyCounterFrequencyChangeListener paramFrequencyCounterFrequencyChangeListener) {
		synchronized (this.frequencyChangeListeners) {
			this.frequencyChangeListeners.add(paramFrequencyCounterFrequencyChangeListener);
			this.enableFrequencyChangeEvents(true);
		}
	}

	private native void enableCountChangeEvents(boolean paramBoolean);

	private native void enableFrequencyChangeEvents(boolean paramBoolean);

	private void fireCountChange(FrequencyCounterCountChangeEvent paramFrequencyCounterCountChangeEvent) {
		Iterator<FrequencyCounterCountChangeListener> localIterator;
		synchronized (this.countChangeListeners) {
			for (localIterator = this.countChangeListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onCountChange(paramFrequencyCounterCountChangeEvent);

			}
		}
	}

	private void fireFrequencyChange(FrequencyCounterFrequencyChangeEvent paramFrequencyCounterFrequencyChangeEvent) {
		Iterator<FrequencyCounterFrequencyChangeListener> localIterator;
		synchronized (this.frequencyChangeListeners) {
			for (localIterator = this.frequencyChangeListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onFrequencyChange(paramFrequencyCounterFrequencyChangeEvent);
			}
		}
	}

	public native long getCount() throws PhidgetException;

	public native int getDataInterval() throws PhidgetException;

	public native boolean getEnabled() throws PhidgetException;

	public native FrequencyFilterType getFilterType() throws PhidgetException;

	public native double getFrequency() throws PhidgetException;

	public native double getFrequencyCutoff() throws PhidgetException;

	public native InputMode getInputMode() throws PhidgetException;

	public native int getMaxDataInterval() throws PhidgetException;

	public native double getMaxFrequency() throws PhidgetException;

	public native double getMaxFrequencyCutoff() throws PhidgetException;

	public native int getMinDataInterval() throws PhidgetException;

	public native double getMinFrequencyCutoff() throws PhidgetException;

	public native PowerSupply getPowerSupply() throws PhidgetException;

	public native double getTimeElapsed() throws PhidgetException;

	public final void removeCountChangeListener(
			FrequencyCounterCountChangeListener paramFrequencyCounterCountChangeListener) {
		synchronized (this.countChangeListeners) {
			this.countChangeListeners.remove(paramFrequencyCounterCountChangeListener);
			this.enableCountChangeEvents(this.countChangeListeners.size() > 0);
		}
	}

	public final void removeFrequencyChangeListener(
			FrequencyCounterFrequencyChangeListener paramFrequencyCounterFrequencyChangeListener) {
		synchronized (this.frequencyChangeListeners) {
			this.frequencyChangeListeners.remove(paramFrequencyCounterFrequencyChangeListener);
			this.enableFrequencyChangeEvents(this.frequencyChangeListeners.size() > 0);
		}
	}

	public native void reset() throws PhidgetException;

	public native void setDataInterval(int paramInt) throws PhidgetException;

	private final void setDeviceEvents(boolean paramBoolean) {
		this.enableCountChangeEvents(paramBoolean && this.countChangeListeners.size() > 0);
		this.enableFrequencyChangeEvents(paramBoolean && this.frequencyChangeListeners.size() > 0);
	}

	public native void setEnabled(boolean paramBoolean) throws PhidgetException;

	public native void setFilterType(FrequencyFilterType paramFrequencyFilterType) throws PhidgetException;

	public native void setFrequencyCutoff(double paramDouble) throws PhidgetException;

	public native void setInputMode(InputMode paramInputMode) throws PhidgetException;

	public native void setPowerSupply(PowerSupply paramPowerSupply) throws PhidgetException;
}
