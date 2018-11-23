/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 *
 * @author Onur
 */
public abstract class State {
    protected OrthographicCamera camera;
    
    protected StateManager sm;
    public State(StateManager sm){
        this.sm=sm;
        camera = new OrthographicCamera();
        camera.setToOrtho(true, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
    }
    
    public abstract void render(SpriteBatch sb);
    
    public abstract void update(float delta);
    
    public abstract void handleInput();
    
}
