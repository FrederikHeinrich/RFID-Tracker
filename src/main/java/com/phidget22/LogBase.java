package com.phidget22;

public class LogBase {
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

	public static native void addSource(String paramString, LogLevel paramLogLevel) throws PhidgetException;

	public static native void disable() throws PhidgetException;

	public static native void disableRotating() throws PhidgetException;

	public static native void enable(LogLevel paramLogLevel, String paramString) throws PhidgetException;

	public static native void enableRotating() throws PhidgetException;

	public static native LogLevel getLevel() throws PhidgetException;

	public static native LogRotating getRotating() throws PhidgetException;

	public static native LogLevel getSourceLevel(String paramString) throws PhidgetException;

	public static native boolean isRotating() throws PhidgetException;

	public static native void log(LogLevel paramLogLevel, String paramString) throws PhidgetException;

	public static native void log(LogLevel paramLogLevel, String paramString1, String paramString2)
			throws PhidgetException;

	public static native void rotate() throws PhidgetException;

	public static native void setLevel(LogLevel paramLogLevel) throws PhidgetException;

	public static native void setRotating(long paramLong, int paramInt) throws PhidgetException;

	public static native void setSourceLevel(String paramString, LogLevel paramLogLevel) throws PhidgetException;

	public LogBase() throws PhidgetException {
	}

	private final void setEvents(boolean paramBoolean) {
	}
}
