package net.dozzidog.bullwhipcombat.item.client;

import net.dozzidog.bullwhipcombat.BullWhipCombat;
import net.dozzidog.bullwhipcombat.item.custom.BullwhipItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BullwhipModel extends GeoModel<BullwhipItem> {
    @Override
    public ResourceLocation getModelResource(BullwhipItem bullwhipItem) {
        return new ResourceLocation(BullWhipCombat.MOD_ID, "geo/bullwhip_3d.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BullwhipItem bullwhipItem) {
        return new ResourceLocation(BullWhipCombat.MOD_ID, "textures/item/bullwhip_texture_3d.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BullwhipItem bullwhipItem) {
        return null;
    }
}
