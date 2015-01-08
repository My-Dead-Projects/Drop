package com.mikefdorst.gdxdemo.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mikefdorst.gdxdemo.Drop;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Drop";
		config.width = 1600;
		config.width = 900;
		new LwjglApplication(new Drop(), config);
	}
}
