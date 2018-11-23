/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game.handler;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.imageloader.ImageLoader;
import com.mygdx.game.states.PlayState;
import com.mygdx.game.gameobject.GameWorld;

/**
 *
 * @author Onur
 */
public class ScoreDrawer {
    
    private PlayState playState;
    public ScoreDrawer(PlayState playState){
        
        this.playState=playState;
        
    }

    
    
    public void render(SpriteBatch sb){
        sb.begin();
        
        ImageLoader.font.draw(sb,"Score: ",playState.getCam().position.x-600,75);
        ImageLoader.font.draw(sb, String.valueOf(playState.getGameWorld().getScorePoint()), playState.getCam().position.x-425, 75);
        ImageLoader.font.draw(sb,"Health: ",playState.getCam().position.x-600,125);
        ImageLoader.font.draw(sb, String.valueOf(playState.getGameWorld().getPlayerHealth()), playState.getCam().position.x-400, 125);
        
        sb.end();
    }
}
