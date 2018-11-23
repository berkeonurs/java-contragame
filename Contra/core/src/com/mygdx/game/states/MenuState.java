/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.buttons.Button;
import com.mygdx.game.imageloader.ImageLoader;
import com.mygdx.game.inputhandler.MenuStateInput;

/**
 *
 * @author Onur
 */
public class MenuState extends State{
    
    private StateManager sm;
    private Button playButton;

    public MenuState(StateManager sm) {
        super(sm);
        
        this.sm=sm;
        
        Gdx.input.setInputProcessor(new MenuStateInput(this));
        playButton = new Button(285,500,ImageLoader.playButtonRegion);
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(camera.combined);
        sb.begin();
        sb.draw(ImageLoader.bgRegion, 0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        
        
        
        sb.end();
        playButton.render(sb);
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
    
    public Button getPlayButton(){
        return playButton;
    }
    
    public void setPlayButton(Button playButton){
        this.playButton = playButton;
    }
    
}
