package com.phidget22;

public enum RFIDProtocol {
	EM4100(1) {
		@Override
		public String getMessage() {
			return null;
		}
	},

	ISO11785_FDX_B(2) {
		@Override
		public String getMessage() {
			return null;
		}
	},

	PHIDGET_TAG(3) {
		@Override
		public String getMessage() {
			return null;
		}
	};

	public static RFIDProtocol getEnum(int paramInt) {
		switch (paramInt) {
		case 1:
			return EM4100;
		case 2:
			return ISO11785_FDX_B;
		case 3:
			return PHIDGET_TAG;
		}
		return null;
	}

	private final int code;

	private RFIDProtocol(int paramInt) {
		this.code = paramInt;
	}

	public int getCode() {
		return this.code;
	}

	public abstract String getMessage();
}
