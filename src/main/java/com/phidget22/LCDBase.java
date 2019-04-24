package com.phidget22;

public class LCDBase extends Phidget {

	private static native long create() throws PhidgetException;

	public LCDBase() throws PhidgetException {
		super(LCDBase.create());
	}

	LCDBase(long paramLong) {
		super(paramLong);
	}

	public native void clear() throws PhidgetException;

	public native void clear(AsyncListener paramAsyncListener);

	public native void copy(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6,
			int paramInt7, int paramInt8, boolean paramBoolean) throws PhidgetException;

	public native void copy(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6,
			int paramInt7, int paramInt8, boolean paramBoolean, AsyncListener paramAsyncListener);

	public native void drawLine(int paramInt1, int paramInt2, int paramInt3, int paramInt4) throws PhidgetException;

	public native void drawLine(int paramInt1, int paramInt2, int paramInt3, int paramInt4,
			AsyncListener paramAsyncListener);

	public native void drawPixel(int paramInt1, int paramInt2, LCDPixelState paramLCDPixelState)
			throws PhidgetException;

	public native void drawPixel(int paramInt1, int paramInt2, LCDPixelState paramLCDPixelState,
			AsyncListener paramAsyncListener);

	public native void drawRect(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean1,
			boolean paramBoolean2) throws PhidgetException;

	public native void drawRect(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean1,
			boolean paramBoolean2, AsyncListener paramAsyncListener);

	public native void flush() throws PhidgetException;

	public native void flush(AsyncListener paramAsyncListener);

	public native double getBacklight() throws PhidgetException;

	public native double getContrast() throws PhidgetException;

	public native boolean getCursorBlink() throws PhidgetException;

	public native boolean getCursorOn() throws PhidgetException;

	public native int getFrameBuffer() throws PhidgetException;

	public native int getHeight() throws PhidgetException;

	public native double getMaxBacklight() throws PhidgetException;

	public native int getMaxCharacters(LCDFont paramLCDFont) throws PhidgetException;

	public native double getMaxContrast() throws PhidgetException;

	public native double getMinBacklight() throws PhidgetException;

	public native double getMinContrast() throws PhidgetException;

	public native LCDScreenSize getScreenSize() throws PhidgetException;

	public native boolean getSleeping() throws PhidgetException;

	public native int getWidth() throws PhidgetException;

	public native void initialize() throws PhidgetException;

	public native void saveFrameBuffer(int paramInt) throws PhidgetException;

	public native void saveFrameBuffer(int paramInt, AsyncListener paramAsyncListener);

	public native void setBacklight(double paramDouble) throws PhidgetException;

	public native void setCharacterBitmap(LCDFont paramLCDFont, String paramString, byte[] paramArrayOfByte)
			throws PhidgetException;

	public native void setCharacterBitmap(LCDFont paramLCDFont, String paramString, byte[] paramArrayOfByte,
			AsyncListener paramAsyncListener);

	public native void setContrast(double paramDouble) throws PhidgetException;

	public native void setCursorBlink(boolean paramBoolean) throws PhidgetException;

	public native void setCursorOn(boolean paramBoolean) throws PhidgetException;

	private final void setDeviceEvents(boolean paramBoolean) {
	}

	public native void setFontSize(LCDFont paramLCDFont, int paramInt1, int paramInt2) throws PhidgetException;

	public native void setFrameBuffer(int paramInt) throws PhidgetException;

	public native void setFrameBuffer(int paramInt, AsyncListener paramAsyncListener);

	public native void setScreenSize(LCDScreenSize paramLCDScreenSize) throws PhidgetException;

	public native void setSleeping(boolean paramBoolean) throws PhidgetException;

	public native void writeBitmap(int paramInt1, int paramInt2, int paramInt3, int paramInt4, byte[] paramArrayOfByte)
			throws PhidgetException;

	public native void writeBitmap(int paramInt1, int paramInt2, int paramInt3, int paramInt4, byte[] paramArrayOfByte,
			AsyncListener paramAsyncListener);

	public native void writeText(LCDFont paramLCDFont, int paramInt1, int paramInt2, String paramString)
			throws PhidgetException;

	public native void writeText(LCDFont paramLCDFont, int paramInt1, int paramInt2, String paramString,
			AsyncListener paramAsyncListener);
}
