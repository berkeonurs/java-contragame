/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game.gameobject;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.mygdx.game.imageloader.ImageLoader;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Onur
 */
public class Player implements GameObject{
    
    private float xKord;
    private float yKord;
    private float width;
    private float height;
    private float speed;
    private float maxSpeed,minSpeed;
    private float fireSpeed;
    
    private Rectangle collisionRect;
   
    
    private boolean left=false,right=false,moveUp=false,fire=false;
    private boolean moveWithDirection=false;
    
    
    
    public Player( float xKord, float yKord, float width, float height){
        this.xKord=xKord;
        this.yKord=yKord;
        this.width=width;
        this.height=height;
        
        speed=5;
        fireSpeed=5;
        maxSpeed=12;
        minSpeed=0;
        
        collisionRect = new Rectangle(xKord, yKord, width, height);
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        
        sb.draw(ImageLoader.reelPlayerRegion, xKord, yKord, width, height);
        
        
        sb.end();
    }

    @Override
    public void update(float delta) {
        move();
        
        collisionRect.x = xKord;
        collisionRect.y = yKord;
        collisionRect.width = width;
        collisionRect.height = height;
        
       
    }
    
     public Rectangle getCollisionRect(){
        return collisionRect;
    }
    
    public void setCollisionRect(Rectangle collisionRect){
        this.collisionRect = collisionRect;
    }
   
    public void move(){
        if(left){
            xKord-=speed;
        }
        if(right){
             xKord+=speed;
        }
        if(moveUp){
            
            
            
            
            
            moveUp=false;
            yKord-=175;
            
            
            
        }
        
    }
    
    
    
    public void stop(){
        yKord+=175;
    }
    
    
    
    
    
    
    
    public void fire(){
        
    }
    public void esc(){
        
    }
    
    public boolean isLeft(){
        return left;
    }
    
    public void setLeft(boolean left){
        this.left=left;
    }
    
    public boolean isRight(){
        return right;
    }
    
    public void setRight(boolean right){
        this.right=right;
    }
    
    
    public float getxKord(){
        return xKord;
    }
    
    public void setxKord(float xKord){
        this.xKord=xKord;
    }
    
    public float getyKord(){
        return yKord;
    }
    
    public void setyKord(float yKord){
        this.yKord=yKord;
    }
    
    public float getSpeed(){
        return speed;
    }
    
    public void setSpeed(float speed){
        this.speed=speed;
    }
    
    public boolean getmoveUp(){
        return moveUp;
    }
    
    public void setmoveUp(boolean moveUp){
        
        this.moveUp=moveUp;
        
    }
    
    public boolean getFire(){
        return fire;
    }
    
    public void setFire(boolean fire){
        this.fire=fire;
    }
    
    
    
    
    
    
}
