package com.github.holdhands.WizardsWand.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.darkstorm.minecraft.gui.component.basic.BasicButton;

import com.github.holdhands.WizardsWand.module.Category;
import com.github.holdhands.WizardsWand.module.Module;
import com.github.holdhands.WizardsWand.module.ModuleManager;
import com.github.holdhands.WizardsWand.module.modules.Flight;
import com.github.holdhands.WizardsWand.module.modules.Glide;

import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
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
	public  void initGui() {
		
		Colors.setButtonColor(0, 80, 250, 200);
		GuiFrame testFrame = new GuiFrame("Test", 25, 50);
		
		
	
		addFrame(testFrame);
		
	
		
		//FLIGHT
		final Button flighttoggle = new Button("Flight");
		flighttoggle.addExtendListener(new ExtendListener() {
			
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
		testFrame.addButton(flighttoggle);
		//END FLIGHT
		
		//FULLBRIGHT
		final Button FullBrightExpand = new Button("FullBright");
		FullBrightExpand.addExtendListener(new ExtendListener() {
			
			@Override
			public void addComponents() {
				/**
				 * Creates a new Instance of GuiToggleButton
				 */
				final GuiToggleButton togglefullbright = new GuiToggleButton("FullBright");
				
				/**
				 * Adds a ClickListener
				 */
				togglefullbright.addClickListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent actionevent2) {
						System.out.println("Button-State: " + togglefullbright.isToggled());
						
						ModuleManager.setModuleState("FullBright", togglefullbright.isToggled());
					
					}
				});
				
				/**
				 * Adds the ToggleButton to the Pane.
				 */
				add(FullBrightExpand);
			}
			
		});
		testFrame.addButton(FullBrightExpand);
		//END FULLBRIGHT
		
		
		final Button about = new Button("About");
		about.addExtendListener(new ExtendListener() {
			
			@Override
			public void addComponents() {
			
				final Button site = new Button("Site");
				
				site.addClickListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
					System.out.println("Website Clicked");
						
					}
				});
				
			}
		});
		
		

	testFrame.addButton(about);
		
	super.initGui();
	
		
}	
	public void onGuiClosed() {
	
	};
}