package com.github.holdhands.WizardsWand.module.modules;

import com.darkmagician6.eventapi.EventManager;
import com.darkmagician6.eventapi.EventTarget;
import com.github.holdhands.WizardsWand.events.EventUpdate;
import com.github.holdhands.WizardsWand.module.Category;
import com.github.holdhands.WizardsWand.module.Module;

import net.minecraft.client.gui.GuiIngame;

public class UpdateAll extends Module{

	public UpdateAll() {
		super("UdpateAll", "s", 0, Category.GUI);
		
	}
	@Override
	public void onEnable() {
		EventManager.register(this);
		super.onEnable();
	}
	@Override
	public void onDisable() {
		EventManager.unregister(this);
		super.onDisable();
	}
	
	@EventTarget
	public void onUpdate(EventUpdate e){
		
		//GuiIngame.renderHaxHud();
	}

}
