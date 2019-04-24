package com.phidget22;

public enum Unit {

	AMPERE(10) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	BOOLEAN(1) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	CENTIMETER(5) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	DECIBEL(3) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	DEGREE_CELCIUS(13) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	GAUSS(15) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	GRAM(7) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	KILOGRAM(8) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	KILOPASCAL(11) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	LUX(14) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	METER(6) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	MILLIAMPERE(9) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	MILLIMETER(4) {
		@Override
		public String getMessage() {

			return null;
		}
	},
	NONE(0) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	P_H(16) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	PERCENT(2) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	VOLT(12) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	WATT(17) {
		@Override
		public String getMessage() {

			return null;
		}
	};

	public static Unit getEnum(int paramInt) {
		switch (paramInt) {
		case 0:
			return NONE;
		case 1:
			return BOOLEAN;
		case 2:
			return PERCENT;
		case 3:
			return DECIBEL;
		case 4:
			return MILLIMETER;
		case 5:
			return CENTIMETER;
		case 6:
			return METER;
		case 7:
			return GRAM;
		case 8:
			return KILOGRAM;
		case 9:
			return MILLIAMPERE;
		case 10:
			return AMPERE;
		case 11:
			return KILOPASCAL;
		case 12:
			return VOLT;
		case 13:
			return DEGREE_CELCIUS;
		case 14:
			return LUX;
		case 15:
			return GAUSS;
		case 16:
			return P_H;
		case 17:
			return WATT;
		}
		return null;
	}

	private final int code;

	private Unit(int paramInt) {
		this.code = paramInt;
	}

	public int getCode() {
		return this.code;
	}

	public abstract String getMessage();
}
