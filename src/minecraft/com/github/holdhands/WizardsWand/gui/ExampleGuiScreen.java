package com.github.holdhands.WizardsWand.gui;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import com.github.holdhands.WizardsWand.gui.listeners.ExampleClickListener;
import com.github.holdhands.WizardsWand.gui.listeners.ExampleExtendListener;

import me.imfr0zen.guiapi.ClickGui;
import me.imfr0zen.guiapi.Colors;
import me.imfr0zen.guiapi.GuiFrame;
import me.imfr0zen.guiapi.components.Button;
import me.imfr0zen.guiapi.components.GuiToggleButton;
import me.imfr0zen.guiapi.listeners.ExtendListener;

/**
 * 
 * Display this screen in Minecraft:
 * <code>Minecraft.getMinecraft().displayGuiScreen(new ExampleGuiScreen());</code>
 * Has to extend {@link me.imfr0zen.guiapi.ClickGui}
 * 
 * @author ImFr0zen
 */
public class ExampleGuiScreen extends ClickGui {

	public ExampleGuiScreen() {}

	@Override
	public void initGui() {
		/**
		 * Set the Button Color.
		 */
		Colors.setButtonColor(0, 80, 250, 200);
		
		/**
		 * Creates a new Frame.
		 */
		GuiFrame testFrame = new GuiFrame("Test", 25, 50);

		/**
		 * Creates a new button.
		 */
		Button testButton = new Button("TestButton");

		/**
		 * Adds a ClickListener.
		 */
		testButton.addClickListener(new ExampleClickListener());
		
		/**
		 * Adds an ExtendListener.
		 */
		testButton.addExtendListener(new ExampleExtendListener());
		
		/**
		 * Adds Button to Frame.
		 */
		testFrame.addButton(testButton);
		
		/**
		 * Repeats the process
		 */
		Button anotherTestButton = new Button("Another Button");
		anotherTestButton.addExtendListener(new ExtendListener() {
			
			@Override
			public void addComponents() {
				/**
				 * Creates a new Instance of GuiToggleButton
				 */
				final GuiToggleButton togglebutton = new GuiToggleButton("Click me!");
				
				/**
				 * Adds a ClickListener
				 */
				togglebutton.addClickListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent actionevent) {
						System.out.println("Button-State: " + togglebutton.isToggled());
					}
				});
				
				/**
				 * Adds the ToggleButton to the Pane.
				 */
				add(togglebutton);
			}
			
		});
		testFrame.addButton(anotherTestButton);

		/**
		 * Adds Frame to ClickGui
		 */
		addFrame(testFrame);
		
		GuiFrame anotherTestFrame = new GuiFrame("Another TestFrame", 135, 50);
		
		Button madeByImFr0zenButton = new Button("Made by ImFr0zen");
		madeByImFr0zenButton.addClickListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent event) {
				try {
					Desktop.getDesktop().browse(new URI("https://www.youtube.com/c/ImFr0zen"));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
		
		anotherTestFrame.addButton(madeByImFr0zenButton);
		
		addFrame(anotherTestFrame);
		
		/**
		 * Has to be called after adding Frames
		 */
		super.initGui();
	}

	public void onGuiClosed() {
		/*
		 * Save the locations of the frames here
		 */
	};
}
