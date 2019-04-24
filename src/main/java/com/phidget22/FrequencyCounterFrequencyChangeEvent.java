package com.phidget22;

public class FrequencyCounterFrequencyChangeEvent {

	double Frequency;
	FrequencyCounter Source;

	public FrequencyCounterFrequencyChangeEvent(FrequencyCounter paramFrequencyCounter, double paramDouble) {
		this.Source = paramFrequencyCounter;
		this.Frequency = paramDouble;
	}

	public double getFrequency() {
		return this.Frequency;
	}

	public FrequencyCounter getSource() {
		return this.Source;
	}

	@Override
	public String toString() {
		return "[FrequencyCounterFrequencyChangeEvent](Source: " + this.Source + ", " + "Frequency: " + this.Frequency
				+ ")";
	}
}
