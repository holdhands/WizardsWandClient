package com.github.holdhands.WizardsWand.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.darkstorm.minecraft.gui.component.basic.BasicButton;

import com.github.holdhands.WizardsWand.module.Category;
import com.github.holdhands.WizardsWand.module.Module;
import com.github.holdhands.WizardsWand.module.ModuleManager;
import com.github.holdhands.WizardsWand.module.modules.Flight;

import me.imfr0zen.guiapi.ClickGui;
import me.imfr0zen.guiapi.Colors;
import me.imfr0zen.guiapi.Frame;
import me.imfr0zen.guiapi.GuiFrame;
import me.imfr0zen.guiapi.components.Button;
import me.imfr0zen.guiapi.components.GuiToggleButton;
import me.imfr0zen.guiapi.listeners.ExtendListener;

public class GuiMng extends ClickGui {

	public GuiMng() {
	}

	@Override
	public void initGui() {
		Colors.setButtonColor(0, 80, 250, 200);
		GuiFrame testFrame = new GuiFrame("Test", 25, 50);
	

		

		addFrame(testFrame);
		
	
		Button anotherTestButton = new Button("Flight");
		anotherTestButton.addExtendListener(new ExtendListener() {
			
			@Override
			public void addComponents() {
				/**
				 * Creates a new Instance of GuiToggleButton
				 */
				final GuiToggleButton togglebutton = new GuiToggleButton("Flight");
				
				/**
				 * Adds a ClickListener
				 */
				togglebutton.addClickListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent actionevent) {
						System.out.println("Button-State: " + togglebutton.isToggled());
						
						ModuleManager.setModuleState("Flight", togglebutton.isToggled());
					
					}
				});
				
				/**
				 * Adds the ToggleButton to the Pane.
				 */
				add(togglebutton);
			}
			
		});
		testFrame.addButton(anotherTestButton);
		
	

	}
}
