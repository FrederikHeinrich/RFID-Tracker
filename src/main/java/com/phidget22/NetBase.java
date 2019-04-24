package com.phidget22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NetBase {

	public static final int AUTHREQUIRED = 1;
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

	public static native void addServer(String paramString1, String paramString2, int paramInt1, String paramString3,
			int paramInt2) throws PhidgetException;

	public static native void disableServer(String paramString, int paramInt) throws PhidgetException;

	public static native void disableServerDiscovery(ServerType paramServerType) throws PhidgetException;

	public static native void enableServer(String paramString) throws PhidgetException;

	public static native void enableServerDiscovery(ServerType paramServerType) throws PhidgetException;

	public static native void removeServer(String paramString) throws PhidgetException;

	public static native void setServerPassword(String paramString1, String paramString2) throws PhidgetException;

	private long nativeServerAddedHandler = 0L;
	private long nativeServerRemovedHandler = 0L;

	private List<NetServerAddedListener> serverAddedListeners = new ArrayList<NetServerAddedListener>();

	private List<NetServerRemovedListener> serverRemovedListeners = new ArrayList<NetServerRemovedListener>();

	public NetBase() throws PhidgetException {
	}

	public final void addServerAddedListener(NetServerAddedListener paramNetServerAddedListener) {
		synchronized (this.serverAddedListeners) {
			this.serverAddedListeners.add(paramNetServerAddedListener);
			this.enableServerAddedEvents(true);
		}
	}

	public final void addServerRemovedListener(NetServerRemovedListener paramNetServerRemovedListener) {
		synchronized (this.serverRemovedListeners) {
			this.serverRemovedListeners.add(paramNetServerRemovedListener);
			this.enableServerRemovedEvents(true);
		}
	}

	private native void enableServerAddedEvents(boolean paramBoolean);

	private native void enableServerRemovedEvents(boolean paramBoolean);

	private void fireServerAdded(NetServerAddedEvent paramNetServerAddedEvent) {
		Iterator<NetServerAddedListener> localIterator;
		synchronized (this.serverAddedListeners) {
			for (localIterator = this.serverAddedListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onServerAdded(paramNetServerAddedEvent);
			}
		}
	}

	private void fireServerRemoved(NetServerRemovedEvent paramNetServerRemovedEvent) {
		Iterator<NetServerRemovedListener> localIterator;
		synchronized (this.serverRemovedListeners) {
			for (localIterator = this.serverRemovedListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onServerRemoved(paramNetServerRemovedEvent);
			}
		}
	}

	public final void removeServerAddedListener(NetServerAddedListener paramNetServerAddedListener) {
		synchronized (this.serverAddedListeners) {
			this.serverAddedListeners.remove(paramNetServerAddedListener);
			this.enableServerAddedEvents(this.serverAddedListeners.size() > 0);
		}
	}

	public final void removeServerRemovedListener(NetServerRemovedListener paramNetServerRemovedListener) {
		synchronized (this.serverRemovedListeners) {
			this.serverRemovedListeners.remove(paramNetServerRemovedListener);
			this.enableServerRemovedEvents(this.serverRemovedListeners.size() > 0);
		}
	}

	private final void setEvents(boolean paramBoolean) {
		this.enableServerAddedEvents(paramBoolean && this.serverAddedListeners.size() > 0);
		this.enableServerRemovedEvents(paramBoolean && this.serverRemovedListeners.size() > 0);
	}
}
