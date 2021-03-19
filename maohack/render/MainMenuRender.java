package me.fleezi.maohack.render;

import me.fleezi.maohack.MaohackMain;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.GlStateManager;

public class MainMenuRender extends Gui {

	private Minecraft mc = Minecraft.getMinecraft();
	
	public void draw() {
		GlStateManager.scale(2, 2, 2);
		mc.fontRendererObj.drawStringWithShadow(MaohackMain.mainMenuClientName, 1, 1, 0xffffff);
		mc.fontRendererObj.drawStringWithShadow(MaohackMain.clientVersion, 1, 1, 0xffffff);
		GlStateManager.scale(0.5, 0.5, 0.5);
	}
}
