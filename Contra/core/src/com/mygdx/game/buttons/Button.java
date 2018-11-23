/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game.buttons;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.mygdx.game.gameobject.GameObject;
import com.mygdx.game.imageloader.ImageLoader;

/**
 *
 * @author Onur
 */
public class Button implements GameObject{
    
    private TextureRegion buttonImage;
    private float xKord,yKord,width,height;
    
    private Rectangle buttonRect;
    
    public Button(float xKord, float yKord, TextureRegion buttonImage){
        
        this.buttonImage=buttonImage;
        this.xKord=xKord;
        this.yKord=yKord;
        width=285;
        height=45;
        
        buttonRect = new Rectangle(xKord, yKord, width, height);
        
        
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        
        sb.draw(buttonImage, xKord, yKord,width,height);
        
        sb.end();
    }

    @Override
    public void update(float delta) {
        
    }
    public Rectangle getButtonRect(){
        return buttonRect;
    }
    
    
    
}
