/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game.gameobject;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.imageloader.ImageLoader;

/**
 *
 * @author Onur
 */
public class Boss implements GameObject{
    
    private Vector2 position;
    private Vector2 size;
    
    private Rectangle collisionRect;
    
    public Boss(){
        position = new Vector2(10000,376);
        size = new Vector2(300,304);
        
        collisionRect = new Rectangle(position.x, position.y, size.x, size.y);
    }

    @Override
    public void render(SpriteBatch sb) {
        
        sb.begin();
        
        sb.draw(ImageLoader.bossRegion, position.x, position.y, size.x, size.y);
        
        sb.end();
        
    }

    @Override
    public void update(float delta) {
       
        collisionRect.x = position.x;
        collisionRect.y = position.y;
        collisionRect.width = size.x;
        collisionRect.height = size.y;
        
    }
    
    public Rectangle getCollisionRect(){
        return collisionRect;
    }
    
    public void setCollisionRect(Rectangle collisionRect){
        this.collisionRect = collisionRect;
    }
    
}
