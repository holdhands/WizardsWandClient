package com.github.holdhands.WizardsWand.gui;

import me.imfr0zen.guiapi.ClickGui;
import me.imfr0zen.guiapi.Colors;
import me.imfr0zen.guiapi.Frame;
import me.imfr0zen.guiapi.GuiFrame;

public class ModMenu extends ClickGui{
	
	public ModMenu(){}
	
	GuiFrame gf = new GuiFrame("Gui", 25, 25);
	
	@Override
	public void initGui(){
		Colors.setButtonColor(0, 80, 250, 200);
		addFrame(gf);
		
		
		
	}
	

}
