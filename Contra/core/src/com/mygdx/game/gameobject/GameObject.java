/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game.gameobject;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 *
 * @author Onur
 */
public interface GameObject {
    
    public void render(SpriteBatch sb);
    
    public void update(float delta);
    
}
