package com.phidget22;

public class DictionaryAddEvent {

	String Key;
	Dictionary Source;

	String Value;

	public DictionaryAddEvent(Dictionary paramDictionary, String paramString1, String paramString2) {
		this.Source = paramDictionary;
		this.Key = paramString1;
		this.Value = paramString2;
	}

	public String getKey() {
		return this.Key;
	}

	public Dictionary getSource() {
		return this.Source;
	}

	public String getValue() {
		return this.Value;
	}

	@Override
	public String toString() {
		return "[DictionaryAddEvent](Source: " + this.Source + ", " + "Key: " + this.Key + ", " + "Value: " + this.Value
				+ ")";
	}
}
