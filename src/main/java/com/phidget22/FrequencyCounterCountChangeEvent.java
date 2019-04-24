package com.phidget22;

public class FrequencyCounterCountChangeEvent {

	long Counts;
	FrequencyCounter Source;

	double TimeChange;

	public FrequencyCounterCountChangeEvent(FrequencyCounter paramFrequencyCounter, long paramLong,
			double paramDouble) {
		this.Source = paramFrequencyCounter;
		this.Counts = paramLong;
		this.TimeChange = paramDouble;
	}

	public long getCounts() {
		return this.Counts;
	}

	public FrequencyCounter getSource() {
		return this.Source;
	}

	public double getTimeChange() {
		return this.TimeChange;
	}

	@Override
	public String toString() {
		return "[FrequencyCounterCountChangeEvent](Source: " + this.Source + ", " + "Counts: " + this.Counts + ", "
				+ "TimeChange: " + this.TimeChange + ")";
	}
}
