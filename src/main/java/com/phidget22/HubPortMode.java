package com.phidget22;

public enum HubPortMode {

	DIGITAL_INPUT(1) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	DIGITAL_OUTPUT(2) {
		@Override
		public String getMessage() {

			return null;
		}
	},
	VINT(0) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	VOLTAGE_INPUT(3) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	VOLTAGE_RATIO_INPUT(4) {
		@Override
		public String getMessage() {

			return null;
		}
	};

	public static HubPortMode getEnum(int paramInt) {
		switch (paramInt) {
		case 0:
			return VINT;
		case 1:
			return DIGITAL_INPUT;
		case 2:
			return DIGITAL_OUTPUT;
		case 3:
			return VOLTAGE_INPUT;
		case 4:
			return VOLTAGE_RATIO_INPUT;
		}
		return null;
	}

	private final int code;

	private HubPortMode(int paramInt) {
		this.code = paramInt;
	}

	public int getCode() {
		return this.code;
	}

	public abstract String getMessage();
}
