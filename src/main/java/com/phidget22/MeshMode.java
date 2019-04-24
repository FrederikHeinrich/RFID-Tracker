package com.phidget22;

public enum MeshMode {
	ROUTER(1) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	SLEEPY_END_DEVICE(2) {
		@Override
		public String getMessage() {

			return null;
		}
	};

	public static MeshMode getEnum(int paramInt) {
		switch (paramInt) {
		case 1:
			return ROUTER;
		case 2:
			return SLEEPY_END_DEVICE;
		}
		return null;
	}

	private final int code;

	private MeshMode(int paramInt) {
		this.code = paramInt;
	}

	public int getCode() {
		return this.code;
	}

	public abstract String getMessage();
}
