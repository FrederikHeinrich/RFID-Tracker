package com.phidget22;

public enum RTDType {
	PT100_3850(1) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	PT100_3920(3) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	PT1000_3850(2) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	PT1000_3920(4) {
		@Override
		public String getMessage() {

			return null;
		}
	};

	public static RTDType getEnum(int paramInt) {
		switch (paramInt) {
		case 1:
			return PT100_3850;
		case 2:
			return PT1000_3850;
		case 3:
			return PT100_3920;
		case 4:
			return PT1000_3920;
		}
		return null;
	}

	private final int code;

	private RTDType(int paramInt) {
		this.code = paramInt;
	}

	public int getCode() {
		return this.code;
	}

	public abstract String getMessage();
}
