package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.imageloader.ImageLoader;
import com.mygdx.game.states.MenuState;
import com.mygdx.game.states.PlayState;
import com.mygdx.game.states.StateManager;

public class Contra2 extends Game {

    public static int WIDTH=1366;
    public static int HEIGHT=768;
    
    public static String TITLE="Contra";
    
    private SpriteBatch sb;
    
    private static StateManager sm;
    public void create() {
        Gdx.gl.glClearColor(0.1f, 0.1f, 0.1f, 1);
        ImageLoader.load();
        
        sb = new SpriteBatch();
        
        sm = new StateManager();
        sm.pushState(new MenuState(sm));
        System.out.println("Oyun Oluşturuldu");
    }
    
    
    public void render(){
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        sm.render(sb);
        sm.update(Gdx.graphics.getDeltaTime());
    }
    
   
    public void dispose(){
        ImageLoader.dispose();
        System.out.println("Oyun yok edildi");
    }
    
	
}
