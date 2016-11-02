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

import net.minecraft.network.play.client.CPacketPlayer;


public class Flight extends Module {
	
	
	Value flightSpeed = new Value("Flight Speed", 10, 5, 100, ValueDisplay.INTEGER);
	
	public static float flyHackSpeed = 0.1f;
	public static Boolean isEnabled;

	public Flight() {
		super("Flight", "Flight", Keyboard.KEY_F, Category.MOVEMENT);
		
	}

	@Override
	public void onEnable() {
		isEnabled = true;
		EventManager.register(this);
		System.out.println("Flight");
		super.onEnable();

	}

	@Override
	public void onDisable() {
		isEnabled = false;
		EventManager.unregister(this);
		Wrapper.getInstance().getPlayer().capabilities.isFlying = false;
		super.onDisable();
	}

	@EventTarget
	public void onUpdate(EventUpdate event) {

		if (Wrapper.getInstance().getMinecraft().thePlayer.isCreative() == false) {
			if (this.getState()) {
				Wrapper.getInstance().getPlayer().capabilities.isFlying = true;

			}

			if (Wrapper.getInstance().getMinecraft().gameSettings.keyBindJump.isPressed()) {
				Wrapper.getInstance().getMinecraft().thePlayer.motionY += 0.2;
			} else if (Wrapper.getInstance().getMinecraft().gameSettings.keyBindSneak.isPressed()) {

			} else if (Wrapper.getInstance().getMinecraft().gameSettings.keyBindForward.isPressed()) {
				Wrapper.getInstance().getMinecraft().thePlayer.capabilities.setFlySpeed(flyHackSpeed);
			}

		}

	}

}
