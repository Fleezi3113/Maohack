package me.fleezi.maohack.render;

import org.lwjgl.input.Keyboard;

import me.fleezi.maohack.EventUpdate;
import me.fleezi.maohack.Events;
import me.fleezi.maohack.modules.Module;

public class Light extends Module {

	public Light() {
		super("Light", Category.MOVEMENT, Keyboard.KEY_N);
	}
	
	public void onEnable() {
		mc.gameSettings.gammaSetting = 100;
	}
	
	public void onDisable() {
		mc.gameSettings.gammaSetting = 1;
	} 
	
	
}
