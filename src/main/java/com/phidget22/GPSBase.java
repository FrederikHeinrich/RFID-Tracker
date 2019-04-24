package com.phidget22;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

public class GPSBase extends Phidget {

	private static native long create() throws PhidgetException;

	private List<GPSHeadingChangeListener> headingChangeListeners = new ArrayList<GPSHeadingChangeListener>();
	private long nativeHeadingChangeHandler = 0L;
	private long nativePositionChangeHandler = 0L;
	private long nativePositionFixStateChangeHandler = 0L;

	private List<GPSPositionChangeListener> positionChangeListeners = new ArrayList<GPSPositionChangeListener>();

	private List<GPSPositionFixStateChangeListener> positionFixStateChangeListeners = new ArrayList<GPSPositionFixStateChangeListener>();

	public GPSBase() throws PhidgetException {
		super(GPSBase.create());
	}

	GPSBase(long paramLong) {
		super(paramLong);
	}

	public final void addHeadingChangeListener(GPSHeadingChangeListener paramGPSHeadingChangeListener) {
		synchronized (this.headingChangeListeners) {
			this.headingChangeListeners.add(paramGPSHeadingChangeListener);
			this.enableHeadingChangeEvents(true);
		}
	}

	public final void addPositionChangeListener(GPSPositionChangeListener paramGPSPositionChangeListener) {
		synchronized (this.positionChangeListeners) {
			this.positionChangeListeners.add(paramGPSPositionChangeListener);
			this.enablePositionChangeEvents(true);
		}
	}

	public final void addPositionFixStateChangeListener(
			GPSPositionFixStateChangeListener paramGPSPositionFixStateChangeListener) {
		synchronized (this.positionFixStateChangeListeners) {
			this.positionFixStateChangeListeners.add(paramGPSPositionFixStateChangeListener);
			this.enablePositionFixStateChangeEvents(true);
		}
	}

	private native void enableHeadingChangeEvents(boolean paramBoolean);

	private native void enablePositionChangeEvents(boolean paramBoolean);

	private native void enablePositionFixStateChangeEvents(boolean paramBoolean);

	private void fireHeadingChange(GPSHeadingChangeEvent paramGPSHeadingChangeEvent) {
		Iterator<GPSHeadingChangeListener> localIterator;
		synchronized (this.headingChangeListeners) {
			for (localIterator = this.headingChangeListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onHeadingChange(paramGPSHeadingChangeEvent);

			}
		}
	}

	private void firePositionChange(GPSPositionChangeEvent paramGPSPositionChangeEvent) {
		Iterator<GPSPositionChangeListener> localIterator;
		synchronized (this.positionChangeListeners) {
			for (localIterator = this.positionChangeListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onPositionChange(paramGPSPositionChangeEvent);

			}
		}
	}

	private void firePositionFixStateChange(GPSPositionFixStateChangeEvent paramGPSPositionFixStateChangeEvent) {
		Iterator<GPSPositionFixStateChangeListener> localIterator;
		synchronized (this.positionFixStateChangeListeners) {
			for (localIterator = this.positionFixStateChangeListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onPositionFixStateChange(paramGPSPositionFixStateChangeEvent);
			}
		}
	}

	public native double getAltitude() throws PhidgetException;

	public native GPSDate getDate() throws PhidgetException;

	public native Calendar getDateAndTime() throws PhidgetException;

	public native double getHeading() throws PhidgetException;

	public native double getLatitude() throws PhidgetException;

	public native double getLongitude() throws PhidgetException;

	public native NMEAData getNMEAData() throws PhidgetException;

	public native boolean getPositionFixState() throws PhidgetException;

	public native GPSTime getTime() throws PhidgetException;

	public native double getVelocity() throws PhidgetException;

	public final void removeHeadingChangeListener(GPSHeadingChangeListener paramGPSHeadingChangeListener) {
		synchronized (this.headingChangeListeners) {
			this.headingChangeListeners.remove(paramGPSHeadingChangeListener);
			this.enableHeadingChangeEvents(this.headingChangeListeners.size() > 0);
		}
	}

	public final void removePositionChangeListener(GPSPositionChangeListener paramGPSPositionChangeListener) {
		synchronized (this.positionChangeListeners) {
			this.positionChangeListeners.remove(paramGPSPositionChangeListener);
			this.enablePositionChangeEvents(this.positionChangeListeners.size() > 0);
		}
	}

	public final void removePositionFixStateChangeListener(
			GPSPositionFixStateChangeListener paramGPSPositionFixStateChangeListener) {
		synchronized (this.positionFixStateChangeListeners) {
			this.positionFixStateChangeListeners.remove(paramGPSPositionFixStateChangeListener);
			this.enablePositionFixStateChangeEvents(this.positionFixStateChangeListeners.size() > 0);
		}
	}

	private final void setDeviceEvents(boolean paramBoolean) {
		this.enableHeadingChangeEvents(paramBoolean && this.headingChangeListeners.size() > 0);
		this.enablePositionChangeEvents(paramBoolean && this.positionChangeListeners.size() > 0);
		this.enablePositionFixStateChangeEvents(paramBoolean && this.positionFixStateChangeListeners.size() > 0);
	}
}
