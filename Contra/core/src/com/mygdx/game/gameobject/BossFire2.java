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
public class BossFire2 implements GameObject{
    
    private Vector2 position;
    private Vector2 size;
    private Vector2 speed;
    
    private Rectangle collisionRect;
    
    public BossFire2(){
        position = new Vector2(10400,400);
       
        size = new Vector2(60,60);
        speed = new Vector2(-700,0);
        
        collisionRect = new Rectangle(position.x, position.y, size.x, size.y);
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        
        sb.draw(ImageLoader.bossFireRegion2, position.x, position.y, size.x, size.y);
        
        sb.end();
    }

    @Override
    public void update(float delta) {
        position.add(speed.cpy().scl(delta));
        
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
