package com.phidget22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PhidgetBase {

	public static final int ANY_CHANNEL = -1;

	public static final int ANY_HUB_PORT = -1;

	public static final String ANY_LABEL = null;

	public static final int ANY_SERIAL_NUMBER = -1;
	public static final int DEFAULT_TIMEOUT = 500;
	public static final int INFINITE_TIMEOUT = 0;

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

	public static native void finalize(int paramInt) throws PhidgetException;

	public static native String getLibraryVersion() throws PhidgetException;

	public static native void resetLibrary() throws PhidgetException;

	private List<AttachListener> attachListeners = new ArrayList<AttachListener>();

	private List<DetachListener> detachListeners = new ArrayList<DetachListener>();

	private List<ErrorListener> errorListeners = new ArrayList<ErrorListener>();
	long handle;
	private long nativeAttachHandler = 0L;
	private long nativeDetachHandler = 0L;
	private long nativeErrorHandler = 0L;
	private long nativePropertyChangeHandler = 0L;

	private List<PropertyChangeListener> propertyChangeListeners = new ArrayList<PropertyChangeListener>();

	public PhidgetBase() throws PhidgetException {
	}

	PhidgetBase(long paramLong) {
		this.handle = paramLong;
	}

	public final void addAttachListener(AttachListener paramAttachListener) {
		synchronized (this.attachListeners) {
			this.attachListeners.add(paramAttachListener);
			this.enableAttachEvents(true);
		}
	}

	public final void addDetachListener(DetachListener paramDetachListener) {
		synchronized (this.detachListeners) {
			this.detachListeners.add(paramDetachListener);
			this.enableDetachEvents(true);
		}
	}

	public final void addErrorListener(ErrorListener paramErrorListener) {
		synchronized (this.errorListeners) {
			this.errorListeners.add(paramErrorListener);
			this.enableErrorEvents(true);
		}
	}

	public final void addPropertyChangeListener(PropertyChangeListener paramPropertyChangeListener) {
		synchronized (this.propertyChangeListeners) {
			this.propertyChangeListeners.add(paramPropertyChangeListener);
			this.enablePropertyChangeEvents(true);
		}
	}

	public native void close() throws PhidgetException;

	private native void enableAttachEvents(boolean paramBoolean);

	private native void enableDetachEvents(boolean paramBoolean);

	private native void enableErrorEvents(boolean paramBoolean);

	private native void enablePropertyChangeEvents(boolean paramBoolean);

	private void fireAttach(AttachEvent paramAttachEvent) {
		Iterator<AttachListener> localIterator;
		synchronized (this.attachListeners) {
			for (localIterator = this.attachListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onAttach(paramAttachEvent);
			}
		}
	}

	private void fireDetach(DetachEvent paramDetachEvent) {
		Iterator<DetachListener> localIterator;
		synchronized (this.detachListeners) {
			for (localIterator = this.detachListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onDetach(paramDetachEvent);
			}
		}
	}

	private void fireError(ErrorEvent paramErrorEvent) {
		Iterator<ErrorListener> localIterator;
		synchronized (this.errorListeners) {
			for (localIterator = this.errorListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onError(paramErrorEvent);
			}
		}
	}

	private void firePropertyChange(PropertyChangeEvent paramPropertyChangeEvent) {
		Iterator<PropertyChangeListener> localIterator;
		synchronized (this.propertyChangeListeners) {
			for (localIterator = this.propertyChangeListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onPropertyChange(paramPropertyChangeEvent);
			}
		}
	}

	public native boolean getAttached() throws PhidgetException;

	public native int getChannel() throws PhidgetException;

	public native ChannelClass getChannelClass() throws PhidgetException;

	public native String getChannelClassName() throws PhidgetException;

	public native String getChannelName() throws PhidgetException;

	public native ChannelSubclass getChannelSubclass() throws PhidgetException;

	public native int getDeviceChannelCount(ChannelClass paramChannelClass) throws PhidgetException;

	public native DeviceClass getDeviceClass() throws PhidgetException;

	public native String getDeviceClassName() throws PhidgetException;

	public native DeviceID getDeviceID() throws PhidgetException;

	public native String getDeviceLabel() throws PhidgetException;

	public native String getDeviceName() throws PhidgetException;

	public native int getDeviceSerialNumber() throws PhidgetException;

	public native String getDeviceSKU() throws PhidgetException;

	public native int getDeviceVersion() throws PhidgetException;

	public native Phidget getHub() throws PhidgetException;

	public native int getHubPort() throws PhidgetException;

	public native int getHubPortCount() throws PhidgetException;

	public native boolean getIsChannel() throws PhidgetException;

	public native boolean getIsHubPortDevice() throws PhidgetException;

	public native boolean getIsLocal() throws PhidgetException;

	public native boolean getIsRemote() throws PhidgetException;

	public native Phidget getParent() throws PhidgetException;

	public native String getServerHostname() throws PhidgetException;

	public native String getServerName() throws PhidgetException;

	public native String getServerPeerName() throws PhidgetException;

	public native String getServerUniqueName() throws PhidgetException;

	public native void open() throws PhidgetException;

	public native void open(int paramInt) throws PhidgetException;

	public final void removeAttachListener(AttachListener paramAttachListener) {
		synchronized (this.attachListeners) {
			this.attachListeners.remove(paramAttachListener);
			this.enableAttachEvents(this.attachListeners.size() > 0);
		}
	}

	public final void removeDetachListener(DetachListener paramDetachListener) {
		synchronized (this.detachListeners) {
			this.detachListeners.remove(paramDetachListener);
			this.enableDetachEvents(this.detachListeners.size() > 0);
		}
	}

	public final void removeErrorListener(ErrorListener paramErrorListener) {
		synchronized (this.errorListeners) {
			this.errorListeners.remove(paramErrorListener);
			this.enableErrorEvents(this.errorListeners.size() > 0);
		}
	}

	public final void removePropertyChangeListener(PropertyChangeListener paramPropertyChangeListener) {
		synchronized (this.propertyChangeListeners) {
			this.propertyChangeListeners.remove(paramPropertyChangeListener);
			this.enablePropertyChangeEvents(this.propertyChangeListeners.size() > 0);
		}
	}

	public native void setChannel(int paramInt) throws PhidgetException;

	public native void setDeviceLabel(String paramString) throws PhidgetException;

	public native void setDeviceSerialNumber(int paramInt) throws PhidgetException;

	private final void setEvents(boolean paramBoolean) {
		this.enableAttachEvents(paramBoolean && this.attachListeners.size() > 0);
		this.enableDetachEvents(paramBoolean && this.detachListeners.size() > 0);
		this.enableErrorEvents(paramBoolean && this.errorListeners.size() > 0);
		this.enablePropertyChangeEvents(paramBoolean && this.propertyChangeListeners.size() > 0);
	}

	public native void setHubPort(int paramInt) throws PhidgetException;

	public native void setIsHubPortDevice(boolean paramBoolean) throws PhidgetException;

	public native void setIsLocal(boolean paramBoolean) throws PhidgetException;

	public native void setIsRemote(boolean paramBoolean) throws PhidgetException;

	public native void setServerName(String paramString) throws PhidgetException;

	public native void writeDeviceLabel(String paramString) throws PhidgetException;
}
