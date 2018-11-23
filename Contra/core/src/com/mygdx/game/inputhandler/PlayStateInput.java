/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game.inputhandler;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputProcessor;
import com.mygdx.game.imageloader.ImageLoader;
import com.mygdx.game.states.MenuState;
import com.mygdx.game.states.PlayState;
import com.mygdx.game.states.StateManager;
import java.awt.event.KeyEvent;

/**
 *
 * @author Onur
 */

public class PlayStateInput implements InputProcessor{
    private PlayState playState;
    public PlayStateInput(PlayState playState){
        this.playState=playState;
    }
    
    

    @Override
    public boolean keyDown(int keycode) {
        
        
        switch(keycode){
            case Keys.LEFT:
                playState.getGameWorld().getPlayer().setLeft(true);
                break;
            case Keys.RIGHT:
                playState.getGameWorld().getPlayer().setRight(true);
                break;
            case Keys.UP:
                playState.getGameWorld().getPlayer().setmoveUp(true);
                
                
                break;     
            case Keys.SPACE:
                playState.getGameWorld().shoot();
               // System.out.println(" space basildi."); 
                break; 
            case Keys.ESCAPE:
                playState.getSm().pushState(new MenuState(playState.getSm()));
                break;
            
            default:
                break;
        }
        
        return false;
    }
    

    @Override
    public boolean keyUp(int keycode) {
        
        switch(keycode){
            case Keys.LEFT:
                playState.getGameWorld().getPlayer().setLeft(false);
                break;
            case Keys.RIGHT:
                playState.getGameWorld().getPlayer().setRight(false);
                break;
            case Keys.UP:
                playState.getGameWorld().getPlayer().stop();
                break;     
            case Keys.SPACE:
                
                break;    
            default:
                break;
        }
        
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
    
    
}
