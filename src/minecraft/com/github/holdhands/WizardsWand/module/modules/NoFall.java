package com.github.holdhands.WizardsWand.module.modules;

import org.lwjgl.input.Keyboard;

import com.darkmagician6.eventapi.EventManager;
import com.darkmagician6.eventapi.EventTarget;
import com.github.holdhands.WizardsWand.events.EventUpdate;
import com.github.holdhands.WizardsWand.module.Category;
import com.github.holdhands.WizardsWand.module.Module;
import com.github.holdhands.WizardsWand.wrapper.Wrapper;

import net.minecraft.network.play.client.CPacketPlayer;


public class NoFall extends Module{

	public NoFall() {
		super("NoFall", "No fall" , Keyboard.KEY_P, Category.MOVEMENT);
		// TODO Auto-generated constructor stub
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
			

			if(Wrapper.getInstance().getMinecraft().thePlayer.fallDistance > 2)
				Wrapper.getInstance().getMinecraft().thePlayer.connection.sendPacket(new CPacketPlayer(true));
		}else{
			
		}
	}

}
