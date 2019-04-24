package com.phidget22;

public enum PowerSupply {
	OFF(1) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	VOLTS_12(2) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	VOLTS_24(3) {
		@Override
		public String getMessage() {

			return null;
		}
	};

	public static PowerSupply getEnum(int paramInt) {
		switch (paramInt) {
		case 1:
			return OFF;
		case 2:
			return VOLTS_12;
		case 3:
			return VOLTS_24;
		}
		return null;
	}

	private final int code;

	private PowerSupply(int paramInt) {
		this.code = paramInt;
	}

	public int getCode() {
		return this.code;
	}

	public abstract String getMessage();
}
