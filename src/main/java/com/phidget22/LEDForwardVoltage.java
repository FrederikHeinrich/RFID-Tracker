package com.phidget22;

public enum LEDForwardVoltage {
	VOLTS_1_7(1) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	VOLTS_2_75(2) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	VOLTS_3_2(3) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	VOLTS_3_9(4) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	VOLTS_4_0(5) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	VOLTS_4_8(6) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	VOLTS_5_0(7) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	VOLTS_5_6(8) {
		@Override
		public String getMessage() {

			return null;
		}
	};

	public static LEDForwardVoltage getEnum(int paramInt) {
		switch (paramInt) {
		case 1:
			return VOLTS_1_7;
		case 2:
			return VOLTS_2_75;
		case 3:
			return VOLTS_3_2;
		case 4:
			return VOLTS_3_9;
		case 5:
			return VOLTS_4_0;
		case 6:
			return VOLTS_4_8;
		case 7:
			return VOLTS_5_0;
		case 8:
			return VOLTS_5_6;
		}
		return null;
	}

	private final int code;

	private LEDForwardVoltage(int paramInt) {
		this.code = paramInt;
	}

	public int getCode() {
		return this.code;
	}

	public abstract String getMessage();
}
