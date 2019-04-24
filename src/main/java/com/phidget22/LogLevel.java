package com.phidget22;

public enum LogLevel {
	CRITICAL(1) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	DEBUG(5) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	ERROR(2) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	INFO(4) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	VERBOSE(6) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	WARNING(3) {
		@Override
		public String getMessage() {

			return null;
		}
	};

	public static LogLevel getEnum(int paramInt) {
		switch (paramInt) {
		case 1:
			return CRITICAL;
		case 2:
			return ERROR;
		case 3:
			return WARNING;
		case 4:
			return INFO;
		case 5:
			return DEBUG;
		case 6:
			return VERBOSE;
		}
		return null;
	}

	private final int code;

	private LogLevel(int paramInt) {
		this.code = paramInt;
	}

	public int getCode() {
		return this.code;
	}

	public abstract String getMessage();
}
