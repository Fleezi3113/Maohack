package me.fleezi.maohack.render;

import org.lwjgl.input.Keyboard;

import me.fleezi.maohack.events.Event;
import me.fleezi.maohack.events.listeners.EventUpdate;
import me.fleezi.maohack.modules.Module;


public class Light extends Module {

	public Light() {
		super("Light", Keyboard.KEY_N, Category.MOVEMENT);
	}
	
	public void onEnable() {
		mc.gameSettings.gammaSetting = 100;
	}
	
	public void onDisable() {
		mc.gameSettings.gammaSetting = 1;
	} 
}
