package co.eltrut.flamboyant.client.renderer;

import com.mojang.blaze3d.matrix.MatrixStack;

import co.eltrut.flamboyant.common.color.FDyeColor;
import co.eltrut.flamboyant.common.tileentities.FBedTileEntity;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.model.ItemCameraTransforms.TransformType;
import net.minecraft.client.renderer.tileentity.ItemStackTileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class FBedItemRenderer extends ItemStackTileEntityRenderer {
	
	private final FDyeColor color;
	
	public FBedItemRenderer(FDyeColor color) {
		this.color = color;
	}
	
	@Override
	public void renderByItem(ItemStack itemStackIn, TransformType transformType, MatrixStack matrixStack, IRenderTypeBuffer buffer, int combinedLight, int combinedOverlay) {
		TileEntityRendererDispatcher.instance.renderItem(new FBedTileEntity(color), matrixStack, buffer, combinedLight, combinedOverlay);
	}

}
