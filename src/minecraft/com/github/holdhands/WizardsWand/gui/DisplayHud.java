package com.github.holdhands.WizardsWand.gui;

import com.github.holdhands.WizardsWand.ttf.FontUtils;
import com.github.holdhands.WizardsWand.ttf.TTFManager;
import com.github.holdhands.WizardsWand.wrapper.Wrapper;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiIngame;

public class DisplayHud extends GuiIngame {

	public DisplayHud(Minecraft mcIn) {
		
		super(mcIn);
		TTFManager.getInstance().getStandardFont().drawString("WizardsWand", 50, 50, 0xff00FF00);
		System.out.println("Render");
		System.out.println("Render");
		System.out.println("Render");
		System.out.println("Render");
		System.out.println("Render");
		System.out.println("Render");
	}



}
