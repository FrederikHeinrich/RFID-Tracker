package com.phidget22;

public enum InputMode {
	NPN(1) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	PNP(2) {
		@Override
		public String getMessage() {

			return null;
		}
	};

	public static InputMode getEnum(int paramInt) {
		switch (paramInt) {
		case 1:
			return NPN;
		case 2:
			return PNP;
		}
		return null;
	}

	private final int code;

	private InputMode(int paramInt) {
		this.code = paramInt;
	}

	public int getCode() {
		return this.code;
	}

	public abstract String getMessage();
}
