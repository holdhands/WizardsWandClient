package com.github.holdhands.WizardsWand.module;

import java.util.ArrayList;

import org.newdawn.slick.font.effects.OutlineEffect;

import com.github.holdhands.WizardsWand.module.modules.*;




public class ModuleManager {
	
	public static ArrayList<Module> activeModules = new ArrayList<Module>();
	
	public void AddModules(){
		this.activeModules.add(new Hud());
		//this.activeModules.add(new BetterHud());
		this.activeModules.add(new SimpleStep());
		this.activeModules.add(new Flight());
		this.activeModules.add(new Sprint());
		this.activeModules.add(new FullBright());
		this.activeModules.add(new Glide());
		this.activeModules.add(new NoFall());
		this.activeModules.add(new Gui());
		this.activeModules.add(new UpdateAll());
		this.activeModules.add(new Gui2());
		
		System.out.println("ADDMODULES");
	}
	
	public static ArrayList<Module> getModules(){
		return activeModules;
	}
	
	public Module getModule(Class<? extends Module> clazz){
		for(Module m : getModules()){
			if(m.getClass() == clazz){
				return m;
			}
		}
		return null;
	}
	
	public static void setModuleState(String modName, boolean state){
		for(Module m : activeModules){
			if(m.getName().equalsIgnoreCase(modName.trim())){
				m.setState(state);
				return;
			}
		}
	}

}
