package com.phidget22;

public enum FanMode {

	AUTO(3) {
		@Override
		public String getMessage() {

			return null;
		}
	},
	OFF(1) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	ON(2) {
		@Override
		public String getMessage() {

			return null;
		}
	};

	public static FanMode getEnum(int paramInt) {
		switch (paramInt) {
		case 1:
			return OFF;
		case 2:
			return ON;
		case 3:
			return AUTO;
		}
		return null;
	}

	private final int code;

	private FanMode(int paramInt) {
		this.code = paramInt;
	}

	public int getCode() {
		return this.code;
	}

	public abstract String getMessage();
}
