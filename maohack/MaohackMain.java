package me.fleezi.maohack;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import me.fleezi.maohack.events.Event;
import me.fleezi.maohack.modules.Module;
import me.fleezi.maohack.modules.Module.Category;
import me.fleezi.maohack.movement.*;
import me.fleezi.maohack.player.*;
import me.fleezi.maohack.render.*;
import me.fleezi.maohack.ui.HUD;

import org.lwjgl.opengl.Display;

public class MaohackMain {
	public static String ingameClientName = "MAOHACK";
	public static String mainMenuClientName = "Maohack by Fleezi";
	public static String clientVersion = "[BETA]";
	
	public static CopyOnWriteArrayList<Module> modules = new CopyOnWriteArrayList<Module>();
	public static HUD hud = new HUD();
	
	public static void startup() {
		System.out.println("Starting Maohack BETA");
		Display.setTitle("Maohack [BETA] 1.12.2");
		
		modules.add(new Fly());
		modules.add(new Sprint());
		modules.add(new Light());
		modules.add(new NoFall());

	}
	
	public static void onEvent(Event e) {
		for(Module m : modules) {
			if(!m.toggled)
				continue;
			
			m.onEvent(e);
		}
	}
	
	public static void keyPress(int key) {
		System.out.println("Calling keyPress");
		for(Module m : modules) {
			if(m.getKey() == key) {
				m.toggle();
			}
		}
	}
	
	public List<Module> getModulesByCategory(Category c) {
		List<Module> modules = new ArrayList<Module>();
		
		for(Module m : this.modules) {
			modules.add(m);
		}
		return modules;
	}
}
