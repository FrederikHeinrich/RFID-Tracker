package com.phidget22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IRBase extends Phidget {

	public static final int MAX_CODE_BIT_COUNT = 128;
	public static final int MAX_CODE_STRING_LENGTH = 33;

	public static final int RAW_DATA_LONG_SPACE = -1;

	private static native long create() throws PhidgetException;

	private List<IRCodeListener> codeListeners = new ArrayList<IRCodeListener>();

	private List<IRLearnListener> learnListeners = new ArrayList<IRLearnListener>();
	private long nativeCodeHandler = 0L;
	private long nativeLearnHandler = 0L;
	private long nativeRawDataHandler = 0L;

	private List<IRRawDataListener> rawDataListeners = new ArrayList<IRRawDataListener>();

	public IRBase() throws PhidgetException {
		super(IRBase.create());
	}

	IRBase(long paramLong) {
		super(paramLong);
	}

	public final void addCodeListener(IRCodeListener paramIRCodeListener) {
		synchronized (this.codeListeners) {
			this.codeListeners.add(paramIRCodeListener);
			this.enableCodeEvents(true);
		}
	}

	public final void addLearnListener(IRLearnListener paramIRLearnListener) {
		synchronized (this.learnListeners) {
			this.learnListeners.add(paramIRLearnListener);
			this.enableLearnEvents(true);
		}
	}

	public final void addRawDataListener(IRRawDataListener paramIRRawDataListener) {
		synchronized (this.rawDataListeners) {
			this.rawDataListeners.add(paramIRRawDataListener);
			this.enableRawDataEvents(true);
		}
	}

	private native void enableCodeEvents(boolean paramBoolean);

	private native void enableLearnEvents(boolean paramBoolean);

	private native void enableRawDataEvents(boolean paramBoolean);

	private void fireCode(IRCodeEvent paramIRCodeEvent) {
		Iterator<IRCodeListener> localIterator;
		synchronized (this.codeListeners) {
			for (localIterator = this.codeListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onCode(paramIRCodeEvent);

			}
		}
	}

	private void fireLearn(IRLearnEvent paramIRLearnEvent) {
		Iterator<IRLearnListener> localIterator;
		synchronized (this.learnListeners) {
			for (localIterator = this.learnListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onLearn(paramIRLearnEvent);

			}
		}
	}

	private void fireRawData(IRRawDataEvent paramIRRawDataEvent) {
		Iterator<IRRawDataListener> localIterator;
		synchronized (this.rawDataListeners) {
			for (localIterator = this.rawDataListeners.iterator(); localIterator.hasNext();) {
				localIterator.next().onRawData(paramIRRawDataEvent);
			}
		}
	}

	public native IRCode getLastCode() throws PhidgetException;

	public native IRLearnedCode getLastLearnedCode() throws PhidgetException;

	public final void removeCodeListener(IRCodeListener paramIRCodeListener) {
		synchronized (this.codeListeners) {
			this.codeListeners.remove(paramIRCodeListener);
			this.enableCodeEvents(this.codeListeners.size() > 0);
		}
	}

	public final void removeLearnListener(IRLearnListener paramIRLearnListener) {
		synchronized (this.learnListeners) {
			this.learnListeners.remove(paramIRLearnListener);
			this.enableLearnEvents(this.learnListeners.size() > 0);
		}
	}

	public final void removeRawDataListener(IRRawDataListener paramIRRawDataListener) {
		synchronized (this.rawDataListeners) {
			this.rawDataListeners.remove(paramIRRawDataListener);
			this.enableRawDataEvents(this.rawDataListeners.size() > 0);
		}
	}

	private final void setDeviceEvents(boolean paramBoolean) {
		this.enableCodeEvents(paramBoolean && this.codeListeners.size() > 0);
		this.enableLearnEvents(paramBoolean && this.learnListeners.size() > 0);
		this.enableRawDataEvents(paramBoolean && this.rawDataListeners.size() > 0);
	}

	public native void transmit(String paramString, IRCodeInfo paramIRCodeInfo) throws PhidgetException;

	public native void transmitRaw(int[] paramArrayOfInt, int paramInt1, double paramDouble, int paramInt2)
			throws PhidgetException;

	public native void transmitRepeat() throws PhidgetException;
}
