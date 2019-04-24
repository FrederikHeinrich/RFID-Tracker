package de.frederikheinrich.rfiditreader;

import java.util.Date;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import com.andrewthom.microsoft.teams.api.MicrosoftTeams;
import com.andrewthom.microsoft.teams.api.Webhook;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.phidget22.DigitalOutput;
import com.phidget22.PhidgetException;
import com.phidget22.RFID;

import de.frederikheinrich.rfiditreader.listener.MainListener;

public class RFIDTracker {

	public static DigitalOutput GreenOutput;
	public static DigitalOutput RedOutput;

	public static RFID rfid;
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		Timer t = new Timer();
		t.schedule(new TimerTask() {

			@SuppressWarnings("deprecation")
			@Override
			public void run() {
				Date date = new Date(System.currentTimeMillis());
				if (date.getHours() == 1 && !Manager.LoggedinIDs.isEmpty()) {
					String users = "";
					for (String id : Manager.LoggedinIDs) {
						users = Config.getInstance().Users.get(id) + " ";
					}
					try {
						MicrosoftTeams.forUrl(new Webhook() {
							public String getUrl() {
								return Config.getInstance().Info;
							}
						}).sendMessage("Es haben sich: " + users + " nicht ausgelogt");
					} catch (UnirestException e) {
						e.printStackTrace();
					}
					Manager.LoggedinIDs.clear();
				}
			}
		}, 10000, 10000);
		RFIDTracker.rfid = new RFID();
		RFIDTracker.GreenOutput = new DigitalOutput();
		RFIDTracker.RedOutput = new DigitalOutput();
		Config.load("config.json");
		Config.getInstance().toFile("config.json");
		RFIDTracker.GreenOutput.addAttachListener(new MainListener());
		RFIDTracker.GreenOutput.addDetachListener(new MainListener());
		RFIDTracker.RedOutput.addAttachListener(new MainListener());
		RFIDTracker.RedOutput.addDetachListener(new MainListener());
		RFIDTracker.rfid.addAttachListener(new MainListener());
		RFIDTracker.rfid.addDetachListener(new MainListener());
		RFIDTracker.rfid.addErrorListener(new MainListener());
		RFIDTracker.rfid.addTagListener(new MainListener());
		RFIDTracker.rfid.addTagLostListener(new MainListener());

		try {
			RFIDTracker.rfid.setChannel(0);
			RFIDTracker.rfid.open();
			Thread.sleep(100);
			RFIDTracker.GreenOutput.setChannel(0);
			RFIDTracker.GreenOutput.open();
			Thread.sleep(100);
			RFIDTracker.RedOutput.setChannel(1);
			RFIDTracker.RedOutput.open();
			Thread.sleep(100);

		} catch (PhidgetException ex) {
			System.out.println(ex.getDescription());
		}
		while (true) {
		}
	}

}
