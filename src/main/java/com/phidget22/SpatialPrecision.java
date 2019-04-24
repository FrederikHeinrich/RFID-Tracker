package com.phidget22;

public enum SpatialPrecision {

	HIGH(1) {
		@Override
		public String getMessage() {

			return null;
		}
	},
	HYBRID(0) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	LOW(2) {
		@Override
		public String getMessage() {

			return null;
		}
	};

	public static SpatialPrecision getEnum(int paramInt) {
		switch (paramInt) {
		case 0:
			return HYBRID;
		case 1:
			return HIGH;
		case 2:
			return LOW;
		}
		return null;
	}

	private final int code;

	private SpatialPrecision(int paramInt) {
		this.code = paramInt;
	}

	public int getCode() {
		return this.code;
	}

	public abstract String getMessage();
}
