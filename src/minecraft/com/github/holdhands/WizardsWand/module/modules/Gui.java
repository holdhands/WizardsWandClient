package com.github.holdhands.WizardsWand.module.modules;

import org.lwjgl.input.Keyboard;

import com.github.holdhands.WizardsWand.WizardsWand;
import com.github.holdhands.WizardsWand.gui.ExampleGuiScreen;
import com.github.holdhands.WizardsWand.gui.listeners.GuiMenu;
import com.github.holdhands.WizardsWand.module.Category;
import com.github.holdhands.WizardsWand.module.Module;
import com.github.holdhands.WizardsWand.wrapper.Wrapper;

public class Gui extends Module {

	public Gui() {
		super("Click Gui", "", Keyboard.KEY_LCONTROL, Category.GUI);
		
	}

	
	public void onToggle() {
		
		Wrapper.getInstance().getMinecraft().displayGuiScreen(new GuiMenu());
	}

}
