package com.phidget22;

public enum SPLRange {
	DB_102(1) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	DB_82(2) {
		@Override
		public String getMessage() {

			return null;
		}
	};

	public static SPLRange getEnum(int paramInt) {
		switch (paramInt) {
		case 1:
			return DB_102;
		case 2:
			return DB_82;
		}
		return null;
	}

	private final int code;

	private SPLRange(int paramInt) {
		this.code = paramInt;
	}

	public int getCode() {
		return this.code;
	}

	public abstract String getMessage();
}
