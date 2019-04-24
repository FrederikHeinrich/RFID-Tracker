package com.phidget22;

public enum EncoderIOMode {

	LINE_DRIVER_10K(3) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	LINE_DRIVER_2K2(2) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	OPEN_COLLECTOR_10K(5) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	OPEN_COLLECTOR_2K2(4) {
		@Override
		public String getMessage() {

			return null;
		}
	},
	PUSH_PULL(1) {
		@Override
		public String getMessage() {

			return null;
		}
	};

	public static EncoderIOMode getEnum(int paramInt) {
		switch (paramInt) {
		case 1:
			return PUSH_PULL;
		case 2:
			return LINE_DRIVER_2K2;
		case 3:
			return LINE_DRIVER_10K;
		case 4:
			return OPEN_COLLECTOR_2K2;
		case 5:
			return OPEN_COLLECTOR_10K;
		}
		return null;
	}

	private final int code;

	private EncoderIOMode(int paramInt) {
		this.code = paramInt;
	}

	public int getCode() {
		return this.code;
	}

	public abstract String getMessage();
}
