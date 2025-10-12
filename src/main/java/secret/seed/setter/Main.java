package secret.seed.setter;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.loader.api.FabricLoader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main implements ClientModInitializer {
	public static long SEED = 0;
	@Override
	public void onInitializeClient() {
		Path configFile = FabricLoader.getInstance().getConfigDir().resolve("customseed.txt");
		try {
			String seedString = Files.readString(configFile).trim();
			SEED = Long.parseLong(seedString);
		} catch (IOException e) {
			throw new RuntimeException("Failed to read .minecraft/config/customseed.txt", e);
		} catch (NumberFormatException e) {
			throw new RuntimeException("Invalid seed value in .minecraft/config/customseed.txt", e);
		}
	}
}