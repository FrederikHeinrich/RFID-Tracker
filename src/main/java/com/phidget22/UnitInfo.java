package com.phidget22;

public class UnitInfo {

	public String name;

	public String symbol;
	public Unit unit;

	@Override
	public String toString() {
		return "[UnitInfo](unit: " + this.unit + ", " + "name: " + this.name + ", " + "symbol: " + this.symbol + ")";
	}
}
