/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.imageloader.ImageLoader;
import com.mygdx.game.inputhandler.WinStateInput;

/**
 *
 * @author Onur
 */
public class WinState extends State{
    
    private StateManager sm;

    public WinState(StateManager sm) {
        super(sm);
        this.sm=sm;
        
        Gdx.input.setInputProcessor(new WinStateInput(this));
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(camera.combined);
        sb.begin();
        sb.draw(ImageLoader.winRegion, 0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        
        
        
        sb.end();
    }

    @Override
    public void update(float delta) {
        
    }

    @Override
    public void handleInput() {
        
    }
    
     public StateManager getSm(){
        return sm;
    }
    
}
