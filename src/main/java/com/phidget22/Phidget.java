package com.phidget22;

import java.util.Comparator;

public class Phidget extends PhidgetBase implements Comparator<Phidget> {
	private String _phidgetidstr;

	Phidget(long paramLong) {
		super(paramLong);
	}

	public int compare(Phidget paramPhidget1, Phidget paramPhidget2) {
		try {
			if (paramPhidget1.getIsLocal()) {
				if (!paramPhidget2.getIsLocal()) {
					return 1;
				}
			} else if (paramPhidget2.getIsLocal()) {
				return -1;
			}

			int i = paramPhidget1.getDeviceSerialNumber() - paramPhidget2.getDeviceSerialNumber();
			if (i != 0) {
				return i;
			}
			int j = paramPhidget1.getHubPort() - paramPhidget2.getHubPort();
			if (j != 0) {
				return j;
			}

			int k;
			int m;
			if (paramPhidget1.getIsChannel()) {
				if (!paramPhidget2.getIsChannel()) {
					return -1;
				}
				k = paramPhidget1.getChannel() - paramPhidget2.getChannel();
				if (k != 0) {
					return k;
				}
				m = paramPhidget1.getChannelClassName().compareTo(paramPhidget2.getChannelClassName());
				if (m != 0) {
					return m;

				}
			} else {
				if (paramPhidget2.getIsChannel()) {
					return 1;
				}
				k = paramPhidget1.getDeviceClassName().compareTo(paramPhidget2.getDeviceClassName());
				if (k != 0) {
					return k;
				}
				m = paramPhidget1.getDeviceID().ordinal() - paramPhidget2.getDeviceID().ordinal();
				if (m != 0) {
					return m;
				}

				if (paramPhidget1.getIsHubPortDevice()) {
					if (!paramPhidget2.getIsHubPortDevice()) {
						return -1;
					}
				} else if (paramPhidget2.getIsHubPortDevice()) {
					return 1;
				}
			}
		} catch (PhidgetException localPhidgetException) {
			return -1;
		}

		return 0;
	}

	private native void deleteHandle() throws PhidgetException;

	@Override
	public boolean equals(Object paramObject) {
		if (paramObject == null) {
			return false;
		}
		if (!(paramObject instanceof Phidget)) {
			return false;
		}
		return this.hashCode() == paramObject.hashCode();
	}

	@Override
	protected void finalize() throws Throwable {
		try {
			this.deleteHandle();
			this.handle = 0L;
		} finally {
			super.finalize();
		}
	}

	private native String getDescription() throws PhidgetException;

	public String getPhidgetIDString() {
		if (this._phidgetidstr != null) {
			return this._phidgetidstr;
		}
		try {
			StringBuffer localStringBuffer = new StringBuffer();
			if (this.getIsLocal()) {
				localStringBuffer.append('L');
			} else {
				localStringBuffer.append('N');
			}
			if (this.getIsChannel()) {
				localStringBuffer.append('_').append('C').append(this.getChannel());
				localStringBuffer.append('_').append(this.getChannelClass());
			} else {
				localStringBuffer.append('_').append('D').append('_').append(this.getDeviceClass());
				localStringBuffer.append('_').append(this.getDeviceID());
				if (this.getIsHubPortDevice()) {
					localStringBuffer.append('_').append('H');
				}
			}
			localStringBuffer.append('_').append(this.getHubPort());
			localStringBuffer.append('_').append(this.getDeviceSerialNumber());

			this._phidgetidstr = localStringBuffer.toString();
			return this._phidgetidstr;
		} catch (PhidgetException localPhidgetException) {
		}
		return "_invalid_a_phidget_";
	}

	@Override
	public int hashCode() {
		return this.getPhidgetIDString().hashCode();
	}

	@Override
	public String toString() {
		try {
			return this.getDescription();
		} catch (PhidgetException localPhidgetException) {
		}
		return "[" + this.getClass().getName() + "]";
	}
}
