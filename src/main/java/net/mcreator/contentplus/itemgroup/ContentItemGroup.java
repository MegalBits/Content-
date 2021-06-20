
package net.mcreator.contentplus.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.contentplus.block.B0Block;
import net.mcreator.contentplus.ContentPlusModElements;

@ContentPlusModElements.ModElement.Tag
public class ContentItemGroup extends ContentPlusModElements.ModElement {
	public ContentItemGroup(ContentPlusModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabcontent") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(B0Block.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
