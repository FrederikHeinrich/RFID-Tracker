package de.frederikheinrich.rfiditreader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Config {

	private static Config instance;

	private static Config fromDefaults() {
		final Config config = new Config();
		return config;
	}

	private static Config fromFile(File configFile) {
		try {
			final Gson gson = new GsonBuilder().setPrettyPrinting().create();
			final BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(configFile)));
			return gson.fromJson(reader, Config.class);
		} catch (final FileNotFoundException e) {
			return null;
		}
	}

	public static Config getInstance() {
		if (Config.instance == null) {
			Config.instance = Config.fromDefaults();
		}
		return Config.instance;
	}

	public static void load(File file) {
		Config.instance = Config.fromFile(file);

		if (Config.instance == null) {
			Config.instance = Config.fromDefaults();
		}
	}

	public static void load(String file) {
		Config.load(new File(file));
	}

	public HashMap<String, Object> Gruppen = new HashMap<String, Object>();
	public String Info = "";
	public String JoinMessage = "";
	public String QuitMessage = "";
	public HashMap<String, Object> Users = new HashMap<String, Object>();

	public Config() {
		this.Users = new HashMap<String, Object>();
		this.Gruppen = new HashMap<String, Object>();
		this.Info = "";
		this.JoinMessage = "%Vorname% %Nachname% ist nun anwesend!";
		this.QuitMessage = "%Vorname% %Nachname% ist nun nicht mehr anwesend!";

	}

	public void toFile(File file) {
		final Gson gson = new GsonBuilder().setPrettyPrinting().create();
		final String jsonConfig = gson.toJson(this);
		FileWriter writer;
		try {
			writer = new FileWriter(file);
			writer.write(jsonConfig);
			writer.flush();
			writer.close();
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	public void toFile(String file) {
		this.toFile(new File(file));
	}

	@Override
	public String toString() {
		final Gson gson = new GsonBuilder().setPrettyPrinting().create();
		return gson.toJson(this);
	}
}