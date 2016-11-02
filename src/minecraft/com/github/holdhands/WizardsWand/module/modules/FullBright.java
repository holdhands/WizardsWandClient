package com.github.holdhands.WizardsWand.module.modules;

import org.darkstorm.minecraft.gui.component.BoundedRangeComponent.ValueDisplay;
import org.lwjgl.input.Keyboard;

import com.darkmagician6.eventapi.EventManager;
import com.darkmagician6.eventapi.EventTarget;
import com.github.holdhands.WizardsWand.events.EventUpdate;
import com.github.holdhands.WizardsWand.module.Category;
import com.github.holdhands.WizardsWand.module.Module;
import com.github.holdhands.WizardsWand.value.Value;
import com.github.holdhands.WizardsWand.wrapper.Wrapper;



public class FullBright extends Module{

	Value f = new Value("test", 1, 1, 30, ValueDisplay.INTEGER);
	
	
	
	public FullBright() {
		super("FullBright", "FullBright", Keyboard.KEY_Z, Category.RENDER);
		
	}
	@Override
	public void onEnable() {
		Wrapper.getInstance().getMinecraft().gameSettings.gammaSetting = 10f;
		EventManager.register(this);
		System.out.println("FullBright");
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
			Wrapper.getInstance().getMinecraft().gameSettings.gammaSetting = 100f;
		}else{
			Wrapper.getInstance().getMinecraft().gameSettings.gammaSetting = 1f;
		}
	}


}
