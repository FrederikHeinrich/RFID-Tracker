package com.phidget22;

public enum ErrorCode {

	ACCESS(7) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	BAD_PASSWORD(37) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	BAD_VERSION(55) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	BROKEN_PIPE(41) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	BUSY(9) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	CLOSED(56) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	CONNECTION_REFUSED(35) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	CONNECTION_RESET(46) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	DUPLICATE(27) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	END_OF_FILE(31) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	EXISTS(10) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	FAILSAFE(59) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	FAULT(8) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	FILE_TOO_BIG(17) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	HOST_UNREACHABLE(48) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	INTERRUPTED(4) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	INVALID(13) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	INVALID_ARGUMENT(21) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	INVALID_PACKET(53) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	IO(5) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	IS_DIRECTORY(12) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	IS_NOT_DIRECTORY(11) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	KEEP_ALIVE(58) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	NAME_RESOLUTION_FAILURE(44) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	NETWORK_UNAVAILABLE(45) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	NO_MEMORY(6) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	NO_SPACE(16) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	NO_SUCH_DEVICE(40) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	NO_SUCH_ENTITY(2) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	NOT_ATTACHED(52) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	NOT_CONFIGURED(57) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	NOT_EMPTY(26) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	NOT_PERMITTED(1) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	READ_ONLY(19) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	READ_ONLY_FILESYSTEM(18) {
		@Override
		public String getMessage() {

			return null;
		}
	},
	SUCCESS(0) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	TIMEOUT(3) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	TOO_BIG(54) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	TOO_MANY_FILES(15) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	TOO_MANY_FILES_SYSTEM(14) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	TRY_AGAIN(22) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	UNEXPECTED(28) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	UNKNOWN_VALUE(51) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	UNSUPPORTED(20) {
		@Override
		public String getMessage() {

			return null;
		}
	},

	WRONG_DEVICE(50) {
		@Override
		public String getMessage() {

			return null;
		}
	};

	public static ErrorCode getEnum(int paramInt) {
		switch (paramInt) {
		case 0:
			return SUCCESS;
		case 1:
			return NOT_PERMITTED;
		case 2:
			return NO_SUCH_ENTITY;
		case 3:
			return TIMEOUT;
		case 58:
			return KEEP_ALIVE;
		case 4:
			return INTERRUPTED;
		case 5:
			return IO;
		case 6:
			return NO_MEMORY;
		case 7:
			return ACCESS;
		case 8:
			return FAULT;
		case 9:
			return BUSY;
		case 10:
			return EXISTS;
		case 11:
			return IS_NOT_DIRECTORY;
		case 12:
			return IS_DIRECTORY;
		case 13:
			return INVALID;
		case 14:
			return TOO_MANY_FILES_SYSTEM;
		case 15:
			return TOO_MANY_FILES;
		case 16:
			return NO_SPACE;
		case 17:
			return FILE_TOO_BIG;
		case 18:
			return READ_ONLY_FILESYSTEM;
		case 19:
			return READ_ONLY;
		case 20:
			return UNSUPPORTED;
		case 21:
			return INVALID_ARGUMENT;
		case 22:
			return TRY_AGAIN;
		case 26:
			return NOT_EMPTY;
		case 28:
			return UNEXPECTED;
		case 27:
			return DUPLICATE;
		case 37:
			return BAD_PASSWORD;
		case 45:
			return NETWORK_UNAVAILABLE;
		case 35:
			return CONNECTION_REFUSED;
		case 46:
			return CONNECTION_RESET;
		case 48:
			return HOST_UNREACHABLE;
		case 40:
			return NO_SUCH_DEVICE;
		case 50:
			return WRONG_DEVICE;
		case 41:
			return BROKEN_PIPE;
		case 44:
			return NAME_RESOLUTION_FAILURE;
		case 51:
			return UNKNOWN_VALUE;
		case 52:
			return NOT_ATTACHED;
		case 53:
			return INVALID_PACKET;
		case 54:
			return TOO_BIG;
		case 55:
			return BAD_VERSION;
		case 56:
			return CLOSED;
		case 57:
			return NOT_CONFIGURED;
		case 31:
			return END_OF_FILE;
		case 59:
			return FAILSAFE;
		}
		return null;
	}

	private final int code;

	private ErrorCode(int paramInt) {
		this.code = paramInt;
	}

	public int getCode() {
		return this.code;
	}

	public abstract String getMessage();
}
