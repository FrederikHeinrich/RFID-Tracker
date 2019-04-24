package com.phidget22;

public enum ErrorEventCode {

	BAD_POWER(4104) {
		@Override
		public String getMessage() {

			return null;
		}
	},
	BAD_VERSION(1) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	BUSY(2) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	DISPATCH(4) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	ENERGY_DUMP_CONDITION(4110) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	FAILSAFE_CONDITION(4108) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	FAILURE(5) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	MOTOR_STALL_CONDITION(4111) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	NETWORK(3) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	OUT_OF_RANGE(4103) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	OVER_CURRENT(4102) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	OVER_TEMPERATURE(4101) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	OVER_VOLTAGE(4107) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	OVERRUN(4098) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	PACKET_LOST(4099) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	SATURATION(4105) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	SUCCESS(4096) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	VOLTAGE_ERROR(4109) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	WRAP_AROUND(4100) {
		@Override
		public String getMessage() {

			return null;
		}
	};

	public static ErrorEventCode getEnum(int paramInt) {
		switch (paramInt) {
		case 1:
			return BAD_VERSION;
		case 2:
			return BUSY;
		case 3:
			return NETWORK;
		case 4:
			return DISPATCH;
		case 5:
			return FAILURE;
		case 4096:
			return SUCCESS;
		case 4098:
			return OVERRUN;
		case 4099:
			return PACKET_LOST;
		case 4100:
			return WRAP_AROUND;
		case 4101:
			return OVER_TEMPERATURE;
		case 4102:
			return OVER_CURRENT;
		case 4103:
			return OUT_OF_RANGE;
		case 4104:
			return BAD_POWER;
		case 4105:
			return SATURATION;
		case 4107:
			return OVER_VOLTAGE;
		case 4108:
			return FAILSAFE_CONDITION;
		case 4109:
			return VOLTAGE_ERROR;
		case 4110:
			return ENERGY_DUMP_CONDITION;
		case 4111:
			return MOTOR_STALL_CONDITION;
		}
		return null;
	}

	private final int code;

	private ErrorEventCode(int paramInt) {
		this.code = paramInt;
	}

	public int getCode() {
		return this.code;
	}

	public abstract String getMessage();
}
