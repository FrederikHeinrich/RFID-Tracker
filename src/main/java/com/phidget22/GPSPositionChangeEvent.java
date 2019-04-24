package com.phidget22;

public class GPSPositionChangeEvent {

	double Altitude;

	double Latitude;

	double Longitude;
	GPS Source;

	public GPSPositionChangeEvent(GPS paramGPS, double paramDouble1, double paramDouble2, double paramDouble3) {
		this.Source = paramGPS;
		this.Latitude = paramDouble1;
		this.Longitude = paramDouble2;
		this.Altitude = paramDouble3;
	}

	public double getAltitude() {
		return this.Altitude;
	}

	public double getLatitude() {
		return this.Latitude;
	}

	public double getLongitude() {
		return this.Longitude;
	}

	public GPS getSource() {
		return this.Source;
	}

	@Override
	public String toString() {
		return "[GPSPositionChangeEvent](Source: " + this.Source + ", " + "Latitude: " + this.Latitude + ", "
				+ "Longitude: " + this.Longitude + ", " + "Altitude: " + this.Altitude + ")";
	}
}
