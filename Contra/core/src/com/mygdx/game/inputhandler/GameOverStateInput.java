/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game.inputhandler;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.mygdx.game.states.GameOverState;
import com.mygdx.game.states.PlayState;

/**
 *
 * @author Onur
 */
public class GameOverStateInput implements InputProcessor{
    
    private GameOverState gameOverState;
    
    public GameOverStateInput(GameOverState gameOverState){
        
        this.gameOverState=gameOverState;
        
        
    }
    
    @Override
    public boolean keyDown(int keycode) {
        switch(keycode){
            case Input.Keys.ENTER:
                gameOverState.getSm().pushState(new PlayState(gameOverState.getSm()));
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
