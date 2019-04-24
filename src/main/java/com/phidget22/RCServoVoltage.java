package com.phidget22;

public enum RCServoVoltage {
	VOLTS_5_0(1) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	VOLTS_6_0(2) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	VOLTS_7_4(3) {
		@Override
		public String getMessage() {

			return null;
		}
	};

	public static RCServoVoltage getEnum(int paramInt) {
		switch (paramInt) {
		case 1:
			return VOLTS_5_0;
		case 2:
			return VOLTS_6_0;
		case 3:
			return VOLTS_7_4;
		}
		return null;
	}

	private final int code;

	private RCServoVoltage(int paramInt) {
		this.code = paramInt;
	}

	public int getCode() {
		return this.code;
	}

	public abstract String getMessage();
}
