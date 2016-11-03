package com.github.holdhands.WizardsWand.gui;

import com.github.holdhands.WizardsWand.ttf.FontUtils;
import com.github.holdhands.WizardsWand.ttf.TTFManager;
import com.github.holdhands.WizardsWand.wrapper.Wrapper;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiIngame;

public class DisplayHud extends GuiIngame{

	public DisplayHud(Minecraft mcIn) {
		
		

		
		super(mcIn);

	}
	
	public void RenderMark(){
		
		TTFManager.getInstance().getStandardFont().drawString("WizardsWand", 1, 1, 0xff00FF00);
		
		
	}
	
	public void func_175180_a(float p_175180_1_){
		
		RenderMark();
		
	}
	

}
