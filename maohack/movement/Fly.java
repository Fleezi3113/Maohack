package me.fleezi.maohack.movement;

import org.lwjgl.input.Keyboard;

import me.fleezi.maohack.EventUpdate;
import me.fleezi.maohack.Events;
import me.fleezi.maohack.modules.Module;


public class Fly extends Module {

	public Fly() {
		super("Fly", Category.MOVEMENT, Keyboard.KEY_H);
	}
	
	public void onEnable() {
		mc.player.capabilities.isFlying = true;
		mc.player.capabilities.allowFlying = true;
	}
	
	public void onDisable() {
		mc.player.capabilities.isFlying = false;
		mc.player.capabilities.allowFlying = false;
	} 
	
	public void onEvent(Events e) {
		if(e instanceof EventUpdate) {
			if(e.isPre()) {
				
			}
		}
	}
	
	} 
	
	
	

