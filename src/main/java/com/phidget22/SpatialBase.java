package com.phidget22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SpatialBase extends Phidget {

	private static native long create() throws PhidgetException;

	private long nativeSpatialDataHandler = 0L;

	private List<SpatialSpatialDataListener> spatialDataListeners = new ArrayList<SpatialSpatialDataListener>();

	public SpatialBase() throws PhidgetException {
		super(SpatialBase.create());
	}

	SpatialBase(long paramLong) {
		super(paramLong);
	}

	public final void addSpatialDataListener(SpatialSpatialDataListener paramSpatialSpatialDataListener) {
		synchronized (this.spatialDataListeners) {
			this.spatialDataListeners.add(paramSpatialSpatialDataListener);
			this.enableSpatialDataEvents(true);
		}
	}

	private native void enableSpatialDataEvents(boolean paramBoolean);

	private void fireSpatialData(SpatialSpatialDataEvent paramSpatialSpatialDataEvent) {
		Iterator<SpatialSpatialDataListener> localIterator;
		synchronized (this.spatialDataListeners) {
			for (localIterator = this.spatialDataListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onSpatialData(paramSpatialSpatialDataEvent);
			}
		}
	}

	public native int getDataInterval() throws PhidgetException;

	public native int getMaxDataInterval() throws PhidgetException;

	public native int getMinDataInterval() throws PhidgetException;

	public final void removeSpatialDataListener(SpatialSpatialDataListener paramSpatialSpatialDataListener) {
		synchronized (this.spatialDataListeners) {
			this.spatialDataListeners.remove(paramSpatialSpatialDataListener);
			this.enableSpatialDataEvents(this.spatialDataListeners.size() > 0);
		}
	}

	public native void resetMagnetometerCorrectionParameters() throws PhidgetException;

	public native void saveMagnetometerCorrectionParameters() throws PhidgetException;

	public native void setDataInterval(int paramInt) throws PhidgetException;

	private final void setDeviceEvents(boolean paramBoolean) {
		this.enableSpatialDataEvents(paramBoolean && this.spatialDataListeners.size() > 0);
	}

	public native void setMagnetometerCorrectionParameters(double paramDouble1, double paramDouble2,
			double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7,
			double paramDouble8, double paramDouble9, double paramDouble10, double paramDouble11, double paramDouble12,
			double paramDouble13) throws PhidgetException;

	public native void zeroGyro() throws PhidgetException;
}
