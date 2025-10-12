package secret.seed.setter.mixin;

import net.minecraft.world.gen.GeneratorOptions;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import secret.seed.setter.Main;


@Mixin(GeneratorOptions.class)
public class GeneratorOptionsMixin {
	@Overwrite
	public static long getRandomSeed() {
		return Main.SEED;
	}
}
