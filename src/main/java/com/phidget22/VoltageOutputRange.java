package com.phidget22;

public enum VoltageOutputRange {
	VOLTS_10(1) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	VOLTS_5(2) {
		@Override
		public String getMessage() {

			return null;
		}
	};

	public static VoltageOutputRange getEnum(int paramInt) {
		switch (paramInt) {
		case 1:
			return VOLTS_10;
		case 2:
			return VOLTS_5;
		}
		return null;
	}

	private final int code;

	private VoltageOutputRange(int paramInt) {
		this.code = paramInt;
	}

	public int getCode() {
		return this.code;
	}

	public abstract String getMessage();
}
