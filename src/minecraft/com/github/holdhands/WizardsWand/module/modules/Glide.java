package com.github.holdhands.WizardsWand.module.modules;

import org.lwjgl.input.Keyboard;

import com.darkmagician6.eventapi.EventManager;
import com.darkmagician6.eventapi.EventTarget;
import com.github.holdhands.WizardsWand.events.EventUpdate;
import com.github.holdhands.WizardsWand.module.Category;
import com.github.holdhands.WizardsWand.module.Module;
import com.github.holdhands.WizardsWand.wrapper.Wrapper;

import net.minecraft.network.play.client.CPacketPlayer;

public class Glide extends Module {

	public Glide() {
		super("Glide", "", Keyboard.KEY_O, Category.MOVEMENT);

	}
	
	public static void Down(float f){
		Wrapper.getInstance().getMinecraft().thePlayer.motionY -=f;
		
	}

	@Override
	public void onEnable() {

		EventManager.register(this);
		System.out.println("Glide");
		super.onEnable();

	}

	@Override
	public void onDisable() {
		EventManager.unregister(this);
		Wrapper.getInstance().getMinecraft().gameSettings.keyBindForward.pressed = false;
		super.onDisable();

	}

	@EventTarget
	public void onUpdate(EventUpdate event) {
		if (this.getState()) {
			
			Down(0.04f);
			Wrapper.getInstance().getMinecraft().gameSettings.keyBindForward.pressed = true;
			
			//Old Glide mod!
			//Wrapper.getInstance().getMinecraft().thePlayer.motionY -= 0.010f;
			//Wrapper.getInstance().getMinecraft().gameSettings.keyBindForward.pressed = true;
			
			
		}
		

	}
}
