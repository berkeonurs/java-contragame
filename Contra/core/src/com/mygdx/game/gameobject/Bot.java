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
public class Bot implements GameObject
{
    
    private Vector2 position;
    private Vector2 size;
    private Vector2 speed;
    private Player player;
    
    
    private Rectangle collisionRect;
    
    public Bot(Player player){
        this.player = player;
        position = new Vector2(player.getxKord()+1000,500);
        
        size = new Vector2(100,175);
        speed = new Vector2(-100,0);
        
        collisionRect = new Rectangle(position.x, position.y, size.x, size.y);
    }
    
    
    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        
        sb.draw(ImageLoader.botRegion, position.x, position.y, size.x, size.y);
        
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
