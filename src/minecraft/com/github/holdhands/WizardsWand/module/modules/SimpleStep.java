package com.github.holdhands.WizardsWand.module.modules;

import org.lwjgl.input.Keyboard;

import com.darkmagician6.eventapi.EventManager;
import com.darkmagician6.eventapi.EventTarget;
import com.github.holdhands.WizardsWand.events.EventUpdate;
import com.github.holdhands.WizardsWand.module.Category;
import com.github.holdhands.WizardsWand.module.Module;
import com.github.holdhands.WizardsWand.wrapper.Wrapper;




public class SimpleStep extends Module{

	public SimpleStep() {
		
		super("Step", "", Keyboard.KEY_G, Category.MOVEMENT);
	}
	
	@Override
	public void onEnable() {
		EventManager.register(this);
		System.out.println("Step");
		super.onEnable();
		
	}
	
	@Override
	public void onDisable() {
		EventManager.unregister(this);
		super.onDisable();
	}
	
	@EventTarget
	public void onUpdate(EventUpdate event){
		if(this.getState()){
			Wrapper.getInstance().getPlayer().stepHeight = 5f;
		}else{
			Wrapper.getInstance().getPlayer().stepHeight = 0.5f;
		}
	}

}
