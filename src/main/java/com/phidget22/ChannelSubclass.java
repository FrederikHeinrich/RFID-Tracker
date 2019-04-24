package com.phidget22;

public enum ChannelSubclass {

	DIGITAL_OUTPUT_DUTY_CYCLE(16) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	DIGITAL_OUTPUT_LEDDRIVER(17) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	ENCODER_MODE_SETTABLE(96) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	LCD_GRAPHIC(80) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	LCD_TEXT(81) {
		@Override
		public String getMessage() {

			return null;
		}
	},
	NONE(1) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	TEMPERATURE_SENSOR_RTD(32) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	TEMPERATURE_SENSOR_THERMOCOUPLE(33) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	VOLTAGE_INPUT_SENSOR_PORT(48) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	VOLTAGE_RATIO_INPUT_BRIDGE(65) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	VOLTAGE_RATIO_INPUT_SENSOR_PORT(64) {
		@Override
		public String getMessage() {

			return null;
		}
	};

	public static ChannelSubclass getEnum(int paramInt) {
		switch (paramInt) {
		case 1:
			return NONE;
		case 16:
			return DIGITAL_OUTPUT_DUTY_CYCLE;
		case 17:
			return DIGITAL_OUTPUT_LEDDRIVER;
		case 32:
			return TEMPERATURE_SENSOR_RTD;
		case 33:
			return TEMPERATURE_SENSOR_THERMOCOUPLE;
		case 48:
			return VOLTAGE_INPUT_SENSOR_PORT;
		case 64:
			return VOLTAGE_RATIO_INPUT_SENSOR_PORT;
		case 65:
			return VOLTAGE_RATIO_INPUT_BRIDGE;
		case 80:
			return LCD_GRAPHIC;
		case 81:
			return LCD_TEXT;
		case 96:
			return ENCODER_MODE_SETTABLE;
		}
		return null;
	}

	private final int code;

	private ChannelSubclass(int paramInt) {
		this.code = paramInt;
	}

	public int getCode() {
		return this.code;
	}

	public abstract String getMessage();
}
