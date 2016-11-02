package com.github.holdhands.WizardsWand.module.modules;

import org.lwjgl.input.Keyboard;

import com.darkmagician6.eventapi.EventManager;
import com.darkmagician6.eventapi.EventTarget;
import com.github.holdhands.WizardsWand.events.EventUpdate;
import com.github.holdhands.WizardsWand.module.Category;
import com.github.holdhands.WizardsWand.module.Module;
import com.github.holdhands.WizardsWand.wrapper.Wrapper;



public class Sprint extends Module{

	public Sprint() {
		super("Sprint", "Sprint", Keyboard.KEY_L, Category.MOVEMENT);
		
	}
	@Override
	public void onEnable() {
		Wrapper.getInstance().getPlayer().setSprinting(true);
		EventManager.register(this);
		System.out.println("Sptint");
		super.onEnable();
		
	}
	
	@Override
	public void onDisable() {
		EventManager.unregister(this);
		Wrapper.getInstance().getPlayer().setSprinting(false);
		super.onDisable();
	}
	
	@EventTarget
	public void onUpdate(EventUpdate event){
		Wrapper.getInstance().getPlayer().setSprinting(true);
		
		
	}

	
}
