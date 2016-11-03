package com.github.holdhands.WizardsWand.gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import me.imfr0zen.guiapi.Colors;
import me.imfr0zen.guiapi.GuiFrame;
import me.imfr0zen.guiapi.components.Button;
import me.imfr0zen.guiapi.components.GuiToggleButton;
import me.imfr0zen.guiapi.listeners.ExtendListener;

public class GuiMenu extends me.imfr0zen.guiapi.ClickGui {

	public GuiMenu() {
	}

	@Override
	public void initGui() {
		Colors.setButtonColor(0, 80, 250, 200);
		GuiFrame HaxFrame = new GuiFrame("Hax", 25, 50);

		Button expandFlight = new Button("Flight");
		Button expandFullBright = new Button("FullBright");
		//FLIGHT
		expandFlight.addExtendListener(new ExtendListener() {

			@Override
			public void addComponents() {

				final GuiToggleButton toggleflight = new GuiToggleButton("Flight");

				toggleflight.addClickListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {

						System.out.println("Flight-State: " + toggleflight.isToggled());
					}
				});
				add(toggleflight);

			}
		});
		//FLIGHT END
		
		//FULLBRIGHT
		    expandFullBright.addExtendListener(new ExtendListener() {
			
			@Override
			public void addComponents() {
			final GuiToggleButton toggleFullBright = new GuiToggleButton("Full Bright");
				
			toggleFullBright.addClickListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
				
					System.out.println("FullBright-State: " + toggleFullBright.isToggled());
					
				}
			});
			add(toggleFullBright);
			}
		});
		
		
		  //FULLBRIGHT END
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		HaxFrame.addButton(expandFlight);
		HaxFrame.addButton(expandFullBright);

		addFrame(HaxFrame);

		super.initGui();

	}

}
