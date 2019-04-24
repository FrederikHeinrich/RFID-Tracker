package com.phidget22;

public enum IRCodeEncoding {

	BI_PHASE(4) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	PULSE(3) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	RC5(5) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	RC6(6) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	SPACE(2) {
		@Override
		public String getMessage() {

			return null;
		}
	},
	UNKNOWN(1) {
		@Override
		public String getMessage() {

			return null;
		}
	};

	public static IRCodeEncoding getEnum(int paramInt) {
		switch (paramInt) {
		case 1:
			return UNKNOWN;
		case 2:
			return SPACE;
		case 3:
			return PULSE;
		case 4:
			return BI_PHASE;
		case 5:
			return RC5;
		case 6:
			return RC6;
		}
		return null;
	}

	private final int code;

	private IRCodeEncoding(int paramInt) {
		this.code = paramInt;
	}

	public int getCode() {
		return this.code;
	}

	public abstract String getMessage();
}
