package gungun974.brainless.mixin;

import net.minecraft.client.render.entity.MobRenderer;
import net.minecraft.client.render.tessellator.Tessellator;
import net.minecraft.core.entity.Mob;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = MobRenderer.class, remap = false)
public class MobRendererMixin {
	@Inject(method = "renderSpecials", at = @At("HEAD"), cancellable = true)
	public void hideLabel(Tessellator tessellator, Mob entity, double d, double d1, double d2, CallbackInfo ci) {
		if (entity.nickname.toLowerCase().contains("brain screw")) {
			ci.cancel();
		}
	}

}
