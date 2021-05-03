package me.fleezi.maohack.modules;

import org.lwjgl.input.Keyboard;

import me.fleezi.maohack.events.Event;
import net.minecraft.client.Minecraft;

public class Module {
	
	public String name;
	public Category category;
	public int keyCode;
	public boolean toggled;
	public Minecraft mc = Minecraft.getMinecraft();
	
	public Module(String name, int key, Category c) {
		this.name = name;
		this.keyCode = key;
		this.category = c;
	}
	
	public boolean isEnabled() {
		System.out.println("Calling isEnabled()");
		return toggled;
	} 
	
	public int getKey() {
		return keyCode;
	}
	
	public void onEvent(Event e) {
		
	}
	
	public void toggle() {
		System.out.println("Calling toggle()");
				
		toggled = !toggled;
		if(toggled) {
			onEnable();
		} else {
			onDisable();
		}
	}
	
	public void onEnable() {
		System.out.println("Calling onEnable()");
	}
	
	public void onDisable() {
		System.out.println("Calling onDisable()");
	} 
	
public enum Category {
		
		COMBAT("Combat"), CHAT("Chat"), RENDER("Render"), MOVEMENT("Movement"), PLAYER("Player"), MISC("Misc");
		
	public String name;
	
	Category(String name) {
		this.name = name;
		}
	}
}
