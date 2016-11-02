package com.github.holdhands.WizardsWand.module.modules;

import org.lwjgl.input.Keyboard;

import com.darkmagician6.eventapi.EventManager;
import com.darkmagician6.eventapi.EventTarget;
import com.github.holdhands.WizardsWand.WizardsWand;
import com.github.holdhands.WizardsWand.events.EventRender2D;
import com.github.holdhands.WizardsWand.module.Category;
import com.github.holdhands.WizardsWand.module.Module;
import com.github.holdhands.WizardsWand.ttf.TTFManager;
import com.github.holdhands.WizardsWand.wrapper.Wrapper;

import net.minecraft.client.gui.ScaledResolution;

public class Hud extends Module {

	public Hud() {
		super("Hud", "Hud", Keyboard.KEY_F7, Category.GUI);
	}

	@Override
	public void onEnable() {
		EventManager.register(this);
		super.onEnable();
	}

	@Override
	public void onDisable() {
		EventManager.unregister(this);
		super.onDisable();
	}

	@EventTarget
	private void onRender2D(EventRender2D event) {
		if (this.getState()) {
			ScaledResolution sr = new ScaledResolution(Wrapper.getInstance().getMinecraft());
			String drawFPS = String.valueOf(Wrapper.getInstance().getMinecraft().debugFPS);
			TTFManager.getInstance().getStandardFont()
					.drawString(WizardsWand.getInstance().getClientName() + " §6[rel-" + "2B" + "]", 7, 2, 0xff00FF00);
			TTFManager.getInstance().getStandardFont().drawString("FPS: " + drawFPS, 7, 14, 0xffffff);
			renderArrayList(sr);
		}

		// Wrapper.fu_Impact.drawString("Test", 7, 26, 0x530DFE);
		// Wrapper.fu_Dunkin.drawString("Test2", 7, 40, 0x530DFE);
	}

	private static void renderArrayList(ScaledResolution scaledResolution) {
		int yCount = 2;
		int right = scaledResolution.getScaledWidth() - 2;
		for (Module m : WizardsWand.getInstance().getModuleManager().activeModules) {
			if (m.getState() && !m.isCategory(Category.GUI)) {
				TTFManager.getInstance().getModListFont().drawString(m.getName(),
						right - TTFManager.getInstance().getModListFont().getWidth(m.getName()), yCount, m.getColor());
				yCount += 10;
			}
		}
	}

}
