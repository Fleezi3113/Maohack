package me.fleezi.maohack.modules;

import org.lwjgl.input.Keyboard;

import me.fleezi.maohack.Events;
import net.minecraft.client.Minecraft;

public class Module {
	
	public String name;
	private Category category;
	private String description;
	private int keyCode;
	private String[] modes;
	
	private boolean enabled;
	
	protected Minecraft mc = Minecraft.getMinecraft();
	public boolean toggled;
	
	public Module(String name, Category category) {
		this(name, category, null, Keyboard.KEY_NONE, "Default");
	}
	
	public Module(String name, Category category, String description) {
		this(name, category, description, Keyboard.KEY_NONE, "Default");
	}
	
	public Module(String name, Category category, int keyCode) {
		this(name, category, null, keyCode, "Default");
	}
	
	public Module(String name, Category c, String description, int keyCode, String... modes) {
		this.name = name;
		this.category = c;
		this.description = description;
		this.keyCode = keyCode;
		this.modes = modes;
		
	}
	
	public int getKey() {
		return keyCode;
	}
	
	public void onEvent(Events e) {
			
	}
	
	public boolean isEnabled() {
		return toggled;
	}
	
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	public void onRender() {
		
	}
	
	
	
	public void onKeyPressed(int keyCode) {
		if(this.keyCode == keyCode) {
			this.toggle();
		}
	}
	public void toggle() {
		toggled = !toggled;
		if(toggled) {
			onEnable();
		} else {
			onDisable();
		}
	}
	
	public void onEnable() {
		
	}
	
	public void onDisable() {
		
	} 

	public enum Category {
		
		COMBAT, CHAT, RENDER, MOVEMENT, PLAYER, MISC
	}

	
}
