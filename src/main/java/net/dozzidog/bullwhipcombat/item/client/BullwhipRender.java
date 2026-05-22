package net.dozzidog.bullwhipcombat.item.client;

import net.dozzidog.bullwhipcombat.item.custom.BullwhipItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class BullwhipRender extends GeoItemRenderer<BullwhipItem> {
    public BullwhipRender() {
        super(new BullwhipModel());
    }
}
