package gungun974.brainless.mixin;

import net.minecraft.core.entity.Mob;
import net.minecraft.core.entity.animal.MobAnimal;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = MobAnimal.class, remap = false)
public class MobAnimalMixin {
	@Inject(method = "updateAI", at = @At("HEAD"), cancellable = true)
	public void stopIA(CallbackInfo ci) {
		Mob mob = (Mob) (Object) this;

		if (mob.nickname.toLowerCase().contains("brain screw")) {
			ci.cancel();
		}
	}
}
