package com.phidget22;

public enum ChannelClass {
	ACCELEROMETER(1) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	BLDC_MOTOR(35) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	CAPACITIVE_TOUCH(14) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	CURRENT_INPUT(2) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	CURRENT_OUTPUT(38) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	DC_MOTOR(4) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	DICTIONARY(36) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	DIGITAL_INPUT(5) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	DIGITAL_OUTPUT(6) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	DISTANCE_SENSOR(7) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	ENCODER(8) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	FREQUENCY_COUNTER(9) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	GPS(10) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	GYROSCOPE(12) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	HUB(13) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	HUMIDITY_SENSOR(15) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	IR(16) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	LCD(11) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	LIGHT_SENSOR(17) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	MAGNETOMETER(18) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	MOTOR_POSITION_CONTROLLER(34) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	PHSENSOR(37) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	POWER_GUARD(20) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	PRESSURE_SENSOR(21) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	RC_SERVO(22) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	RESISTANCE_INPUT(23) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	RFID(24) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	SOUND_SENSOR(25) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	SPATIAL(26) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	STEPPER(27) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	TEMPERATURE_SENSOR(28) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	VOLTAGE_INPUT(29) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	VOLTAGE_OUTPUT(30) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	VOLTAGE_RATIO_INPUT(31) {
		@Override
		public String getMessage() {

			return null;
		}
	};

	public static ChannelClass getEnum(int paramInt) {
		switch (paramInt) {
		case 1:
			return ACCELEROMETER;
		case 2:
			return CURRENT_INPUT;
		case 4:
			return DC_MOTOR;
		case 5:
			return DIGITAL_INPUT;
		case 6:
			return DIGITAL_OUTPUT;
		case 7:
			return DISTANCE_SENSOR;
		case 8:
			return ENCODER;
		case 9:
			return FREQUENCY_COUNTER;
		case 10:
			return GPS;
		case 11:
			return LCD;
		case 12:
			return GYROSCOPE;
		case 13:
			return HUB;
		case 14:
			return CAPACITIVE_TOUCH;
		case 15:
			return HUMIDITY_SENSOR;
		case 16:
			return IR;
		case 17:
			return LIGHT_SENSOR;
		case 18:
			return MAGNETOMETER;
		case 37:
			return PHSENSOR;
		case 20:
			return POWER_GUARD;
		case 21:
			return PRESSURE_SENSOR;
		case 22:
			return RC_SERVO;
		case 23:
			return RESISTANCE_INPUT;
		case 24:
			return RFID;
		case 25:
			return SOUND_SENSOR;
		case 26:
			return SPATIAL;
		case 27:
			return STEPPER;
		case 28:
			return TEMPERATURE_SENSOR;
		case 29:
			return VOLTAGE_INPUT;
		case 30:
			return VOLTAGE_OUTPUT;
		case 31:
			return VOLTAGE_RATIO_INPUT;
		case 34:
			return MOTOR_POSITION_CONTROLLER;
		case 35:
			return BLDC_MOTOR;
		case 36:
			return DICTIONARY;
		case 38:
			return CURRENT_OUTPUT;
		}
		return null;
	}

	private final int code;

	private ChannelClass(int paramInt) {
		this.code = paramInt;
	}

	public int getCode() {
		return this.code;
	}

	public abstract String getMessage();
}
