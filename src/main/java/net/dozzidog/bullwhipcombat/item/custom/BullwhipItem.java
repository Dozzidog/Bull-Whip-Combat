package net.dozzidog.bullwhipcombat.item.custom;

import net.dozzidog.bullwhipcombat.item.client.BullwhipRender;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.util.RenderUtils;

import java.util.function.Consumer;

public class BullwhipItem extends Item implements GeoItem {
    private AnimatableInstanceCache cach = new SingletonAnimatableInstanceCache(this);

    public BullwhipItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {

    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return null;
    }

    @Override
    public double getTick(Object itemStack) {
        return RenderUtils.getCurrentTick();
    }

    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {
            private BullwhipRender render;

            @Override
            public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                if(this.render == null) {
                    render = new BullwhipRender();
                }
                return this.render;
            }
        });
    }
}
