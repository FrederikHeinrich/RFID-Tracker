package com.phidget22;

public class VoltageRatioInputVoltageRatioChangeEvent {
	VoltageRatioInput Source;

	double VoltageRatio;

	public VoltageRatioInputVoltageRatioChangeEvent(VoltageRatioInput paramVoltageRatioInput, double paramDouble) {
		this.Source = paramVoltageRatioInput;
		this.VoltageRatio = paramDouble;
	}

	public VoltageRatioInput getSource() {
		return this.Source;
	}

	public double getVoltageRatio() {
		return this.VoltageRatio;
	}

	@Override
	public String toString() {
		return "[VoltageRatioInputVoltageRatioChangeEvent](Source: " + this.Source + ", " + "VoltageRatio: "
				+ this.VoltageRatio + ")";
	}
}
