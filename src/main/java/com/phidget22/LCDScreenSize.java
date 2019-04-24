package com.phidget22;

public enum LCDScreenSize {

	DIMENSIONS_1X16(4) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	DIMENSIONS_1X40(10) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	DIMENSIONS_1X8(2) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	DIMENSIONS_2X16(5) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	DIMENSIONS_2X20(7) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	DIMENSIONS_2X24(9) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	DIMENSIONS_2X40(11) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	DIMENSIONS_2X8(3) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	DIMENSIONS_4X16(6) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	DIMENSIONS_4X20(8) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	DIMENSIONS_4X40(12) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	DIMENSIONS_64X128(13) {
		@Override
		public String getMessage() {

			return null;
		}
	},
	NO_SCREEN(1) {
		@Override
		public String getMessage() {

			return null;
		}
	};

	public static LCDScreenSize getEnum(int paramInt) {
		switch (paramInt) {
		case 1:
			return NO_SCREEN;
		case 2:
			return DIMENSIONS_1X8;
		case 3:
			return DIMENSIONS_2X8;
		case 4:
			return DIMENSIONS_1X16;
		case 5:
			return DIMENSIONS_2X16;
		case 6:
			return DIMENSIONS_4X16;
		case 7:
			return DIMENSIONS_2X20;
		case 8:
			return DIMENSIONS_4X20;
		case 9:
			return DIMENSIONS_2X24;
		case 10:
			return DIMENSIONS_1X40;
		case 11:
			return DIMENSIONS_2X40;
		case 12:
			return DIMENSIONS_4X40;
		case 13:
			return DIMENSIONS_64X128;
		}
		return null;
	}

	private final int code;

	private LCDScreenSize(int paramInt) {
		this.code = paramInt;
	}

	public int getCode() {
		return this.code;
	}

	public abstract String getMessage();
}
