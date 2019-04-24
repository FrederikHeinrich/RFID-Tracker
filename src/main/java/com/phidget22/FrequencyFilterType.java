package com.phidget22;

public enum FrequencyFilterType {

	LOGIC_LEVEL(2) {
		@Override
		public String getMessage() {

			return null;
		}
	},
	ZERO_CROSSING(1) {
		@Override
		public String getMessage() {

			return null;
		}
	};

	public static FrequencyFilterType getEnum(int paramInt) {
		switch (paramInt) {
		case 1:
			return ZERO_CROSSING;
		case 2:
			return LOGIC_LEVEL;
		}
		return null;
	}

	private final int code;

	private FrequencyFilterType(int paramInt) {
		this.code = paramInt;
	}

	public int getCode() {
		return this.code;
	}

	public abstract String getMessage();
}
