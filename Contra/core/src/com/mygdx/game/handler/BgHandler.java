/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game.handler;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mygdx.game.gameobject.GameWorld;
import com.mygdx.game.gameobject.Player;
import com.mygdx.game.imageloader.ImageLoader;

/**
 *
 * @author Onur
 */
public class BgHandler {
    private TextureRegion bg1,bg2,bg3;
    private float bg1Bas,bg1Son,bg2Bas,bg2Son,bg3Bas,bg3Son;
    
    private float width;
    private float height;
    private Player player;
    private float i=3140;
    private GameWorld gameWorld;
    
    public BgHandler(Player player,GameWorld gameWorld){
        this.gameWorld=gameWorld;
        this.player=player;
        width = Gdx.graphics.getWidth();
        height = Gdx.graphics.getHeight();
        bg1 = ImageLoader.arkaPlan;
        bg2 = ImageLoader.arkaPlan;
        bg3 = ImageLoader.arkaPlan;
        
        bg1Bas=0;
        bg1Son=bg1Bas+width;
        bg2Bas=bg1Son;
        bg2Son=bg2Bas+width;
        bg3Bas=bg2Son;
        bg3Son=bg3Bas+width;
        
    }
    
    public void render(SpriteBatch sb){
        sb.begin();
        
        sb.draw(bg1, bg1Bas, 0, width,height);
        sb.draw(bg2, bg2Bas, 0, width,height);
        sb.draw(bg3, bg3Bas, 0, width,height);
        //System.out.println(bg1Bas+" "+bg1Son+" "+bg2Bas+" "+bg2Son+" "+bg3Bas+" "+bg3Son+" "+player.getxKord());
         //ImageLoader.font.draw(sb, "Skor: "+gameWorld.setScorePoint(gameWorld.getScorePoint()), 50, 250);
         //gameWorld.setScorePoint(gameWorld.getScorePoint());
        
        sb.end();
    }
    
    public void update(float delta){
        if(player.getxKord()>i){
            
            
            updateCord();
            
           
            
        }
      
        
    }
    
    public void updateCord(){
       
          bg1Bas = bg3Son;
       bg1Son = bg3Son+width;
       
       bg3Bas = bg2Son;
       bg3Son = bg2Son+width;
       
       bg2Bas = bg1Son;
       bg2Son = bg1Son+width;  
       
       i+=2049;
        
       
       
    }
  
}
