package com.phidget22;

public class GPGGA {

	public double altitude;

	public short fixQuality;

	public double heightOfGeoid;

	public double horizontalDilution;
	public double latitude;

	public double longitude;

	public short numSatellites;

	@Override
	public String toString() {
		return "[GPGGA](latitude: " + this.latitude + ", " + "longitude: " + this.longitude + ", " + "fixQuality: "
				+ this.fixQuality + ", " + "numSatellites: " + this.numSatellites + ", " + "horizontalDilution: "
				+ this.horizontalDilution + ", " + "altitude: " + this.altitude + ", " + "heightOfGeoid: "
				+ this.heightOfGeoid + ")";
	}
}
