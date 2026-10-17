package secret.seed.setter.mixin;

import net.minecraft.world.level.levelgen.WorldOptions;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import secret.seed.setter.Main;


@Mixin(WorldOptions.class)
public class WorldOptionsMixin {
	@Overwrite
	public static long randomSeed() {
		return Main.SEED;
	}
}
