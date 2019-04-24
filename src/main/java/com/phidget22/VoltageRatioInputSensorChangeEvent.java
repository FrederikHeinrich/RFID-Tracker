package com.phidget22;

public class VoltageRatioInputSensorChangeEvent {

	UnitInfo SensorUnit;

	double SensorValue;
	VoltageRatioInput Source;

	public VoltageRatioInputSensorChangeEvent(VoltageRatioInput paramVoltageRatioInput, double paramDouble,
			UnitInfo paramUnitInfo) {
		this.Source = paramVoltageRatioInput;
		this.SensorValue = paramDouble;
		this.SensorUnit = paramUnitInfo;
	}

	public UnitInfo getSensorUnit() {
		return this.SensorUnit;
	}

	public double getSensorValue() {
		return this.SensorValue;
	}

	public VoltageRatioInput getSource() {
		return this.Source;
	}

	@Override
	public String toString() {
		return "[VoltageRatioInputSensorChangeEvent](Source: " + this.Source + ", " + "SensorValue: " + this.SensorValue
				+ ", " + "SensorUnit: " + this.SensorUnit + ")";
	}
}
