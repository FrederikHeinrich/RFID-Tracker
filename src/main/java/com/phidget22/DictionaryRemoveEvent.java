package com.phidget22;

public class DictionaryRemoveEvent {

	String Key;
	Dictionary Source;

	public DictionaryRemoveEvent(Dictionary paramDictionary, String paramString) {
		this.Source = paramDictionary;
		this.Key = paramString;
	}

	public String getKey() {
		return this.Key;
	}

	public Dictionary getSource() {
		return this.Source;
	}

	@Override
	public String toString() {
		return "[DictionaryRemoveEvent](Source: " + this.Source + ", " + "Key: " + this.Key + ")";
	}
}
