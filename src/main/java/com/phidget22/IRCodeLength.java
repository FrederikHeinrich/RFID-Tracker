package com.phidget22;

public enum IRCodeLength {

	CONSTANT(2) {
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
	},

	VARIABLE(3) {
		@Override
		public String getMessage() {

			return null;
		}
	};

	public static IRCodeLength getEnum(int paramInt) {
		switch (paramInt) {
		case 1:
			return UNKNOWN;
		case 2:
			return CONSTANT;
		case 3:
			return VARIABLE;
		}
		return null;
	}

	private final int code;

	private IRCodeLength(int paramInt) {
		this.code = paramInt;
	}

	public int getCode() {
		return this.code;
	}

	public abstract String getMessage();
}
