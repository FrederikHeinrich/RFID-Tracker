package com.phidget22;

public class Dictionary extends DictionaryBase {
	public Dictionary() throws PhidgetException {
	}

	Dictionary(long paramLong) throws PhidgetException {
		super(paramLong);
	}

	public String get(String paramString1, String paramString2) throws PhidgetException {
		String str = this.get(paramString1);
		if (str == null) {
			return paramString2;
		}
		return str;
	}

	public String[] scan(String paramString) throws PhidgetException {
		if (paramString == null) {
			paramString = "";
		}
		String[] arrayOfString = this.sscan(paramString).split("\\n");
		if (arrayOfString.length == 1 && arrayOfString[0].length() == 0) {
			return new String[0];
		}
		return arrayOfString;
	}
}
