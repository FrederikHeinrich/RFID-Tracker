package com.phidget22;

public enum ThermocoupleType {

	E(3) {
		@Override
		public String getMessage() {

			return null;
		}
	},
	J(1) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	K(2) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	T(4) {
		@Override
		public String getMessage() {

			return null;
		}
	};

	public static ThermocoupleType getEnum(int paramInt) {
		switch (paramInt) {
		case 1:
			return J;
		case 2:
			return K;
		case 3:
			return E;
		case 4:
			return T;
		}
		return null;
	}

	private final int code;

	private ThermocoupleType(int paramInt) {
		this.code = paramInt;
	}

	public int getCode() {
		return this.code;
	}

	public abstract String getMessage();
}
