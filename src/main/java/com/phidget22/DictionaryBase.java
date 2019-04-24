package com.phidget22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DictionaryBase extends Phidget {

	private static native long create() throws PhidgetException;

	private List<DictionaryAddListener> addListeners = new ArrayList<DictionaryAddListener>();
	private long nativeAddHandler = 0L;
	private long nativeRemoveHandler = 0L;
	private long nativeUpdateHandler = 0L;

	private List<DictionaryRemoveListener> removeListeners = new ArrayList<DictionaryRemoveListener>();

	private List<DictionaryUpdateListener> updateListeners = new ArrayList<DictionaryUpdateListener>();

	public DictionaryBase() throws PhidgetException {
		super(DictionaryBase.create());
	}

	DictionaryBase(long paramLong) {
		super(paramLong);
	}

	public native void add(String paramString1, String paramString2) throws PhidgetException;

	public final void addAddListener(DictionaryAddListener paramDictionaryAddListener) {
		synchronized (this.addListeners) {
			this.addListeners.add(paramDictionaryAddListener);
			this.enableAddEvents(true);
		}
	}

	public final void addRemoveListener(DictionaryRemoveListener paramDictionaryRemoveListener) {
		synchronized (this.removeListeners) {
			this.removeListeners.add(paramDictionaryRemoveListener);
			this.enableRemoveEvents(true);
		}
	}

	public final void addUpdateListener(DictionaryUpdateListener paramDictionaryUpdateListener) {
		synchronized (this.updateListeners) {
			this.updateListeners.add(paramDictionaryUpdateListener);
			this.enableUpdateEvents(true);
		}
	}

	private native void enableAddEvents(boolean paramBoolean);

	private native void enableRemoveEvents(boolean paramBoolean);

	private native void enableUpdateEvents(boolean paramBoolean);

	private void fireAdd(DictionaryAddEvent paramDictionaryAddEvent) {
		Iterator<DictionaryAddListener> localIterator;
		synchronized (this.addListeners) {
			for (localIterator = this.addListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onAdd(paramDictionaryAddEvent);

			}
		}
	}

	private void fireRemove(DictionaryRemoveEvent paramDictionaryRemoveEvent) {
		Iterator<DictionaryRemoveListener> localIterator;
		synchronized (this.removeListeners) {
			for (localIterator = this.removeListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onRemove(paramDictionaryRemoveEvent);

			}
		}
	}

	private void fireUpdate(DictionaryUpdateEvent paramDictionaryUpdateEvent) {
		Iterator<DictionaryUpdateListener> localIterator;
		synchronized (this.updateListeners) {
			for (localIterator = this.updateListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onUpdate(paramDictionaryUpdateEvent);
			}
		}
	}

	public native String get(String paramString) throws PhidgetException;

	public native void remove(String paramString) throws PhidgetException;

	public final void removeAddListener(DictionaryAddListener paramDictionaryAddListener) {
		synchronized (this.addListeners) {
			this.addListeners.remove(paramDictionaryAddListener);
			this.enableAddEvents(this.addListeners.size() > 0);
		}
	}

	public native void removeAll() throws PhidgetException;

	public final void removeRemoveListener(DictionaryRemoveListener paramDictionaryRemoveListener) {
		synchronized (this.removeListeners) {
			this.removeListeners.remove(paramDictionaryRemoveListener);
			this.enableRemoveEvents(this.removeListeners.size() > 0);
		}
	}

	public final void removeUpdateListener(DictionaryUpdateListener paramDictionaryUpdateListener) {
		synchronized (this.updateListeners) {
			this.updateListeners.remove(paramDictionaryUpdateListener);
			this.enableUpdateEvents(this.updateListeners.size() > 0);
		}
	}

	public native void set(String paramString1, String paramString2) throws PhidgetException;

	private final void setDeviceEvents(boolean paramBoolean) {
		this.enableAddEvents(paramBoolean && this.addListeners.size() > 0);
		this.enableRemoveEvents(paramBoolean && this.removeListeners.size() > 0);
		this.enableUpdateEvents(paramBoolean && this.updateListeners.size() > 0);
	}

	public native String sscan(String paramString) throws PhidgetException;

	public native void update(String paramString1, String paramString2) throws PhidgetException;
}
