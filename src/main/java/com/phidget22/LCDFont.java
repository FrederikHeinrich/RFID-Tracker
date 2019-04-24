package com.phidget22;

public enum LCDFont {

	DIMENSIONS_5X8(4) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	DIMENSIONS_6X10(3) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	DIMENSIONS_6X12(5) {
		@Override
		public String getMessage() {

			return null;
		}
	},
	USER1(1) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	USER2(2) {
		@Override
		public String getMessage() {

			return null;
		}
	};

	public static LCDFont getEnum(int paramInt) {
		switch (paramInt) {
		case 1:
			return USER1;
		case 2:
			return USER2;
		case 3:
			return DIMENSIONS_6X10;
		case 4:
			return DIMENSIONS_5X8;
		case 5:
			return DIMENSIONS_6X12;
		}
		return null;
	}

	private final int code;

	private LCDFont(int paramInt) {
		this.code = paramInt;
	}

	public int getCode() {
		return this.code;
	}

	public abstract String getMessage();
}
