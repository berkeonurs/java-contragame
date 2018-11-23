/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game.collision;

import com.mygdx.game.gameobject.Boss;
import com.mygdx.game.gameobject.Bot;
import com.mygdx.game.gameobject.Fire;

/**
 *
 * @author Onur
 */
public class Collision {
    
    public static boolean isThereCollision(Bot bot, Fire fire){
        
        if(bot.getCollisionRect().overlaps(fire.getCollisionRect())){
          
            return true;
        }
        
        
         
        
        return false;
    }
    
   
    
}
