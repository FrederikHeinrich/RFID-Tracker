package com.phidget22;

public enum LCDPixelState {

	INVERT(2) {
		@Override
		public String getMessage() {

			return null;
		}
	},
	OFF(0) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	ON(1) {
		@Override
		public String getMessage() {

			return null;
		}
	};

	public static LCDPixelState getEnum(int paramInt) {
		switch (paramInt) {
		case 0:
			return OFF;
		case 1:
			return ON;
		case 2:
			return INVERT;
		}
		return null;
	}

	private final int code;

	private LCDPixelState(int paramInt) {
		this.code = paramInt;
	}

	public int getCode() {
		return this.code;
	}

	public abstract String getMessage();
}
