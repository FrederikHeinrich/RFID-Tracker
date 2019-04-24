package com.phidget22;

public enum DeviceClass {
	ACCELEROMETER(1) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	ADVANCED_SERVO(2) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	ANALOG(3) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	BRIDGE(4) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	DICTIONARY(24) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	ENCODER(5) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	FREQUENCY_COUNTER(6) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	GPS(7) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	HUB(8) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	INTERFACE_KIT(9) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	IR(10) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	LED(11) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	MOTOR_CONTROL(13) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	PH_SENSOR(14) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	RFID(15) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	SERVO(16) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	SPATIAL(17) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	STEPPER(18) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	TEMPERATURE_SENSOR(19) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	TEXT_LCD(20) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	VINT(21) {
		@Override
		public String getMessage() {

			return null;
		}
	};

	public static DeviceClass getEnum(int paramInt) {
		switch (paramInt) {
		case 1:
			return ACCELEROMETER;
		case 2:
			return ADVANCED_SERVO;
		case 3:
			return ANALOG;
		case 4:
			return BRIDGE;
		case 5:
			return ENCODER;
		case 6:
			return FREQUENCY_COUNTER;
		case 7:
			return GPS;
		case 8:
			return HUB;
		case 9:
			return INTERFACE_KIT;
		case 10:
			return IR;
		case 11:
			return LED;
		case 13:
			return MOTOR_CONTROL;
		case 14:
			return PH_SENSOR;
		case 15:
			return RFID;
		case 16:
			return SERVO;
		case 17:
			return SPATIAL;
		case 18:
			return STEPPER;
		case 19:
			return TEMPERATURE_SENSOR;
		case 20:
			return TEXT_LCD;
		case 21:
			return VINT;
		case 24:
			return DICTIONARY;
		}
		return null;
	}

	private final int code;

	private DeviceClass(int paramInt) {
		this.code = paramInt;
	}

	public int getCode() {
		return this.code;
	}

	public abstract String getMessage();
}
