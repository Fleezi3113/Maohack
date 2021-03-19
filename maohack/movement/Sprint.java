package me.fleezi.maohack.movement;

import org.lwjgl.input.Keyboard;

import me.fleezi.maohack.EventUpdate;
import me.fleezi.maohack.Events;
import me.fleezi.maohack.modules.Module;

public class Sprint extends Module {

	public Sprint() {
		super("Sprint", Category.MOVEMENT, Keyboard.KEY_M);
	}
	
	public void onEnable() {
		mc.player.setSprinting(true);
	}
	
	public void onDisable() {
		mc.player.setSprinting(false);
	} 
	
	public void onEvent(Events e) {
		if(e instanceof EventUpdate) {
			if(e.isPre()) {
				mc.player.setSprinting(true);
			}
		}
	}
}
