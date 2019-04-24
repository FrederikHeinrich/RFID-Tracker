package com.phidget22;

public class VoltageInputSensorChangeEvent {

	UnitInfo SensorUnit;

	double SensorValue;
	VoltageInput Source;

	public VoltageInputSensorChangeEvent(VoltageInput paramVoltageInput, double paramDouble, UnitInfo paramUnitInfo) {
		this.Source = paramVoltageInput;
		this.SensorValue = paramDouble;
		this.SensorUnit = paramUnitInfo;
	}

	public UnitInfo getSensorUnit() {
		return this.SensorUnit;
	}

	public double getSensorValue() {
		return this.SensorValue;
	}

	public VoltageInput getSource() {
		return this.Source;
	}

	@Override
	public String toString() {
		return "[VoltageInputSensorChangeEvent](Source: " + this.Source + ", " + "SensorValue: " + this.SensorValue
				+ ", " + "SensorUnit: " + this.SensorUnit + ")";
	}
}
