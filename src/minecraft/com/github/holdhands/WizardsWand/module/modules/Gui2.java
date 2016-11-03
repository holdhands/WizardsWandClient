package com.github.holdhands.WizardsWand.module.modules;

import org.lwjgl.input.Keyboard;

import com.github.holdhands.WizardsWand.WizardsWand;
import com.github.holdhands.WizardsWand.gui.ExampleGuiScreen;
import com.github.holdhands.WizardsWand.module.Category;
import com.github.holdhands.WizardsWand.module.Module;
import com.github.holdhands.WizardsWand.wrapper.Wrapper;

public class Gui2 extends Module {

	public Gui2() {
		super("Click Gui", "", Keyboard.KEY_GRAVE, Category.GUI);
		
	}

	
	public void onToggle() {
		
	//Wrapper.getInstance().getMinecraft().displayGuiScreen(WizardsWand.theClient.getGui());
	Wrapper.getInstance().getMinecraft().displayGuiScreen(new ExampleGuiScreen());
	}

}
