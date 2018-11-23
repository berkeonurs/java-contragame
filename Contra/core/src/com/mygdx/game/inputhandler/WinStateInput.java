/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game.inputhandler;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.mygdx.game.states.PlayState;
import com.mygdx.game.states.WinState;

/**
 *
 * @author Onur
 */
public class WinStateInput implements InputProcessor{
    
    private WinState winState;
    
    public WinStateInput(WinState winState){
        this.winState=winState;
    }

    @Override
    public boolean keyDown(int keycode) {
        switch(keycode){
            case Input.Keys.ENTER:
                winState.getSm().pushState(new PlayState(winState.getSm()));
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
