package com.phidget22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RFIDBase extends Phidget {
	private static native long create() throws PhidgetException;

	private long nativeTagHandler = 0L;

	private long nativeTagLostHandler = 0L;

	private List<RFIDTagListener> tagListeners = new ArrayList<RFIDTagListener>();

	private List<RFIDTagLostListener> tagLostListeners = new ArrayList<RFIDTagLostListener>();

	public RFIDBase() throws PhidgetException {
		super(RFIDBase.create());
	}

	RFIDBase(long paramLong) {
		super(paramLong);
	}

	public final void addTagListener(RFIDTagListener paramRFIDTagListener) {
		synchronized (this.tagListeners) {
			this.tagListeners.add(paramRFIDTagListener);
			this.enableTagEvents(true);
		}
	}

	public final void addTagLostListener(RFIDTagLostListener paramRFIDTagLostListener) {
		synchronized (this.tagLostListeners) {
			this.tagLostListeners.add(paramRFIDTagLostListener);
			this.enableTagLostEvents(true);
		}
	}

	private native void enableTagEvents(boolean paramBoolean);

	private native void enableTagLostEvents(boolean paramBoolean);

	private void fireTag(RFIDTagEvent paramRFIDTagEvent) {
		Iterator<RFIDTagListener> localIterator;
		synchronized (this.tagListeners) {
			for (localIterator = this.tagListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onTag(paramRFIDTagEvent);
			}
		}
	}

	private void fireTagLost(RFIDTagLostEvent paramRFIDTagLostEvent) {
		Iterator<RFIDTagLostListener> localIterator;
		synchronized (this.tagLostListeners) {
			for (localIterator = this.tagLostListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onTagLost(paramRFIDTagLostEvent);
			}
		}
	}

	public native boolean getAntennaEnabled() throws PhidgetException;

	public native RFIDTag getLastTag() throws PhidgetException;

	public native boolean getTagPresent() throws PhidgetException;

	public final void removeTagListener(RFIDTagListener paramRFIDTagListener) {
		synchronized (this.tagListeners) {
			this.tagListeners.remove(paramRFIDTagListener);
			this.enableTagEvents(this.tagListeners.size() > 0);
		}
	}

	public final void removeTagLostListener(RFIDTagLostListener paramRFIDTagLostListener) {
		synchronized (this.tagLostListeners) {
			this.tagLostListeners.remove(paramRFIDTagLostListener);
			this.enableTagLostEvents(this.tagLostListeners.size() > 0);
		}
	}

	public native void setAntennaEnabled(boolean paramBoolean) throws PhidgetException;

	private final void setDeviceEvents(boolean paramBoolean) {
		this.enableTagEvents(paramBoolean && (this.tagListeners.size() > 0));
		this.enableTagLostEvents(paramBoolean && (this.tagLostListeners.size() > 0));
	}

	public native void write(String paramString, RFIDProtocol paramRFIDProtocol, boolean paramBoolean)
			throws PhidgetException;
}