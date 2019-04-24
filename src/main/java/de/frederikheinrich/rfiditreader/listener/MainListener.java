package de.frederikheinrich.rfiditreader.listener;

import com.phidget22.AttachEvent;
import com.phidget22.AttachListener;
import com.phidget22.DetachEvent;
import com.phidget22.DetachListener;
import com.phidget22.DeviceClass;
import com.phidget22.ErrorEvent;
import com.phidget22.ErrorListener;
import com.phidget22.PhidgetException;
import com.phidget22.RFIDProtocol;
import com.phidget22.RFIDTagEvent;
import com.phidget22.RFIDTagListener;
import com.phidget22.RFIDTagLostEvent;
import com.phidget22.RFIDTagLostListener;

import de.frederikheinrich.rfiditreader.Manager;

public class MainListener implements RFIDTagLostListener, RFIDTagListener, ErrorListener, DetachListener, AttachListener {

	public void onAttach(AttachEvent e) {
		System.out.println("----------------------------------------------------------------------------------------");
		try {
			System.out.print("\nAttach Event:");
			int serialNumber = e.getSource().getDeviceSerialNumber();
			String channelClass = e.getSource().getChannelClassName();
			int channel = e.getSource().getChannel();

			DeviceClass deviceClass = e.getSource().getDeviceClass();
			if (deviceClass != DeviceClass.VINT) {
				System.out.print("\n\t-> Channel Class: " + channelClass + "\n\t-> Serial Number: " + serialNumber
						+ "\n\t-> Channel:  " + channel + "\n");
			} else {
				int hubPort = e.getSource().getHubPort();
				System.out.print("\n\t-> Channel Class: " + channelClass + "\n\t-> Serial Number: " + serialNumber
						+ "\n\t-> Hub Port: " + hubPort + "\n\t-> Channel:  " + channel + "\n");
			}

		} catch (PhidgetException ex) {
			ex.printStackTrace();
		}
		System.out.println("----------------------------------------------------------------------------------------");
	}

	public void onDetach(DetachEvent e) {
		System.out.println("----------------------------------------------------------------------------------------");
		try {
			System.out.print("\nDetach Event:");
			int serialNumber = e.getSource().getDeviceSerialNumber();
			String channelClass = e.getSource().getChannelClassName();
			int channel = e.getSource().getChannel();

			DeviceClass deviceClass = e.getSource().getDeviceClass();
			if (deviceClass != DeviceClass.VINT) {
				System.out.print("\n\t-> Channel Class: " + channelClass + "\n\t-> Serial Number: " + serialNumber
						+ "\n\t-> Channel:  " + channel + "\n");
			} else {
				int hubPort = e.getSource().getHubPort();
				System.out.print("\n\t-> Channel Class: " + channelClass + "\n\t-> Serial Number: " + serialNumber
						+ "\n\t-> Hub Port: " + hubPort + "\n\t-> Channel:  " + channel + "\n");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("----------------------------------------------------------------------------------------");
	}

	public void onError(ErrorEvent e) {
		System.out.println("Error: " + e.getDescription());
	}

	public void onTag(RFIDTagEvent e) {
		System.out.println("[Tag Event] -> Tag: " + e.getTag() + " -> Protocol: " + e.getProtocol());
		if (e.getProtocol() == RFIDProtocol.EM4100) {
			try {
				Manager.Trigger(e.getTag());
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	public void onTagLost(RFIDTagLostEvent e) {
		System.out.println("[Tag Lost Event] -> Tag: " + e.getTag() + " -> Protocol: " + e.getProtocol());
	}

}
