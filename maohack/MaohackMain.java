package me.fleezi.maohack;

import java.util.concurrent.CopyOnWriteArrayList;

import org.lwjgl.opengl.Display;

import me.fleezi.maohack.modules.Module;
import me.fleezi.maohack.movement.*;
import me.fleezi.maohack.render.*;

public class MaohackMain {
	public static String ingameClientName = "毛HACK";
	public static String mainMenuClientName = "Maohack by Fleezi";
	public static String clientVersion = "[BETA]";
	
	public static HUD hud = new HUD();
	
	public static CopyOnWriteArrayList<Module> modules = new CopyOnWriteArrayList<Module>();
	
	
	public static void init() {
		System.out.println("Testing Maohack Beta");
		Display.setTitle(ingameClientName + " " + clientVersion + " 1.12.2");
		
		modules.add(new Fly());
		modules.add(new Sprint());
		modules.add(new Light());
	}
	
	
	public static void onGui() {
	}
	

	
	public static void onEvent(Events e) {
		for(Module m : modules) {
			if(m.toggled)
				continue;
			
			m.onEvent(e);
		}
	}
	
		

	
	public static void keyPress(int key) {
		for(Module m : modules) {
			if(m.getKey() == key) {
				m.toggle();
			}
		}
	}
	
}
