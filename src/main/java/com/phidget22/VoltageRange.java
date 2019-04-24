package com.phidget22;

public enum VoltageRange {

	AUTO(11) {
		@Override
		public String getMessage() {

			return null;
		}
	},
	MILLIVOLTS_10(1) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	MILLIVOLTS_1000(6) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	MILLIVOLTS_200(3) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	MILLIVOLTS_312_5(4) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	MILLIVOLTS_40(2) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	MILLIVOLTS_400(5) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	VOLTS_15(9) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	VOLTS_2(7) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	VOLTS_40(10) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	VOLTS_5(8) {
		@Override
		public String getMessage() {

			return null;
		}
	};

	public static VoltageRange getEnum(int paramInt) {
		switch (paramInt) {
		case 1:
			return MILLIVOLTS_10;
		case 2:
			return MILLIVOLTS_40;
		case 3:
			return MILLIVOLTS_200;
		case 4:
			return MILLIVOLTS_312_5;
		case 5:
			return MILLIVOLTS_400;
		case 6:
			return MILLIVOLTS_1000;
		case 7:
			return VOLTS_2;
		case 8:
			return VOLTS_5;
		case 9:
			return VOLTS_15;
		case 10:
			return VOLTS_40;
		case 11:
			return AUTO;
		}
		return null;
	}

	private final int code;

	private VoltageRange(int paramInt) {
		this.code = paramInt;
	}

	public int getCode() {
		return this.code;
	}

	public abstract String getMessage();
}
