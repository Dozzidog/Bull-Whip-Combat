package net.dozzidog.bullwhipcombat.item.client;

import net.dozzidog.bullwhipcombat.BullWhipCombat;
import net.dozzidog.bullwhipcombat.item.client.BullwhipRender;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;
import software.bernie.geckolib.GeckoLib;


public class BullwhipRender extends GeoItemRenderer<BullwhipRender> {
    public BullwhipRender() {
        super(new DefaultedItemGeoModel<>(new ResourceLocation(BullWhipCombat.MOD_ID, "bullwhip")));
    }
}
