package com.phidget22;

public enum BridgeGain {

	GAIN_128X(8) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	GAIN_16X(5) {
		@Override
		public String getMessage() {

			return null;
		}
	},
	GAIN_1X(1) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	GAIN_2X(2) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	GAIN_32X(6) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	GAIN_4X(3) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	GAIN_64X(7) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	GAIN_8X(4) {
		@Override
		public String getMessage() {

			return null;
		}
	};

	public static BridgeGain getEnum(int paramInt) {
		switch (paramInt) {
		case 1:
			return GAIN_1X;
		case 2:
			return GAIN_2X;
		case 3:
			return GAIN_4X;
		case 4:
			return GAIN_8X;
		case 5:
			return GAIN_16X;
		case 6:
			return GAIN_32X;
		case 7:
			return GAIN_64X;
		case 8:
			return GAIN_128X;
		}
		return null;
	}

	private final int code;

	private BridgeGain(int paramInt) {
		this.code = paramInt;
	}

	public int getCode() {
		return this.code;
	}

	public abstract String getMessage();
}
