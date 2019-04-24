package com.phidget22;

public enum VoltageSensorType {

	PN_1114(11140) {
		@Override
		public String getMessage() {
			return null;
		}
	},
	PN_1117(11170) {
		@Override
		public String getMessage() {
			return null;
		}
	},
	PN_1123(11230) {
		@Override
		public String getMessage() {
			return null;
		}
	},
	PN_1127(11270) {
		@Override
		public String getMessage() {
			return null;
		}
	},
	PN_1130_ORP(11302) {
		@Override
		public String getMessage() {
			return null;
		}
	},
	PN_1130_PH(11301) {
		@Override
		public String getMessage() {
			return null;
		}
	},
	PN_1132(11320) {
		@Override
		public String getMessage() {
			return null;
		}
	},
	PN_1133(11330) {
		@Override
		public String getMessage() {
			return null;
		}
	},
	PN_1135(11350) {
		@Override
		public String getMessage() {
			return null;
		}
	},
	PN_1142(11420) {
		@Override
		public String getMessage() {
			return null;
		}
	},
	PN_1143(11430) {
		@Override
		public String getMessage() {
			return null;
		}
	},
	PN_3500(35000) {
		@Override
		public String getMessage() {
			return null;
		}
	},
	PN_3501(35010) {
		@Override
		public String getMessage() {
			return null;
		}
	},
	PN_3502(35020) {
		@Override
		public String getMessage() {
			return null;
		}
	},
	PN_3503(35030) {
		@Override
		public String getMessage() {
			return null;
		}
	},
	PN_3507(35070) {
		@Override
		public String getMessage() {
			return null;
		}
	},
	PN_3508(35080) {
		@Override
		public String getMessage() {
			return null;
		}
	},
	PN_3509(35090) {
		@Override
		public String getMessage() {
			return null;
		}
	},
	PN_3510(35100) {
		@Override
		public String getMessage() {
			return null;
		}
	},
	PN_3511(35110) {
		@Override
		public String getMessage() {
			return null;
		}
	},
	PN_3512(35120) {
		@Override
		public String getMessage() {
			return null;
		}
	},
	PN_3513(35130) {
		@Override
		public String getMessage() {
			return null;
		}
	},
	PN_3514(35140) {
		@Override
		public String getMessage() {
			return null;
		}
	},
	PN_3515(35150) {
		@Override
		public String getMessage() {
			return null;
		}
	},
	PN_3516(35160) {
		@Override
		public String getMessage() {
			return null;
		}
	},
	PN_3517(35170) {
		@Override
		public String getMessage() {
			return null;
		}
	},
	PN_3518(35180) {
		@Override
		public String getMessage() {
			return null;
		}
	},
	PN_3519(35190) {
		@Override
		public String getMessage() {
			return null;
		}
	},
	PN_3584(35840) {
		@Override
		public String getMessage() {
			return null;
		}
	},
	PN_3585(35850) {
		@Override
		public String getMessage() {
			return null;
		}
	},
	PN_3586(35860) {
		@Override
		public String getMessage() {
			return null;
		}
	},
	PN_3587(35870) {
		@Override
		public String getMessage() {
			return null;
		}
	},
	PN_3588(35880) {
		@Override
		public String getMessage() {
			return null;
		}
	},

	PN_3589(35890) {
		@Override
		public String getMessage() {
			return null;
		}
	},
	VOLTAGE(0) {
		@Override
		public String getMessage() {
			return null;
		}
	};

	public static VoltageSensorType getEnum(int paramInt) {
		switch (paramInt) {
		case 0:
			return VOLTAGE;
		case 11140:
			return PN_1114;
		case 11170:
			return PN_1117;
		case 11230:
			return PN_1123;
		case 11270:
			return PN_1127;
		case 11301:
			return PN_1130_PH;
		case 11302:
			return PN_1130_ORP;
		case 11320:
			return PN_1132;
		case 11330:
			return PN_1133;
		case 11350:
			return PN_1135;
		case 11420:
			return PN_1142;
		case 11430:
			return PN_1143;
		case 35000:
			return PN_3500;
		case 35010:
			return PN_3501;
		case 35020:
			return PN_3502;
		case 35030:
			return PN_3503;
		case 35070:
			return PN_3507;
		case 35080:
			return PN_3508;
		case 35090:
			return PN_3509;
		case 35100:
			return PN_3510;
		case 35110:
			return PN_3511;
		case 35120:
			return PN_3512;
		case 35130:
			return PN_3513;
		case 35140:
			return PN_3514;
		case 35150:
			return PN_3515;
		case 35160:
			return PN_3516;
		case 35170:
			return PN_3517;
		case 35180:
			return PN_3518;
		case 35190:
			return PN_3519;
		case 35840:
			return PN_3584;
		case 35850:
			return PN_3585;
		case 35860:
			return PN_3586;
		case 35870:
			return PN_3587;
		case 35880:
			return PN_3588;
		case 35890:
			return PN_3589;
		}
		return null;
	}

	private final int code;

	private VoltageSensorType(int paramInt) {
		this.code = paramInt;
	}

	public int getCode() {
		return this.code;
	}

	public abstract String getMessage();
}
