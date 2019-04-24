package com.phidget22;

public enum RTDWireSetup {
	WIRES_2(1) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	WIRES_3(2) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	WIRES_4(3) {
		@Override
		public String getMessage() {

			return null;
		}
	};

	public static RTDWireSetup getEnum(int paramInt) {
		switch (paramInt) {
		case 1:
			return WIRES_2;
		case 2:
			return WIRES_3;
		case 3:
			return WIRES_4;
		}
		return null;
	}

	private final int code;

	private RTDWireSetup(int paramInt) {
		this.code = paramInt;
	}

	public int getCode() {
		return this.code;
	}

	public abstract String getMessage();
}
