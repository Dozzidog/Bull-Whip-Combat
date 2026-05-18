import net.dozzidog.bullwhipcombat.item.client.BullwhipRender;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;

import java.util.function.Consumer;

public class BullwhipItem extends Item implements GeoItem {
    @Override
        public void initializeClient(Consumer<IClientItemExtensions> consumer) {
          consumer.accept(new IClientItemExtensions() {
             private BullwhipRender renderer = null;
                @Override public BlockEntityWithoutLevelRenderer getItemStackRenderer() {
                    if (this.renderer == null)
                      this.renderer = new BullwhipRender();

            return renderer;
        }
    });
}