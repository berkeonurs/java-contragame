package com.mygdx.game.desktop;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.Contra2;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
                
                config.title=Contra2.TITLE;
                config.height=Contra2.HEIGHT;
                config.width=Contra2.WIDTH;
                
                
		new LwjglApplication(new Contra2(), config);
	}
}
