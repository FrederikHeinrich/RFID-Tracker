package com.phidget22;

public class VoltageInputVoltageChangeEvent {
	VoltageInput Source;

	double Voltage;

	public VoltageInputVoltageChangeEvent(VoltageInput paramVoltageInput, double paramDouble) {
		this.Source = paramVoltageInput;
		this.Voltage = paramDouble;
	}

	public VoltageInput getSource() {
		return this.Source;
	}

	public double getVoltage() {
		return this.Voltage;
	}

	@Override
	public String toString() {
		return "[VoltageInputVoltageChangeEvent](Source: " + this.Source + ", " + "Voltage: " + this.Voltage + ")";
	}
}
