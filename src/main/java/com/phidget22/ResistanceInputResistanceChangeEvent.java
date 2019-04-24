package com.phidget22;

public class ResistanceInputResistanceChangeEvent {

	double Resistance;
	ResistanceInput Source;

	public ResistanceInputResistanceChangeEvent(ResistanceInput paramResistanceInput, double paramDouble) {
		this.Source = paramResistanceInput;
		this.Resistance = paramDouble;
	}

	public double getResistance() {
		return this.Resistance;
	}

	public ResistanceInput getSource() {
		return this.Source;
	}

	@Override
	public String toString() {
		return "[ResistanceInputResistanceChangeEvent](Source: " + this.Source + ", " + "Resistance: " + this.Resistance
				+ ")";
	}
}
