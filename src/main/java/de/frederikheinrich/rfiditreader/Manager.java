package de.frederikheinrich.rfiditreader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import com.andrewthom.microsoft.teams.api.MicrosoftTeams;
import com.andrewthom.microsoft.teams.api.Webhook;

public class Manager {

	public static ArrayList<String> LoggedinIDs = new ArrayList<String>();

	public static void GreenBeep(long time) throws Exception {
		Timer t = new Timer();
		RFIDTracker.GreenOutput.setDutyCycle(RFIDTracker.GreenOutput.getMaxDutyCycle());
		t.schedule(new TimerTask() {

			@Override
			public void run() {
				try {
					RFIDTracker.GreenOutput.setDutyCycle(RFIDTracker.GreenOutput.getMinDutyCycle());
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		}, time);
	}

	private static void RedBeep(long time) throws Exception {
		Timer t = new Timer();
		RFIDTracker.RedOutput.setDutyCycle(RFIDTracker.RedOutput.getMaxDutyCycle());
		t.schedule(new TimerTask() {

			@Override
			public void run() {
				try {
					RFIDTracker.RedOutput.setDutyCycle(RFIDTracker.RedOutput.getMinDutyCycle());
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		}, time);
	}

	@SuppressWarnings("unchecked")
	public static void Trigger(final String ID) throws Exception {
		Config.load("config.json");
		System.out.println("TRIGGER : " + ID);
		if (Config.getInstance().Users.containsKey(ID)) {

			System.out.println("known user");
			HashMap<String, Object> um = new HashMap<String, Object>();
			um.putAll((Map<? extends String, ? extends Object>) Config.getInstance().Users.get(ID));

			String Message;
			if (Manager.LoggedinIDs.contains(ID)) {
				Manager.GreenBeep(300);
				Message = Config.getInstance().QuitMessage.replaceFirst("%Vorname%", (String) um.get("Vorname"))
						.replaceFirst("%Nachname%", (String) um.get("Nachname"));
				Manager.LoggedinIDs.remove(ID);

			} else {
				Manager.GreenBeep(150);
				Thread.sleep(150);
				Manager.GreenBeep(150);
				Message = Config.getInstance().JoinMessage.replaceFirst("%Vorname%", (String) um.get("Vorname"))
						.replaceFirst("%Nachname%", (String) um.get("Nachname"));
				Manager.LoggedinIDs.add(ID);
			}

			String Gruppe = (String) um.get("Gruppe");
			if (!Config.getInstance().Gruppen.containsKey(Gruppe)) {
				Config.getInstance().Gruppen.put(Gruppe, new HashMap<String, Object>());
				Config.getInstance().toFile("config.json");
			}
			final HashMap<String, Object> GruppenMap = new HashMap<String, Object>();
			GruppenMap.putAll((Map<? extends String, ? extends Object>) Config.getInstance().Gruppen.get(Gruppe));
			if (!GruppenMap.containsKey("URL")) {
				GruppenMap.put("URL", "SET ME!");
				Config.getInstance().Gruppen.put(Gruppe, GruppenMap);
				Config.getInstance().toFile("config.json");
			}

			System.out.println(Message);
			MicrosoftTeams.forUrl(new Webhook() {
				public String getUrl() {
					return (String) GruppenMap.get("URL");
				}
			}).sendMessage(Message);

		} else {
			Manager.RedBeep(50);
			Thread.sleep(100);
			Manager.RedBeep(250);
			Thread.sleep(500);
			Manager.RedBeep(50);
			Thread.sleep(100);
			Manager.RedBeep(150);
			Thread.sleep(300);
		}

	}

}
