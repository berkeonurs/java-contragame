/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game.imageloader;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import java.awt.Color;

/**
 *
 * @author Onur
 */
public class ImageLoader {
    
    public static Texture text,arkaplanTexture,botTexture,fireTexture,bossTexture,bossFireTexture,gameOverTexture,winTexture,bossFireTexture2;
    public static TextureRegion bgRegion,playerRegion,reelPlayerRegion,playButtonRegion,botRegion,fireRegion,bossRegion,bossFireRegion,gameOverRegion,winRegion,bossFireRegion2;
    
    public static TextureRegion arkaPlan;
    
    public static BitmapFont font;
    public static Texture fontTexture;
    
    public static void load(){
        
        font = new BitmapFont(Gdx.files.internal("font.fnt"),true);
        font.getData().setScale((float) 0.50);
        fontTexture = new Texture(Gdx.files.internal("font.png"));
        font.setColor(com.badlogic.gdx.graphics.Color.RED);
        fontTexture.setFilter(TextureFilter.Nearest, TextureFilter.Nearest);
        
        
        text = new Texture(Gdx.files.internal("gbg.jpg"));
        
        arkaplanTexture = new Texture(Gdx.files.internal("background.jpg"));
        
        bgRegion = new TextureRegion(text, 0, 0, text.getWidth(), text.getHeight());
        bgRegion.flip(false, true);
        
        gameOverTexture = new Texture(Gdx.files.internal("gameover.jpg"));
        gameOverRegion = new TextureRegion(gameOverTexture,0,0,gameOverTexture.getWidth(),gameOverTexture.getHeight());
        gameOverRegion.flip(false,true);
        
        winTexture = new Texture(Gdx.files.internal("win.jpg"));
        winRegion = new TextureRegion(winTexture,0,0,winTexture.getWidth(),winTexture.getHeight());
        winRegion.flip(false, true);
        
        
        
        /*playerRegion = new TextureRegion(text,484,2,50,50);
        playerRegion.flip(false,true);*/
        
        text=new Texture(Gdx.files.internal("adam.png"));
        reelPlayerRegion=new TextureRegion(text, 0, 0, text.getWidth(), text.getHeight());
        reelPlayerRegion.flip(false, true);
        
        playButtonRegion = new TextureRegion(text, 315,500,600,545);
        playButtonRegion.flip(false, true);
        
        arkaPlan = new TextureRegion(arkaplanTexture,0,0,1280,800);
        arkaPlan.flip(false,true);
        
        botTexture = new Texture(Gdx.files.internal("bot.png"));
        botRegion=new TextureRegion(botTexture,0,0,botTexture.getWidth(),botTexture.getHeight());
        botRegion.flip(false,true);
        
        fireTexture=new Texture(Gdx.files.internal("fire.png"));
        fireRegion=new TextureRegion(fireTexture,0,0,fireTexture.getWidth(),fireTexture.getWidth());
        fireRegion.flip(false,true);
        
        bossTexture = new Texture(Gdx.files.internal("boss.png"));
        bossRegion = new TextureRegion(bossTexture,0,0,bossTexture.getWidth(),bossTexture.getHeight());
        bossRegion.flip(false,true);
        
        
        
        bossFireTexture = new Texture(Gdx.files.internal("bossfire.png"));
        bossFireRegion = new TextureRegion(bossFireTexture,0,0,bossFireTexture.getWidth(),bossFireTexture.getHeight());
        bossFireRegion.flip(false, true);
        
        bossFireTexture2 = new Texture(Gdx.files.internal("bossfire2.png"));
        bossFireRegion2 = new TextureRegion(bossFireTexture2,0,0,bossFireTexture2.getWidth(),bossFireTexture2.getHeight());
        bossFireRegion2.flip(false, true);
        
        
        
    }
    
    public static void dispose(){
        font.dispose();
        fontTexture.dispose();
        text.dispose();
        arkaplanTexture.dispose();
        
    }
    
    
}
