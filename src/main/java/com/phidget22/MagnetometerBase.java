package com.phidget22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MagnetometerBase extends Phidget {

	private static native long create() throws PhidgetException;

	private List<MagnetometerMagneticFieldChangeListener> magneticFieldChangeListeners = new ArrayList<MagnetometerMagneticFieldChangeListener>();
	private long nativeMagneticFieldChangeHandler = 0L;

	public MagnetometerBase() throws PhidgetException {
		super(MagnetometerBase.create());
	}

	MagnetometerBase(long paramLong) {
		super(paramLong);
	}

	public final void addMagneticFieldChangeListener(
			MagnetometerMagneticFieldChangeListener paramMagnetometerMagneticFieldChangeListener) {
		synchronized (this.magneticFieldChangeListeners) {
			this.magneticFieldChangeListeners.add(paramMagnetometerMagneticFieldChangeListener);
			this.enableMagneticFieldChangeEvents(true);
		}
	}

	private native void enableMagneticFieldChangeEvents(boolean paramBoolean);

	private void fireMagneticFieldChange(
			MagnetometerMagneticFieldChangeEvent paramMagnetometerMagneticFieldChangeEvent) {
		Iterator<MagnetometerMagneticFieldChangeListener> localIterator;
		synchronized (this.magneticFieldChangeListeners) {
			for (localIterator = this.magneticFieldChangeListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onMagneticFieldChange(paramMagnetometerMagneticFieldChangeEvent);
			}
		}
	}

	public native int getAxisCount() throws PhidgetException;

	public native int getDataInterval() throws PhidgetException;

	public native double[] getMagneticField() throws PhidgetException;

	public native double getMagneticFieldChangeTrigger() throws PhidgetException;

	public native int getMaxDataInterval() throws PhidgetException;

	public native double[] getMaxMagneticField() throws PhidgetException;

	public native double getMaxMagneticFieldChangeTrigger() throws PhidgetException;

	public native int getMinDataInterval() throws PhidgetException;

	public native double[] getMinMagneticField() throws PhidgetException;

	public native double getMinMagneticFieldChangeTrigger() throws PhidgetException;

	public native double getTimestamp() throws PhidgetException;

	public final void removeMagneticFieldChangeListener(
			MagnetometerMagneticFieldChangeListener paramMagnetometerMagneticFieldChangeListener) {
		synchronized (this.magneticFieldChangeListeners) {
			this.magneticFieldChangeListeners.remove(paramMagnetometerMagneticFieldChangeListener);
			this.enableMagneticFieldChangeEvents(this.magneticFieldChangeListeners.size() > 0);
		}
	}

	public native void resetCorrectionParameters() throws PhidgetException;

	public native void saveCorrectionParameters() throws PhidgetException;

	public native void setCorrectionParameters(double paramDouble1, double paramDouble2, double paramDouble3,
			double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8,
			double paramDouble9, double paramDouble10, double paramDouble11, double paramDouble12, double paramDouble13)
			throws PhidgetException;

	public native void setDataInterval(int paramInt) throws PhidgetException;

	private final void setDeviceEvents(boolean paramBoolean) {
		this.enableMagneticFieldChangeEvents(paramBoolean && this.magneticFieldChangeListeners.size() > 0);
	}

	public native void setMagneticFieldChangeTrigger(double paramDouble) throws PhidgetException;
}
