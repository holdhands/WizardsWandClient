package com.github.holdhands.WizardsWand;

import org.apache.http.impl.entity.DisallowIdentityContentLengthStrategy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.darkstorm.minecraft.gui.theme.simple.SimpleTheme;
import org.darkstorm.minecraft.gui.util.GuiManagerDisplayScreen;
import org.lwjgl.opengl.Display;

import com.darkmagician6.eventapi.EventManager;
import com.darkmagician6.eventapi.EventTarget;
import com.github.holdhands.WizardsWand.events.EventKeyBoard;
import com.github.holdhands.WizardsWand.gui.GuiManager;
import com.github.holdhands.WizardsWand.module.Module;
import com.github.holdhands.WizardsWand.module.ModuleManager;
import com.github.holdhands.WizardsWand.wrapper.Wrapper;
import com.sun.jna.platform.unix.X11.Window;

import net.minecraft.client.Minecraft;

public class WizardsWand {

	private final String clientName = "WizardsWand";
	private final double clientVersion = 2.0;
	private final String clientCreator = "holdhands Team";

	public static WizardsWand theClient = new WizardsWand();

	private static ModuleManager moduleManager = null;

	private GuiManagerDisplayScreen gui;
	private GuiManager guiManager;
	public static Logger logger = LogManager.getLogger();

	public static WizardsWand getInstance() {
		return theClient;
	}

	public void initClient() {
		EventManager.register(this);
		//Display.setTitle(getClientName() + " (rel-" + "2B" + ")");

		moduleManager = new ModuleManager();
		moduleManager.AddModules();

		if (Wrapper.getInstance().getWorld() != null) {
			moduleManager.setModuleState("Hud", false);
		} else {
			moduleManager.setModuleState("Hud", true);
		}

	}

	@EventTarget
	public void onKeyboard(EventKeyBoard event) {
		for (Module m : getModuleManager().activeModules) {
			if (event.getKey() == m.getBind()) {

				m.toggleModule();
			}
		}
	}

	public GuiManager getGuiManager() {
		if (guiManager == null) {
			guiManager = new GuiManager();
			guiManager.setTheme(new SimpleTheme());
			guiManager.setup();
			guiManager.update();
		}
		return guiManager;
	}

	public GuiManagerDisplayScreen getGui() {
		if (gui == null) {
			gui = new GuiManagerDisplayScreen(getGuiManager());
		}
		return gui;
	}

	public String getClientName() {
		return clientName;
	}

	public double getClientVersion() {
		return clientVersion;
	}

	public String getClientCreator() {
		return clientCreator;
	}

	public static ModuleManager getModuleManager() {
		return moduleManager;
	}

	public static Logger getLogger() {
		return logger;
	}

}
