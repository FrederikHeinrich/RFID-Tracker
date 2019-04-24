package com.phidget22;

import java.util.Arrays;

public class GPGSA {
	public short fixType;
	public double horizDilution;
	public char mode;
	public double posnDilution;
	public short[] satUsed;
	public double vertDilution;

	@Override
	public String toString() {
		return "[GPGSA](mode: " + this.mode + ", " + "fixType: " + this.fixType + ", " + "satUsed: "
				+ Arrays.toString(this.satUsed) + ", " + "posnDilution: " + this.posnDilution + ", " + "horizDilution: "
				+ this.horizDilution + ", " + "vertDilution: " + this.vertDilution + ")";
	}
}
