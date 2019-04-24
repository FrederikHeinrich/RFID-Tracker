package com.phidget22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ManagerBase {
	static {
		try {
			System.loadLibrary("phidget22java");
		} catch (UnsatisfiedLinkError localUnsatisfiedLinkError) {
			String str = System.getProperty("os.name");
			if (str.startsWith("Linux")) {
				throw new ExceptionInInitializerError(localUnsatisfiedLinkError.getMessage()
						+ "\nCould not locate the Phidget C library (libphidget22java.so)."
						+ "\nMake sure it is installed, and add it' s path to LD_LIBRARY_PATH.");
			}

			if (str.startsWith("Windows")) {
				throw new ExceptionInInitializerError(
						localUnsatisfiedLinkError.getMessage() + "\nCould not locate the Phidget C library."
								+ "\nThe Windows Phidget22 MSI must be installed.");
			}

			if (str.startsWith("Mac")) {
				throw new ExceptionInInitializerError(localUnsatisfiedLinkError.getMessage()
						+ "\nCould not locate the Phidget C library." + "\nThe Mac Phidget22 DMG must be installed.");
			}

			throw new ExceptionInInitializerError(
					localUnsatisfiedLinkError.getMessage() + "\nCould not locate the Phidget C library.");
		}
	}

	private static native long create() throws PhidgetException;

	private List<ManagerAttachListener> attachListeners = new ArrayList<ManagerAttachListener>();

	private List<ManagerDetachListener> detachListeners = new ArrayList<ManagerDetachListener>();

	long handle = 0L;
	private long nativeAttachHandler = 0L;
	private long nativeDetachHandler = 0L;

	public ManagerBase() throws PhidgetException {
		this.handle = ManagerBase.create();
	}

	public final void addAttachListener(ManagerAttachListener paramManagerAttachListener) {
		synchronized (this.attachListeners) {
			this.attachListeners.add(paramManagerAttachListener);
			this.enableAttachEvents(true);
		}
	}

	public final void addDetachListener(ManagerDetachListener paramManagerDetachListener) {
		synchronized (this.detachListeners) {
			this.detachListeners.add(paramManagerDetachListener);
			this.enableDetachEvents(true);
		}
	}

	public native void close() throws PhidgetException;

	private native void enableAttachEvents(boolean paramBoolean);

	private native void enableDetachEvents(boolean paramBoolean);

	private void fireAttach(ManagerAttachEvent paramManagerAttachEvent) {
		Iterator<ManagerAttachListener> localIterator;
		synchronized (this.attachListeners) {
			for (localIterator = this.attachListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onAttach(paramManagerAttachEvent);
			}
		}
	}

	private void fireDetach(ManagerDetachEvent paramManagerDetachEvent) {
		Iterator<ManagerDetachListener> localIterator;
		synchronized (this.detachListeners) {
			for (localIterator = this.detachListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onDetach(paramManagerDetachEvent);
			}
		}
	}

	public native void open() throws PhidgetException;

	public final void removeAttachListener(ManagerAttachListener paramManagerAttachListener) {
		synchronized (this.attachListeners) {
			this.attachListeners.remove(paramManagerAttachListener);
			this.enableAttachEvents(this.attachListeners.size() > 0);
		}
	}

	public final void removeDetachListener(ManagerDetachListener paramManagerDetachListener) {
		synchronized (this.detachListeners) {
			this.detachListeners.remove(paramManagerDetachListener);
			this.enableDetachEvents(this.detachListeners.size() > 0);
		}
	}

	private final void setEvents(boolean paramBoolean) {
		this.enableAttachEvents(paramBoolean && this.attachListeners.size() > 0);
		this.enableDetachEvents(paramBoolean && this.detachListeners.size() > 0);
	}
}
