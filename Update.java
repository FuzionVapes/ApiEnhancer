package me.yoloswaginz.enhance;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Update {
	
	public static String updateLink = "https://dl.dropboxusercontent.com/u/82276907/BukkitPlugins/BukkitApiEnhancer.jar";
	
	public static String currentVersion = "0.1";	
	public static String contents;

	public static void readTextFile()
	{
		System.out.println("[ApiEnhancer] Checking for updates");
		try {
			URL url = new URL("https://getbukkit.org/get/1eb34a7d4db660bb88d02b6c8845957c");
			BufferedReader info = new BufferedReader(new InputStreamReader(url.openStream()));
			String abc;
			contents = "";
			while ((abc = info.readLine()) != null) {
				contents += abc;
			}
			info.close();
		}
		catch (Exception e){System.out.println("[ApiEnhancer] No updates found.");}
	}
	
	public static void checkUpdate()
	{
		try{
			readTextFile();
			if(!contents.equals(currentVersion))
			{
				ApiEnhancer enhance = new ApiEnhancer();
				enhance.isUpdate = true;
			}
		}catch(Exception exception){}
	}

}
