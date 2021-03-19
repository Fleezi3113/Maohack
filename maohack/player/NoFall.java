package me.fleezi.maohack.player;

import org.lwjgl.input.Keyboard;

import me.fleezi.maohack.EventUpdate;
import me.fleezi.maohack.Events;
import me.fleezi.maohack.modules.Module;
import me.fleezi.maohack.modules.Module.Category;
import net.minecraft.network.play.client.CPacketPlayer;

public class NoFall extends Module {

	public NoFall() {
		super("NoFall", Category.MOVEMENT, Keyboard.KEY_B);
	}

	
	public void onEvent(Events e) {
		if(e instanceof EventUpdate && e.isPre()) {
			if(mc.player.fallDistance > 2) 
				 mc.player.connection.sendPacket(new CPacketPlayer(true));
		}
	}
}

