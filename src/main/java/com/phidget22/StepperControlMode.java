package com.phidget22;

public enum StepperControlMode {

	RUN(1) {
		@Override
		public String getMessage() {

			return null;
		}
	},
	STEP(0) {
		@Override
		public String getMessage() {

			return null;
		}
	};

	public static StepperControlMode getEnum(int paramInt) {
		switch (paramInt) {
		case 0:
			return STEP;
		case 1:
			return RUN;
		}
		return null;
	}

	private final int code;

	private StepperControlMode(int paramInt) {
		this.code = paramInt;
	}

	public int getCode() {
		return this.code;
	}

	public abstract String getMessage();
}
