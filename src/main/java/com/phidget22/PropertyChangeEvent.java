package com.phidget22;

public class PropertyChangeEvent {

	String PropertyName;
	Phidget Source;

	public PropertyChangeEvent(Phidget paramPhidget, String paramString) {
		this.Source = paramPhidget;
		this.PropertyName = paramString;
	}

	public String getPropertyName() {
		return this.PropertyName;
	}

	public Phidget getSource() {
		return this.Source;
	}

	@Override
	public String toString() {
		return "[PropertyChangeEvent](Source: " + this.Source + ", " + "PropertyName: " + this.PropertyName + ")";
	}
}
