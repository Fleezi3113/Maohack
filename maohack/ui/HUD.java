package me.fleezi.maohack.ui;

import me.fleezi.maohack.MaohackMain;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import me.fleezi.maohack.modules.Module;

public class HUD {
	
public Minecraft mc = Minecraft.getMinecraft();
	
	public void draw() {
		FontRenderer fr = mc.fontRendererObj;
		ScaledResolution sr = new ScaledResolution(mc);

		GlStateManager.scale(1, 1, 1);
		fr.drawStringWithShadow(MaohackMain.ingameClientName, 1, 1, 0xffffff);
		GlStateManager.scale(1, 1, 1);
		
	int count = 0;
	
	
	for(Module m : MaohackMain.modules) {
		if(!m.toggled)
			continue;
	
		int adjust = count * (fr.FONT_HEIGHT + 6);
		
			Gui.drawRect(sr.getScaledWidth() - fr.getStringWidth(m.name) - 7, adjust, sr.getScaledWidth(), 6 + fr.FONT_HEIGHT + adjust, 0x90000000);
		
			GlStateManager.scale(1, 1, 1);
			fr.drawStringWithShadow(m.name, sr.getScaledWidth() - fr.getStringWidth(m.name) - 4, 4 + adjust, 0xff0000);
			
			count ++;
		}
	}
}
