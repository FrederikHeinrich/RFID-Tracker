package com.phidget22;

public enum ServerType {
	DEVICE_REMOTE(3) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	SBC(7) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	WWWREMOTE(6) {
		@Override
		public String getMessage() {

			return null;
		}
	};

	public static ServerType getEnum(int paramInt) {
		switch (paramInt) {
		case 3:
			return DEVICE_REMOTE;
		case 6:
			return WWWREMOTE;
		case 7:
			return SBC;
		}
		return null;
	}

	private final int code;

	private ServerType(int paramInt) {
		this.code = paramInt;
	}

	public int getCode() {
		return this.code;
	}

	public abstract String getMessage();
}
