package me.fleezi.maohack.movement;

import org.lwjgl.input.Keyboard;

import me.fleezi.maohack.events.Event;
import me.fleezi.maohack.events.listeners.EventUpdate;
import me.fleezi.maohack.modules.Module;


public class Fly extends Module {

	public Fly() {
		super("Fly", Keyboard.KEY_G, Category.MOVEMENT);
	}
	
	
	public void onDisable() {
		System.out.println("Calling onDisable()");

		mc.player.capabilities.isFlying = false;
	} 

	
	public void onEvent(Event e) {
		if(e instanceof EventUpdate) {
			if(e.isPre()) {
				mc.player.capabilities.isFlying = true;

			}
		}
	}
	
}
