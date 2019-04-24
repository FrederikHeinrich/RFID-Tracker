package com.phidget22;

public enum VoltageRatioSensorType {

	 PN_1101_SHARP2D120X(11011) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_1101_SHARP2Y0A02(11013) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_1101_SHARP2Y0A21(11012) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_1102(11020) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_1103(11030) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_1104(11040) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_1105(11050) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_1106(11060) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_1107(11070) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_1108(11080) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_1109(11090) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_1110(11100) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_1111(11110) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_1112(11120) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_1113(11130) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_1115(11150) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_1116(11160) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_1118_AC(11181) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_1118_DC(11182) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_1119_AC(11191) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_1119_DC(11192) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_1120(11200) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_1121(11210) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_1122_AC(11221) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_1122_DC(11222) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_1124(11240) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_1125_HUMIDITY(11251) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_1125_TEMPERATURE(11252) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_1126(11260) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_1128(11280) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_1129(11290) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_1131(11310) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_1134(11340) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_1136(11360) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_1137(11370) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_1138(11380) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_1139(11390) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_1140(11400) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_1141(11410) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_1146(11460) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_3120(31200) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_3121(31210) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_3122(31220) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_3123(31230) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_3130(31300) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_3520(35200) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_3521(35210) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},

	 PN_3522(35220) {
		@Override
		public String getMessage() {
			
			return null;
		}
	},
	 VOLTAGE_RATIO(0) {
		@Override
		public String getMessage() {
			
			return null;
		}
	};

	public static VoltageRatioSensorType getEnum(int paramInt) {
		 switch (paramInt) {
		case 0:
			 return VOLTAGE_RATIO;
		case 11011:
			 return PN_1101_SHARP2D120X;
		case 11012:
			 return PN_1101_SHARP2Y0A21;
		case 11013:
			 return PN_1101_SHARP2Y0A02;
		case 11020:
			 return PN_1102;
		case 11030:
			 return PN_1103;
		case 11040:
			 return PN_1104;
		case 11050:
			return PN_1105;
		case 11060:
			return PN_1106;
		case 11070:
			return PN_1107;
		case 11080:
			return PN_1108;
		case 11090:
			return PN_1109;
		case 11100:
			return PN_1110;
		case 11110:
			return PN_1111;
		case 11120:
			return PN_1112;
		case 11130:
			return PN_1113;
		case 11150:
			return PN_1115;
		case 11160:
			return PN_1116;
		case 11181:
			return PN_1118_AC;
		case 11182:
			return PN_1118_DC;
		case 11191:
			return PN_1119_AC;
		case 11192:
			return PN_1119_DC;
		case 11200:
			return PN_1120;
		case 11210:
			return PN_1121;
		case 11221:
			return PN_1122_AC;
		case 11222:
			return PN_1122_DC;
		case 11240:
			return PN_1124;
		case 11251:
			return PN_1125_HUMIDITY;
		case 11252:
			return PN_1125_TEMPERATURE;
		case 11260:
			return PN_1126;
		case 11280:
			return PN_1128;
		case 11290:
			return PN_1129;
		case 11310:
			return PN_1131;
		case 11340:
			return PN_1134;
		case 11360:
			return PN_1136;
		case 11370:
			return PN_1137;
		case 11380:
			return PN_1138;
		case 11390:
			return PN_1139;
		case 11400:
			return PN_1140;
		case 11410:
			return PN_1141;
		case 11460:
			return PN_1146;
		case 31200:
			return PN_3120;
		case 31210:
			return PN_3121;
		case 31220:
			return PN_3122;
		case 31230:
			return PN_3123;
		case 31300:
			return PN_3130;
		case 35200:
			return PN_3520;
		case 35210:
			return PN_3521;
		case 35220:
			return PN_3522;
		}
		return null;
	}

	private final int code;

	private VoltageRatioSensorType(int paramInt) {
		this.code = paramInt;
	}

	public int getCode() {
		return this.code;
	}

	public abstract String getMessage();
}
