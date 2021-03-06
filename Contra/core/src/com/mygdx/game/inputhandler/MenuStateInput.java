/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game.inputhandler;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.mygdx.game.buttons.Button;
import com.mygdx.game.states.MenuState;
import com.mygdx.game.states.PlayState;

/**
 *
 * @author Onur
 */
public class MenuStateInput implements InputProcessor{
    
    private MenuState menuState;
    
    public MenuStateInput(MenuState menuState){
        
        this.menuState=menuState;
        
        
    }

    @Override
    public boolean keyDown(int keycode) {
        
        switch(keycode){
            case Input.Keys.ENTER:
                menuState.getSm().pushState(new PlayState(menuState.getSm()));
                break;
            default:
                break;
        }
        
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        
        if(menuState.getPlayButton().getButtonRect().contains(screenX,screenY)){
            menuState.getSm().pushState(new PlayState(menuState.getSm()));
        }
        
        
        
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
