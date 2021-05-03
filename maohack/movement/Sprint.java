package me.fleezi.maohack.movement;

import org.lwjgl.input.Keyboard;

import me.fleezi.maohack.events.Event;
import me.fleezi.maohack.events.listeners.EventUpdate;
import me.fleezi.maohack.modules.Module;


public class Sprint extends Module {

	public Sprint() {
		super("Sprint", Keyboard.KEY_M, Category.MOVEMENT);
	}

	public void onDisable() {
		System.out.println("Calling sprint onDisable()");

		mc.player.setSprinting(true);

	} 
	
	public void onEvent(Event e) {
		if(e instanceof EventUpdate) {
			if(e.isPre()) {
				mc.player.setSprinting(true);
			}
		}
	}
	
}
